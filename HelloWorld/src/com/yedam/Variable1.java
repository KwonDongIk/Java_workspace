package com.yedam;

public class Variable1 {
	
	public static void main(String args[]) {
		// int (4byte)
		
		
		int num1 = 1101111;
		byte num2 = 127; // byte (1byte) +- 2 7승
		short num3 = 128; // short (2byte)
		long num4 = 111111111;
		System.out.println(Long.MAX_VALUE);
		
		byte num5 = 20;
		byte result = (byte) (num2 + num5); // 강제 형변환 / 두 가지 변수값 중 큰 타입으로 형변환 됨
		int intResult = num1 + num5;
		System.out.println(intResult);
		System.out.println(result);
		
		// 데이터타입 변수 이름 = 값
		
		int[] intAry = {10, 25, 82, 11};
		String[] strAry = {"Hong", "Park", "Choid"};
		strAry[2] = "Kim";
		
		int[] anotherAry = new int[10];
		for (int i = 0; i < anotherAry.length; i++) {
			anotherAry[i] = (int) (Math.random() * 100); // casting
		}
		
		for(int num : anotherAry) {
			System.out.println(num);
		}
		
		int sum = 0;
		
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println(sum);
		
		
	}
}
