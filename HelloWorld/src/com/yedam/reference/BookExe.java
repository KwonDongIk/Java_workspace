package com.yedam.reference;
import java.util.*;
/*
 * << 도서명, 저자, 출판사, 판매가격 >> 을 담을 Book 클래스 선언해야함
 * method // 1. 도서 전체목록 2. 도서 등록 3. 조회(출판사 명을 넣으면 해당하는 도서 출력) 9. 종료
 */

public class BookExe {
	static Book[] bookRepository = new Book[100];
	// 저장공간에 값을 초기값 생성.
	public static void init() {
		bookRepository[0] = new Book("혼자 공부하는 자바", "신용권", "한빛미디어", 25010);
		bookRepository[1] = new Book("혼자 공부하는 파이썬", "신용길", "한빛미디어", 25020);
		bookRepository[2] = new Book("혼자 공부하는 Golang", "신용고", "한빛미디어", 25030);
		// init
	}
	// 목록출력.
	public static void printList() {
		
		for (int i = 0; i < bookRepository.length; i++) {
			if(bookRepository[i] != null) {
				bookRepository[i].printInfo();
			}
		}
		
	} // printList
	// 도서등록.
	static Scanner sc = new Scanner(System.in);
	public static void addBook() {
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
	} // addBook
	// 조회
	public static void searchList() {
		System.out.println("출판사명을 입력하면 해당하는 책의 정보들을 출력해드립니다! > ");
		String bookCompany = sc.nextLine();
		
		for (int i = 0; i < bookRepository.length; i++) {
			
			if (bookRepository[i] != null && bookRepository[i].getBookCompany().equals(bookCompany)) {
				bookRepository[i].printInfo();
			}
		}
	} // searchList
	// 수정
	public static void modifyBook() {
		System.out.println("등록할 도서를 입력하십시요. > ");
		String bookName = sc.nextLine();
		System.out.println("등록할 가격을 입력하십시요. > ");
	    int bookPrice = Integer.parseInt(sc.nextLine());
	    boolean isExist = false;
	    
	    for (int i = 0; i < bookRepository.length; i++) {
	    	
	    	if (bookRepository[i] != null && bookRepository[i].getBookName().equals(bookName)) {
	    		bookRepository[i].setBookPrice(bookPrice);
	    		System.out.println("수정 완료되었습니다.");
	    		isExist = true;
	    		break; // 수정 완료되면 반복문 종료
	    	}
	    }
	    if(!isExist) {
	    	System.out.println("찾는 도서가 없습니다.");
	    	
	    }
	} // modifyBook
	// 상세조회
	public static void showDetail() {
		System.out.println("도서명 입력하세요. > ");
	    String bookName = sc.nextLine();
//	    isExist = false;
//	    
//	    for (int i = 0; i < bookRepository.length; i++) {
//	    	if (bookRepository[i] != null && bookRepository[i].getBookName().equals(bookName)) {
//	    		bookRepository[i].showDetailInfo(); // 상세출력
//	    		isExist = true;
//	    		break;
//	    	}
//	    }
//	    if(!isExist) {
//	    	
//	    	System.out.println("찾는 도서가 없습니다.");
//	    }
//	    break;
	    Calculator cal = new Calculator();
	    cal.getBookInfo(bookName, bookRepository).showDetailInfo();
	    System.out.println("---------------------------------------------------------");
	}
	
	
	public static void main(String[] args) {
		init(); // 기초데이터 생성.
		boolean run = true;

		while (run) {
			
			System.out.println("**************************************도서관리프로그램입니다.**************************************");
			System.out.println("1. 도서 전체목록 2. 도서 등록 3. 조회(출판사 명을 넣으면 해당하는 도서 출력) 4. 금액 수정 5. 상세조회 9. 종료");
			System.out.println("목록을 선택하십시요. > ");
			
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu){
			/////////////////////////////////////////////////////// 1. 도서 전체목록
			case 1:
				printList();
				break;
			/////////////////////////////////////////////////////// 2. 도서 등록
			case 2:
				addBook();
			    break;
			/////////////////////////////////////////////////////// 3. 조회(출판사 명을 넣으면 해당하는 도서 출력)	
			case 3:
				searchList();
				break;
			////////////////////////////////////////////////////// 4. 금액 수정	
			case 4:
				modifyBook();
			    break;
			////////////////////////////////////////////////////// 5 상세 조회
			case 5:
				showDetail();
			    break;
			////////////////////////////////////////////////////// 9. 종료
			case 9:
				System.out.println("프로그램 종료");
				run = false;
				break;
				
			default:
				System.out.println("없는 목록입니다.");
			
			} // switch
		} // while
		System.out.println("완전 종료합니다.");
		
		
	} // main
}
