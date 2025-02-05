package com.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * 컬렉션 활용
 */

public class EmpListExe implements EmpDAO{
	
	List<Employee> empList = new ArrayList<Employee>(); // 저장공간
	
	// 생성자
	public EmpListExe() {
		// 초기값
		empList.add(new Employee(1001, "홍길동", "432-2110"));
		empList.add(new Employee(1002, "홍길서", "432-2111"));
		empList.add(new Employee(1003, "홍길남", "432-2112"));
		empList.add(new Employee(1004, "홍길북", "431-0000", "1999-09-09", 500));
	}

	@Override
	public boolean registerEmp(Employee emp) {
		
		return empList.add(emp); // 등록
		
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		for(int i = 0; i < empList.size(); i ++) {
			// 사원번호 비교
			if(empList.get(i).getEmpNo() == emp.getEmpNo()) {
				// 연락처 ""이 아닐때 변경
				if(!emp.getTelNo().equals("")) {
					
					empList.get(i).setTelNo(emp.getTelNo());
				}
				
				try 
				{
					// 값을 변경안하려고 "" 일경우 1900-00-00
				
				if (!emp.getHireDate().equals(sdf.parse("1900-00-00"))) 
					
					empList.get(i).setHireDate(emp.getHireDate());}
				
				catch(ParseException e) {
					
					e.printStackTrace();
				}
				
				if(emp.getSalary() != 0) {
				
					empList.get(i).setSalary(emp.getSalary());
				}
				return true; // 정상 수정
			}
		}
		return false; // 수정 완료 못함
	}

	@Override
	public boolean removeEmp(int empNo) {
		
		for(int i = 0; i < empList.size(); i ++) {
			
			if(empList.get(i).getEmpNo() == empNo) {
				empList.remove(i); // 삭제
				return true;
				
			}
		}
		
		return false;
	}

	@Override
	public Employee[] search(Employee emp) { // sal 보다 급여가 많은
		
		Employee[] result = new Employee[10];
		int idx = 0;
		
		for(int i = 0; i < empList.size(); i++) {
			if(empList.get(i).getEmpName().indexOf(emp.getEmpName()) != -1) {
				result[idx] = empList.get(i);
				idx++; // 0부터 1씩 증가되도록
			}
		}
		
		return result;
	}
	

}
