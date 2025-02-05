package com.yedam.interfaces.emp;

import java.util.Scanner;

/*
 * 사원관리 App V.1
 * 실행클래스 : MainExe
 * 인터페이스 활용 (배열, 컬렉션)
 * Employee, EmpAryExe, EmpListExe, EmpDAO(인터페이스)
 */

public class MainExe {
	public static void main(String[] args) {
		
		// scanner, run
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		// 배열, 컬렉션 활용
		EmpDAO dao = new EmpAryExe(); // new EmpListExe() <- 컬렉션 , new EmpAryExe() <- 배열
		
		while(run) {
			
			System.out.println("1. 추가 2. 수정 3. 삭제 4. 조회 9. 종료");
			System.out.println("선택 >> ");
			
			int menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1: // 추가. 사원번호, 이름, 전화번호
				System.out.println("사원번호 >> ");
				int empNo = Integer.parseInt(sc.nextLine());
				System.out.println("이름 >> ");
				String eName = sc.nextLine();
				System.out.println("전화번호 >> ");
				String tel = sc.nextLine();
				
				if(dao.registerEmp(new Employee(empNo, eName, tel))) {
				
					System.out.println("등록 성공");
				}
				break; // end case1
				
				
				
			case 2: // 수정항목 : 전화번호, 입사일자, 급여 + 사원번호
				System.out.println("수정할 사원번호를 입력해주세요. >> ");
				empNo = Integer.parseInt(sc.nextLine());
				System.out.println("전화번호 >> ");
				tel = sc.nextLine();
				System.out.println("입사일자 >> ");
				String hdate = sc.nextLine();
				
				if(hdate.equals("")) {
					hdate = "1900-00-00";
				}
				System.out.println("급여 >> ");
				String salString = sc.nextLine();
				//int sal = Integer.parseInt(salString);
				int sal = 0;
				
				if(!salString.equals("")) {
					//salString = "0";
					sal = Integer.parseInt(salString);
				}
				
				if(dao.modifyEmp(new Employee(empNo, "", tel, hdate, sal))) {
					System.out.println("수정 완료");
				}
				
				break; // end case2
				
				
				
			case 3: // 삭제
				System.out.println("삭제할 사원번호를 입력해주세요. >> ");
				empNo = Integer.parseInt(sc.nextLine());
				
				if(dao.removeEmp(empNo)) {
					System.out.println("삭제완료");
				}
				break; // end case3
				
				
				
			case 4: // 목록 조회
				// 조회조건 (급여 이상)
//				System.out.println("조회하고 싶은 급여 조건 입력 >> ");
//				sal = Integer.parseInt(sc.nextLine());
				
				System.out.println("조회하고 싶은 이름 입력하세요. >> ");
				eName = sc.nextLine();
				
				Employee emp = new Employee();
//				emp.setSalary(sal);
				emp.setEmpName(eName);
				
				// 조회결과
				Employee[] result = dao.search(emp);
				
				System.out.println("사번     이름     연락처     급여");
				System.out.println("-----------------------------");
				
				for(Employee empl : result) {
					if(empl != null) {
						System.out.println(empl.empInfo());
					}
				}
				break; // end case4
				
				
				
			case 9:
				System.out.println("프로그램 종료");
				run = false;
				break; // end case9
				
				
			
			default:
				System.out.println("잘못된 선택입니다. 다시 선택하세요.");
				
			}
		}
		System.out.println("END");
		
	} // main

}
