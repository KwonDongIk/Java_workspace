package com.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * 배열 활용
 */

public class EmpAryExe implements EmpDAO{
	
	Employee[] employees = new Employee[10]; // 저장
	
	public EmpAryExe() {
		
		employees[0] = new Employee(9999, "이길동", "000-0000");
		employees[1] = new Employee(8888, "이길웅", "000-0001");
		employees[2] = new Employee(7777, "이길민", "000-0002");
		
		
	}
	@Override
	public boolean registerEmp(Employee emp) {
		
		for(int i = 0; i < employees.length; i++) {
			
			if(employees[i] == null) {
				employees[i] = emp;
				return true; // 등록 완료
			}
		}
		return false; // 등록 불가
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			for(int i = 0; i < employees.length; i ++) {
				// 사원번호 비교
				if(employees[i] != null && employees[i].getEmpNo() == emp.getEmpNo()) {
					// 연락처 ""이 아닐때 변경
					if(!emp.getTelNo().equals("")) {
						
						employees[i].setTelNo(emp.getTelNo());
					}
					
					try 
					{
						// 값을 변경안하려고 "" 일경우 1900-00-00
					
					if (!emp.getHireDate().equals(sdf.parse("1900-00-00"))) 
						
						employees[i].setHireDate(emp.getHireDate());}
					
					catch(ParseException e) {
						
						e.printStackTrace();
					}
					
					if(emp.getSalary() != 0) {
					
						employees[i].setSalary(emp.getSalary());
					}
					return true; // 정상 수정
				}
			}
			return false; // 수정 완료 못함
	}

	@Override
	public boolean removeEmp(int empNo) {
		
		for(int i = 0; i < employees.length; i ++) {
					
				if(employees[i] != null && employees[i].getEmpNo() == empNo) {
					employees[i] = null; // 삭제
					return true;
					
				}
			}
			
			return false;
	}

	@Override
	//public Employee[] search(Employee emp) {
	public List<Employee> search(Employee emp) {
		
		//Employee[] result = new Employee[10];
		//int idx = 0;
		
		List<Employee> result = new ArrayList<Employee>();
		
		for(int i = 0; i < employees.length; i++) {
			if(employees[i] != null && employees[i].getEmpName().indexOf(emp.getEmpName()) != -1) {
				//result[idx] = employees[i];
				// idx++; // 0부터 1씩 증가되도록
				result.add(employees[i]);
			}
		}
		
		return result;
	}
	
	

}
