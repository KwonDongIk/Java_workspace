package com.yedam;
import java.util.Scanner;
/*
 * 학생점수 입력 받아서 배열 저장 
 * 최고점수, 평균, 합계점수 출력
 */


public class ForLoopExe1 {
	
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[3]; // 정수 배열 []
		
		while (run) {
			System.out.println("1. 학생점수 입력 2. 최고점수 3. 평균, 합계점수 4. 종료");
			System.out.println("메뉴 선택 > ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				for (int i = 0; i < scores.length; i++) {
					
					System.out.println("학생점수를 입력해주세요! > ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
				System.out.println("입력완료 되었습니다.");
				break;
				
			case 2: // 최고점
				int max = 0;
				
				for (int i = 0; i < scores.length; i++) {
					
					if (max < scores[i]) {
					
						max = scores[i];
					}
				}
				System.out.printf("최고 점수는 %d 점입니다.\n",max);
				
				break;
				
			case 3: // 합계점수와 평균
				int sum = 0; // 합계점수
				double avg = 0; // 평균
				
				for (int i = 0; i < scores.length; i++) {
					
					sum += scores[i];
				}
				avg = sum / scores.length;
				
				
				
				
				System.out.printf("합계점수는 %d 점이고 평균은 %.2f 점 입니다.\n",sum, avg);
				
				
				
				break;
				
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break; // 각 case 문의 실행을 멈추고 switch 문을 빠져나감
			default: // 기본 실행문
				System.out.println("메뉴를 다시 선택하세요.");
			}
			
		} // end of while
		System.out.println("종료되었습니다.");
	} // end of main
} // end of class
