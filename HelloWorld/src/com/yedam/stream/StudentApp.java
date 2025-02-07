package com.yedam.stream;

/*
 * 학생정보 관리프로그램 v.1
 * 학생 이름, 키, 몸무게, 점수
 */
import java.util.*;
import java.io.*;

public class StudentApp {
	
	Scanner sc = new Scanner(System.in);
	boolean run = true;
	
	public void start() {
		System.out.println("--------------------------------------------");
		System.out.println("1. 학생목록 2. 학생추가 3. 학생삭제 9. 프로그램 종료");
		System.out.println("--------------------------------------------");
		System.out.println("메뉴 선택 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   ");
		
		
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		
		case 1:
			
		case 2:
			
		case 3:
			
		case 9:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못 선택하셨어요.");
		}
		System.out.println("END");
	}

}
