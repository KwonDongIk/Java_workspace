package com.yedam;
import java.util.*;

/*
 *친구 정보 관리 앱 v.1
 *이름,연락처,성별(남/여) => 홍길동,010-1234-1234,남
 *1. 목록 (이름, 연락처, 성별)
 *2. 등록
 *3. 조회 (성별 / 남을 넣으면 해당자 출력)
 *4. 삭제 (이름)
 *5. 수정 (이름) : 연락처를 수정
 *9. 종료
 *String[] friendAry 크기는 100;
 */

public class Todo2 {
	
	public static void main(String[] args) {
		/////////////////////////////////////////////////////////// 변수
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String[] infoList = new String[100];
		infoList[0] = "홍길동,010-3333-3333,남";
		infoList[1] = "김민지,010-4444-4444,여";
		infoList[2] = "이민석,010-2222-2222,남";
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
					
						if (infoList[i] != null) {
						System.out.println(infoList[i]);
					}
				}
				System.out.println("목록이 모두 출력되었습니다!");
				break;
				
			/////////////////////////////////////////////////////////////////////////////////////////	
			case 2: // 등록 입력
				
				
				System.out.println("이름과 연락처 성별을 입력해주세요! {이름,연락처(ex 010-0000-0000),성별} > ");
				for (int i = 0; i < infoList.length; i++) {
					if (infoList[i] == null) {
						infoList[i] = sc.nextLine();
						break;
					}
				}
				System.out.println("입력 완료 되었습니다!");
				break;
				
			/////////////////////////////////////////////////////////////////////////////////////////				
			case 3: // 조회 (성별 / 남을 넣으면 해당자 출력)
				
				System.out.println("성별을 입력해주시면 해당하는 사람의 정보를 출력해드립니다! > ");
				String gender = sc.nextLine();
				
				for (int i = 0; i < infoList.length; i++) {
					if (infoList[i] != null) {
						//String[] info = infoList[i].split(",");
						if (infoList[i].split(",")[2].equals(gender)) {
							System.out.printf("이름은 %s, 전화번호는 %s, 성별은 %s 입니다.\n",infoList[i].split(",")[0], infoList[i].split(",")[1], infoList[i].split(",")[2]);
						}
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
