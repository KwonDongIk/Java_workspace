package com.yedam.interfaces.emp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

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
		
		return false;
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		
		String query = "insert into tbl_employees ";
		query += "values (" + emp.getEmpNo() + ", " + emp.getEmpName() + ", " + emp.getTelNo() + ", "
							+ emp.getHireDate() + ", " + emp.getSalary() + ")";
		
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
	}

	@Override
	public boolean removeEmp(int empNo) {
		
		return false;
	}

	@Override
	public List<Employee> search(Employee emp) {
		
		List<Employee> empList = new ArrayList<>();
		
		try {
			Statement stmt = getConnect().createStatement();
			ResultSet rs = stmt.executeQuery("select * from tbl_employees");
			
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
