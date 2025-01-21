package com.yedam;
import java.util.Scanner;

public class Todo {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int balance = 0; // 예금액
		
		while(true) {
		System.out.println("1. 입금 2. 출금 3. 잔액조회 4. 종료 ");
		System.out.println("메뉴를 선택하세요.>");
		//int num = scn.nextInt();
		int num = Integer.parseInt(scn.nextLine());
		// String str = scn.nextLine();
		
		if (num == 1) {
			
			// 입금
			System.out.println("금액을 입력하세요.>");
			balance = Integer.parseInt(scn.nextLine());
			
		} else if (num == 2) {
			
			// 출금
			
		} else if (num == 3) {
			
			// 잔액조회
			System.out.printf("현재 잔액은 %d입니다.\n", balance);
			
		} else {
			
			// 종료
			System.out.println("종료하고 처음으로 돌아갑니다.");
			break;
			
			
		}
		
		
		System.out.println("end of program");
		//System.out.printf("입력한 문자는 %s", str);
		}
		
	}

}
