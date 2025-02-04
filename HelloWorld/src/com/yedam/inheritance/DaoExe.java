package com.yedam.inheritance;
import java.util.*;
/*
 * 실행클래스(main)
 * mysql
 * oracle
 */
public class DaoExe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		//MysqlDao dao = new MysqlDao();
		OracleDao dao = new OracleDao();
		
		while(run) {
			System.out.println("1. 등록 2. 삭제 3. 조회 9. 종료");
			System.out.println("선택하세요. >> ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: // 등록
				dao.register();
			case 2: // 삭제
				dao.remove();
			case 3: // 조회
				dao.search();
			case 9: // 종료
				run = false;
			}
		}
	}
}
