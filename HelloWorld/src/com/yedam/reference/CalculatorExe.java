package com.yedam.reference;

public class CalculatorExe {
	public static void main(String[] args) {
		
		Book[] bookRepo1 = {new Book("이것이 C언어다","이용권","홍릉",19900),
				   		   new Book("이것이 초밥이다","김초밥","초밥",50000),
				   		   new Book("이것이 맛있다","요리사","요리왕",70000)};
		
		Calculator cal = new Calculator();
		
		Book author = cal.getBookInfo("이것이 맛있다", bookRepo1);
		if (author != null) {
			author.showDetailInfo();
		} else {
			System.out.println("조회 결과 없습니다.");
		}
		
		int[] randomA = cal.randomAry(5);
		for(int num : randomA) {
			System.out.println(num);
		}
		System.out.println(cal.sum(randomA));
		
		
		
		int[] ary1 = { 14, 23, 11, 14, 24 };
		int[] ary2 = { 33, 23, 6, 12, 9 };
		
		int max = cal.getMax(cal.sum(ary1), cal.sum(ary2));
		System.out.println("배열 합이 큰 값은 : " + max);
		
		
		cal.printStar(5);
		
		
		
//		int result = cal.sum(new int[] {10,20,30,40});
//		System.out.println("\n" + result);
	}

}
