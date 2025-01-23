package com.yedam.reference;
import java.util.*;

public class Book {
	String bookName;
	String bookWriter;
	String bookCompany;
	int bookPrice;

	//생성자 선언
	Book(String bookName, String bookWriter, String bookCompany, int bookPrice){
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookCompany = bookCompany;
		this.bookPrice = bookPrice;
	}
	
	void printInfo() {
		System.out.printf("책 이름은 %s, 저자는 %s, 출판사는 %s, 책 가격은 %d 입니다.\n",bookName,bookWriter,bookCompany,bookPrice);
	}
	


	
	
	
	
	
	
	
	
}
