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
		EmpDAO dao = new EmpListExe(); // new EmpListExe() <- 컬렉션
		
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
				System.out.println("급여 >> ");
				int sal = Integer.parseInt(sc.nextLine());
				
				if(dao.modifyEmp(new Employee(empNo, "", tel, hdate, sal))) {
					System.out.println("수정 완료");
				} else {
					System.out.println("** 오류 **");
				}
				
				break; // end case2
				
				
				
			case 3:
				
			case 4:
				
			case 9:
				
			default:
				
			}
		}
		System.out.println("END");
		
	} // main

}
