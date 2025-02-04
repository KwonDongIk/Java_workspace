package com.yedam.inheritance;

import java.util.Scanner;

/*
 * 친구목록, 등록, 수정, 삭제
 * 수정 : 이름, 연락처 입력
 */

public class FriendExe {
	// 싱글톤
	// 1. 필드 선언
	private static FriendExe instance = new FriendExe(); // class 소속
	// 2. 생성자 은닉
	private FriendExe() {
		
	}
	// 3. 인스턴스를 반환하는 메소드
	public static FriendExe getInstance() {
		return instance;
	}
	
	
	Friend[] friends = new Friend[100]; // 저장공간
	Scanner sc = new Scanner(System.in);
	
	// 시작메소드
	public void run() {
		boolean run = true;
		
		while(run) {
			System.out.println("**************************************");
			System.out.println("1. 친구목록 2. 등록 3. 수정 4. 삭제 9. 종료");
			System.out.println("메뉴선택 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			
			case 1: // 목록
				friendList();
				break;
			
			case 2: // 등록
				addFriend();
				break;
				
			case 3: // 수정
				editFriend();
				break;
				
			case 4:
				delFriend();
				break;
			
			case 9:
				System.out.println("종료");
				run = false;
				break;
				
			default:
				System.out.println("메뉴 확인");
				
			}
			
		}
	}
	
	
	
	// 추가메소드
	void friendList() {
		boolean isExist = false;
		System.out.println("*************** 친구목록 ***************");
		for(int i = 0; i < friends.length; i ++) {
			if (friends[i] != null) {
//				if (friends[i] instanceof Friend) {
//					System.out.println("이름 : " + friends[i].getFriendName() + " 과 연락처 : " + friends[i].getPhoneNumber());
//				}
				System.out.println(friends[i].showInfo());
				isExist = true;
			}
		}
		if(!isExist) {
			System.out.println(" **** No DATA **** ");
		}
		
	}
	
	
	// 친구 : 이름, 연락처
	// 학교 : 친구, 학교명, 전공정보
	// 회사 : 친구, 회사명, 부서
	void addFriend() {
		System.out.println("1. 친구? 2. 학교 친구에요? 3. 회사 친구에요? 4. 종료");
		System.out.println("선택 >> ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		if(choice < 1 || choice > 4) {
			System.out.println("잘못 입력하셨습니다.");
			addFriend();
			return;
		}
		
		if(choice == 4) {
			
			return;
			
		}
		
		
		
		// 이름, 연락처
		String name = "";
		while(true) {
			System.out.println("이름 입력 >> ");
			name = sc.nextLine();
			if(name.length() >= 2 && name.length() <= 10) {
				break;
			} else {
				System.out.println("이름은 2글자 이상 10글자 이하로 입력하세요.");
			}
		}
		System.out.println("연락처 입력 >> ");
		String phone = sc.nextLine();
		
		Friend friend = null;
		
		if(choice == 1) 
		{
			friend = new Friend(name, phone);
			
		} else if (choice == 2) 
		{
			System.out.println("학교명 입력 >> ");
			String univname = sc.nextLine();
			System.out.println("전공명 입력 >> ");
			String univMajor = sc.nextLine();
			friend = new UnivFriend(name, phone, univname, univMajor);
			
		} else if (choice == 3) 
		{
			System.out.println("회사명 입력 >> ");
			String companyName = sc.nextLine();
			System.out.println("부서명 입력 >> ");
			String department = sc.nextLine();
			friend = new ComFriend(name, phone, companyName, department);
			
		}  else 
		{
			return;
			
		}
		// 빈 공간에 저장
		for (int i = 0; i < friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				System.out.println("** 등록완료 **");
				break;
			}
		}
		
	}
	
	void editFriend() {
		System.out.println("이름을 입력해주세요. >> ");
		String name = sc.nextLine();
		System.out.println("수정할 전화번호를 입력해주세요. >> ");
		String phoneNumber = sc.nextLine();
		boolean isExist = false;
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getFriendName().equals(name)) {
				friends[i].setPhoneNumber(phoneNumber);
				isExist = true;
				System.out.println("수정완료");
				break;
			}
		}
		if(!isExist) {
			System.out.println("일치하는 정보가 없습니다.");
		}
		
	}
	
	void delFriend() {
		System.out.println("이름을 입력해주세요. >> ");
		String name = sc.nextLine();
		boolean isExist = false;
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getFriendName().equals(name)) {
				friends[i] = null ;
				isExist = true;
				System.out.println("삭제완료");
				break;
			}
		
		}
		if(!isExist) {
			System.out.println("일치하는 정보가 없습니다.");
		}
		
	}

}
