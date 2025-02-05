package com.yedam.interfaces.emp;

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
		
		return false;
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		
		return false;
	}

	@Override
	public boolean removeEmp(int empNo) {
		
		return false;
	}

	@Override
	public Employee[] search(Employee emp) {
		
		Employee[] result = new Employee[10];
		int idx = 0;
		
		for(int i = 0; i < employees.length; i++) {
			if(employees[i] != null && employees[i].getEmpName().indexOf(emp.getEmpName()) != -1) {
				result[idx] = employees[i];
				idx++; // 0부터 1씩 증가되도록
			}
		}
		
		return result;
	}
	
	

}
