package com.yedam.interfaces.emp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/*
 * EmpDAO(인터페이스) 구현하는 클래스
 */

public class EmpDBExe implements EmpDAO{

	Connection getConnect() {
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; // oracle DB의 접속 정보
	String user = "hr";
	String password = "hr";
	Connection conn = null;
	
		try {
			
			conn = DriverManager.getConnection(url, user, password);
		
		} catch(SQLException e) {
			
			e.printStackTrace();
		
		}
		return conn;
	}
	@Override
	public boolean registerEmp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String query = "insert into tbl_employees ";
		query += "values (" + emp.getEmpNo() 
				+ ", '" + emp.getEmpName() 
				+ "', '" + emp.getTelNo() 
				+ "', '" + sdf.format(emp.getHireDate()) 
				+ "', " + emp.getSalary()
				+ ")";
		
		try {
			Statement stmt = getConnect().createStatement();
			int r = stmt.executeUpdate(query);
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
		
	} // End register

	@Override
	public boolean modifyEmp(Employee emp) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String sql = "UPDATE tbl_employees "
					+ "SET tel_no = nvl('" + emp.getTelNo() + "', tel_no), "
					+ "HIRE_DATE = case to_date('" + sdf.format(emp.getHireDate()) + "', 'yyyy-mm-dd')"
					+ " when to_date('1900-01-01', 'yyyy-mm-dd') then hire_date"
					+ "	else to_date('" + sdf.format(emp.getHireDate()) + "', 'yyyy-mm-dd')" 
					+ " end,"
					+ " SALARY = case " + emp.getSalary() + " when 0 then salary else " + emp.getSalary()
					+ " end"
					+ " WHERE emp_no = " + emp.getEmpNo();
		
					
		
		
//		System.out.println(sql);
		
		try {
		
			Statement stmt = getConnect().createStatement();
			int r = stmt.executeUpdate(sql);
			if (r > 0) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false; // 수정 변경 값 없음
	}

	@Override
	public boolean removeEmp(int empNo) {
		String sql = "delete from tbl_employees where emp_no = " + empNo;
		
		try {
			
			Statement stmt = getConnect().createStatement();
			int r = stmt.executeUpdate(sql); // 처리된 건수
			if (r > 0) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Employee> search(Employee emp) {
		
		List<Employee> empList = new ArrayList<>();
		
		try {
			Statement stmt = getConnect().createStatement();
			ResultSet rs = stmt.executeQuery("select * from tbl_employees" + 
					" WHERE emp_name = nvl('" + emp.getEmpName() + "', emp_name) "+ " order by emp_no");
			
			while(rs.next()) {
				Employee empl = new Employee();
				empl.setEmpNo(rs.getInt("emp_no"));
				empl.setEmpName(rs.getString("emp_name"));
				empl.setTelNo(rs.getString("tel_no"));
				empl.setHireDate(rs.getDate("hire_date"));
				empl.setSalary(rs.getInt("salary"));
				empList.add(empl);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return empList;
	}

}
