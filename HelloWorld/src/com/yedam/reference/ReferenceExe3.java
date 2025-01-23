package com.yedam.reference;
import java.util.*;

public class ReferenceExe3 {
	public static void main(String[] args) {
		exe();
		
	}// main
	
	public static void exe() {
		Scanner sc = new Scanner(System.in);
		// 이름, 연락처, 성별 => 100개 공간
		String[][] friends = new String[100][3];
		friends[0][0] = "홍길동";
		friends[0][1] = "010-1111-1111";
		friends[0][2] = "남";
		friends[1] = new String[] {"김민수", "010-2222-2222", "남"};
		
		System.out.println("이름을 입력하세요! > ");
		String name = sc.nextLine();
		System.out.println("연락처를 입력하세요! > ");
		String phone = sc.nextLine();
		System.out.println("성별을 입력하세요! > ");
		String gender = sc.nextLine();
		
		friends[2][0] = name;
		friends[2][1] = phone;
		friends[2][2] = gender;
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i][1] != null) {
				System.out.printf("이름은 %s 연락처는 %s 이고 성별은 %s 입니다.\n",friends[i][0],friends[i][1],friends[i][2]);
			}
		}
	}

}
