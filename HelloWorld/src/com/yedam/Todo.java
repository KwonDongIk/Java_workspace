package com.yedam;
import java.util.Scanner;

public class Todo {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int balance = 0; // 예금액
		int sum = 0; // 예금액 중첩 sum 선언
		int withdraw = 0; // 출금액
		
		while(true) {
		System.out.println("1. 입금 2. 출금 3. 잔액조회 4. 종료 ");
		System.out.println("메뉴를 선택하세요.>");
		//int num = scn.nextInt();
		int num = Integer.parseInt(scn.nextLine());
		// String str = scn.nextLine();
		
		if (num == 1) {
			
			// 1. 입금
			System.out.println("입금할 금액을 입력하세요.>");
			balance = Integer.parseInt(scn.nextLine());
			if (sum + balance > 100000) {
				System.out.println("입금 금액 초과입니다.");
				continue;
			}
			sum += balance;
			System.out.println("입금 완료");
			
		} else if (num == 2) {
			
			// 2. 출금
			System.out.println("출금할 금액을 입력하세요.>");
			withdraw = Integer.parseInt(scn.nextLine());
			if (sum - withdraw < 0) {
				System.out.println("잔액 부족입니다.");
				continue;
			}
			sum -= withdraw;
			System.out.println("출금 완료");
			
		} else if (num == 3) {
			
			// 3. 잔액조회
			System.out.printf("현재 잔액은 %d원입니다.\n", sum);
			
		} else {
			
			// 4. 종료
			System.out.println("종료합니다.");
			break;
					
		}
		System.out.println("처음화면으로 돌아갑니다.\n");
		//System.out.printf("입력한 문자는 %s", str);
		}
	}
}
