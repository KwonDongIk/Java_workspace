package com.yedam.reference;
import java.util.*;
/*
 * << 도서명, 저자, 출판사, 판매가격 >> 을 담을 Book 클래스 선언해야함
 * method // 1. 도서 전체목록 2. 도서 등록 3. 조회(출판사 명을 넣으면 해당하는 도서 출력) 9. 종료
 */

public class BookExe {
	public static void main(String[] args) {
		Book[] bookRepository = new Book[100];
		boolean run = true;
		Scanner sc = new Scanner(System.in);
	
		
		while (run) {
			
			System.out.println("****************************도서관리프로그램입니다.****************************");
			System.out.println("1. 도서 전체목록 2. 도서 등록 3. 조회(출판사 명을 넣으면 해당하는 도서 출력) 9. 종료");
			System.out.println("목록을 선택하십시요. > ");
			
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu){
			/////////////////////////////////////////////////////// 1. 도서 전체목록
			case 1:
				
				for (int i = 0; i < bookRepository.length; i++) {
					if(bookRepository[i] != null) {
						bookRepository[i].printInfo();
					}
				}
				
				
				break;
			/////////////////////////////////////////////////////// 2. 도서 등록
			case 2:
				
				System.out.println("등록할 도서를 입력하십시요. > ");
				String bookName = sc.nextLine();
				System.out.println("등록할 저자를 입력하십시요. > ");
				String bookWriter = sc.nextLine();
				System.out.println("등록할 출판사를 입력하십시요. > ");
				String bookCompany = sc.nextLine();
			    System.out.println("등록할 가격을 입력하십시요. > ");
			    int bookPrice = Integer.parseInt(sc.nextLine());
			    
			    for (int i = 0; i < bookRepository.length; i++) {
			    	if(bookRepository[i] == null) {
			    		bookRepository[i] = new Book(bookName, bookWriter, bookCompany, bookPrice);
			    		break;
			    	}
			    }
			    System.out.println("입력 완료 되었습니다!");
			    
			    break;
				
			/////////////////////////////////////////////////////// 3. 조회(출판사 명을 넣으면 해당하는 도서 출력)	
			case 3:
				System.out.println("출판사명을 입력하면 해당하는 책의 정보들을 출력해드립니다! > ");
				bookWriter = sc.nextLine();
				
				for (int i = 0; i < bookRepository.length; i++) {
					
					if (bookRepository[i] != null && bookRepository[i].bookWriter.equals(bookWriter)) {
						bookRepository[i].printInfo();
					}
				}
				break;
				
				
			////////////////////////////////////////////////////// 9. 종료
			case 9:
			
			}
		}
		
		
	} // main
}
