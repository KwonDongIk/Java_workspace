package com.yedam;

import java.util.Scanner;

public class Todo3 {
	public static void main(String[] args) {
/////////////////////////////////////////////////////////// 변수
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String[][] infoList = new String[100][3];
//		infoList[0] = "홍길동,010-3333-3333,남";
//		infoList[1] = "김민지,010-4444-4444,여";
//		infoList[2] = "이민석,010-2222-2222,남";
///////////////////////////////////////////////////////////
		while (run) {
		
			System.out.println("********************친구 정보 관리 앱 Version 0.1********************");
			System.out.println("1. 목록 (이름, 연락처, 성별) 2. 등록  3. 조회 4. 삭제 5. 수정 9. 종료");
			System.out.println("목록을 선택하십시요. > ");
		
			int menu = Integer.parseInt(sc.nextLine());
		
			switch (menu) {
/////////////////////////////////////////////////////////////////////////////////////////
			case 1: // 목록 (이름, 연락처, 성별) 출력 볼수있음
			
			for (int i = 0; i < infoList.length; i++) {
				
				if (infoList[i] != null && infoList[i][0] != null) {
					System.out.printf("이름은 %s이고 연락처는 %s 이고 성별은 %s 입니다.\n",
										infoList[i][0],infoList[i][1],infoList[i][2]);
					
				}
			}
			break;
			
/////////////////////////////////////////////////////////////////////////////////////////	
			case 2: // 등록 입력
			
				System.out.println("이름을 입력하세요! > ");
				String name = sc.nextLine();
				System.out.println("연락처를 입력하세요! > ");
				String phone = sc.nextLine();
				System.out.println("성별을 입력하세요! > ");
				String gender = sc.nextLine();
				
				for (int i = 0; i < infoList.length; i++) {
					if(infoList[i][0] == null) {
						infoList[i][0] = name;
						infoList[i][1] = phone;
						infoList[i][2] = gender;
						break;
					}
				}
				System.out.println("입력 완료 되었습니다!");
				break;
			
/////////////////////////////////////////////////////////////////////////////////////////				
			case 3: // 조회 (성별 / 남을 넣으면 해당자 출력)
			
				System.out.println("성별을 입력해주시면 해당하는 사람의 정보를 출력해드립니다! > ");
				String checkGender = sc.nextLine();
				
				for (int i = 0; i < infoList.length; i++) {
					
					if(infoList[i][0] != null && infoList[i][2].equals(checkGender)) {
						System.out.printf("이름은 %s이고 연락처는 %s 이고 성별은 %s 입니다.\n",
											infoList[i][0],infoList[i][1],infoList[i][2]);
						
					}
				
				}
				break;
			
/////////////////////////////////////////////////////////////////////////////////////////	
			case 4: // 삭제 (이름)
			
/////////////////////////////////////////////////////////////////////////////////////////	
			case 5: // 수정 (이름) : 연락처를 수정
			
/////////////////////////////////////////////////////////////////////////////////////////	
			case 9: // 종료
				System.out.println("앱을 종료합니다.");
				run = false;
				break;
/////////////////////////////////////////////////////////////////////////////////////////
			default:
				System.out.println("번호를 다시 입력해주세요! ");
				
			} // switch
				
		} // while
		System.out.println("백그라운드 종료");
	
			
			
	} // main
	
} // class
