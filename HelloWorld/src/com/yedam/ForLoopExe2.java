package com.yedam;
import java.util.*;

public class ForLoopExe2 {
	
	public static void main(String[] args) {
		
//		String[] infoAry = "홍길동,80".split(",");
//		System.out.println(infoAry[0]);
//		System.out.println(Integer.parseInt(infoAry[1]));
		
//		System.out.println("이름,점수 값을 입력하세요! ");
//		String userVal = sc.nextLine();
//		String[] studentAry = new String[3];
//		studentAry = userVal.split(" ");
		// String[] infoAry = userVal.split(",");
		
		
//		System.out.println(studentAry[0]);
//		System.out.println(Integer.parseInt(studentAry[1]));
//		System.out.printf("이름은 %s이고 점수는 %s점 입니다.", studentAry[0], studentAry[1]);
		
//		for (int i = 0; i < studentAry.length; i++) {
//			System.out.println(studentAry[i]); // "null != null" 다르다!!!!
//		}
		
		// String userVal = sc.nextLine();
		// studentAry = userVal.split(" ");
		Scanner sc = new Scanner(System.in);
		String searchName = sc.nextLine();
		System.out.println("박두식".equals(searchName)); // 문자열 비교시 equals() 써야함~~
		
		
		String[] studentAry = new String[100];
		studentAry[0] = "김민지,99";  // sample data
		studentAry[1] = "박두식,95";  // sample data
		studentAry[2] = "이용규,90";  // sample data
		boolean run = true;
		
		while (run) {
			System.out.println("1.학생이름,점수 2.최고점수 3. 학생입력(단건) 4. 점수조회(이름) 9.종료");
			System.out.println("선택하십시요 > ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			/////////////////////////////////////////////////////////////////////
			case 1: // 학생이름,점수
				
				for (int i = 0; i < studentAry.length; i++) {
					
					System.out.println("학생이름과 점수를 입력해주세요! > ");
					studentAry[i] = sc.nextLine();
				}
				System.out.println("입력완료 되었습니다.");
				break;
			/////////////////////////////////////////////////////////////////////		
			case 2: // 최고점수
				
				int maxScores = 0;
				
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) { // null 값이 아닐때 출력함~
						if (maxScores < Integer.parseInt(studentAry[i].split(",")[1])) {
							maxScores = Integer.parseInt(studentAry[i].split(",")[1]);
						}
					}
				
				}
				System.out.printf("최고점수는 %d점 입니다.\n\n",maxScores);
				break;
			/////////////////////////////////////////////////////////////////////
			case 3: // 학생 입력 단건
				
				System.out.println("학생이름과 점수를 입력해주세요! > ");
				for (int i = 0; i < studentAry.length; i++) {
					
					
					if (studentAry[i] == null) {
						
					studentAry[i] = sc.nextLine();
					break;
					}
//					else if (studentAry[i] != null) {
//						
//						System.out.println(studentAry[i]);
//						
//					}
				}
				break;
			/////////////////////////////////////////////////////////////////////
			case 4: // 점수조회
				
				System.out.println("점수 조회할 학생 이름을 입력해주세요! > ");
				String nameStudent = sc.nextLine();
				
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) {
						// String[] info = studentAry[i].split(",");
						if (nameStudent.equals(studentAry[i].split(",")[0])) {
							System.out.printf("학생 이름은 %s이고 점수는 %s점 입니다.\n",studentAry[i].split(",")[0],studentAry[i].split(",")[1]);
							
						break;
						}
					}
				}
				break;
			/////////////////////////////////////////////////////////////////////
			case 9: // 종료
				
				System.out.println("종료합니다.");
				run = false;
				break;
				
			default:
				System.out.println("메뉴를 다시 선택하세요. ");
			}
		} // end while
		System.out.println("프로그램 종료");
		
	} // end main

} // class main
