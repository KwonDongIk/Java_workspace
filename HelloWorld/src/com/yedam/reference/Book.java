package com.yedam.reference;


public class Book {
	// 필드
	private String bookName;
	private String bookWriter;
	private String bookCompany;
	private int bookPrice;

	//public, default, private => 접근 제한자(Access Modifier)
	//생성자 선언
	Book(String bookName, String bookWriter, String bookCompany, int bookPrice){
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookCompany = bookCompany;
		this.bookPrice = bookPrice;
	}
	
	void printInfo() {
		System.out.printf("책 이름은 %s, 저자는 %s, 출판사는 %s, 책 가격은 %d원 입니다.\n",bookName,bookWriter,bookCompany,bookPrice);
	}
	
//	String showBookInfo() {
//		return bookName + "  " + bookWriter + "  " + bookPrice;
//	}
	
	void showDetailInfo() {
		// 도서명 : 이것이 자바다   출판사 : 한빛미디어
		// 저자 : 신용권           가격 : 25000원
		System.out.printf("도서명 : %10s\t\t출판사 : %6s\n저자 : %3s\t\t\t가격 : %5d원\n", bookName, bookCompany, bookWriter, bookPrice);
	}
	// setter.
	void setBookPrice(int bookPrice) {
		if (bookPrice < 0) {
			this.bookPrice = 0;
			return;
		}
		this.bookPrice = bookPrice;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	public void setBookCompany(String bookCompany) {
		this.bookCompany = bookCompany;
	}
	
	//getter.
	public String getBookName() {
		return bookName;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public String getBookCompany() {
		return bookCompany;
	}

	public int getBookPrice() {
		return bookPrice;
	}
	


	
	
	
	
	
	
	
	
}
