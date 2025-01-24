package com.yedam.reference;

public class Calculator {
	
	
	public Book getBookInfo(String btitle, Book[] bookRepo) {
//		Book[] bookRepo = {new Book("이것이 C언어다","이용권","홍릉",19900),
//						   new Book("이것이 초밥이다","김초밥","초밥",50000),
//						   new Book("이것이 맛있다","요리사","요리왕",70000)};
		
		// 배열 검색
		for (int i = 0; i < bookRepo.length; i ++) {
			if (bookRepo[i].getBookName().equals(btitle)) {
				return bookRepo[i];
			}
		}
		return null;
	}
	
	// 1 ~ 100 사이의 임의 값을 n 개 반환
	public int[] randomAry(int n) {
		int[] result = new int[n];
		
		for (int i = 0; i < result.length; i ++) {
			result[i] = (int) (Math.random()*100) + 1;
		}
		return result;
		
	}
	//////////////////////////////////////
	public int getMax(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}
	//////////////////////////////////////
	public void printStar(int times) {
		for (int i = 1; i <= times; i++) {
			printStar(i, "*");
			System.out.println();
		}
	}
	
	 // 별 출력하는 메소드
	public void printStar(int times, String types) { // 매개변수.
		for(int i = 1; i <= times; i++) {
		
			System.out.print(types);
		}
	}
	//////////////////////////////////////
	private void printStar() {
		// TODO Auto-generated method stub
		
	}

	// 메소드 오버로딩
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public double sum(double num1, double num2) {
		return num1 + num2;
	}
	//////////////////////////////////////
	public int sum(int[] intAry) {
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
			
		}
		return sum;
	}

}
