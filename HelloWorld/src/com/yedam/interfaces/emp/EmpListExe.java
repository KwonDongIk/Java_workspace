package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.List;

/*
 * 컬렉션 활용
 */

public class EmpListExe implements EmpDAO{
	
	List<Employee> empList = new ArrayList<Employee>(); // 저장공간

	@Override
	public boolean registerEmp(Employee emp) {
		
		return empList.add(emp); // 등록
		
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		
		for(int i = 0; i < empList.size(); i ++) {
			// 사원번호 비교
			if(empList.get(i).getEmpNo() == emp.getEmpNo()) {
				empList.get(i).setTelNo(emp.getTelNo());
				empList.get(i).setHireDate(emp.getHireDate());
				empList.get(i).setSalary(emp.getSalary());
				return true; // 정상 수정
			}
		}
		return false; // 수정 완료 못함
	}

	@Override
	public boolean removeEmp(int empNo) {
		
		return false;
	}

	@Override
	public Employee[] search(Employee emp) {
		
		return null;
	}
	

}
