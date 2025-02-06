package com.yedam.api;

public class StringExe {
	public static void main(String[] args) {
		// String str = new String(매개값); byte[]
		
//		String ssn = "980000-1234567";
//		char chr = ssn.charAt(7);
//		
//		switch(chr) {
//		case '1':
//		case '3':
//			System.out.println("남");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여");
//			break;
//		default:
//			System.out.println("ERROR");
//		}
//		
//		
//		String str = new String(new byte[] {72, 101, 108, 108, 111});
//		System.out.println(str);
//		System.out.println(str.charAt(2));
//		
//		byte[] result = str.getBytes(); // 문자열 => byte 배열 타입으로 변환
//		
//		
//		for(byte b : result) {
//			System.out.print(b + " ");
//		}
		no1();
		no2();
		no3();
		
	}
	static void no1() {
		String ssn1 = "9803011111111";
		String ssn2 = "990111-2222222";
		String ssn3 = "030824-3101010";
		StringMethod.checkGender(ssn1);
		StringMethod.checkGender(ssn2);
		StringMethod.checkGender(ssn3);
		
	} // no1
	
	static void no2() {
		String file1 = "C:/temp/flower.jpg";
		String file2 = "D:/web/project/guide.mp3";
		StringMethod.checkExtension(file1);
		StringMethod.checkExtension(file2);
	}
	
	static void no3() {
		String str1 = "   suggest   ";
		String str2 = "  currently  ";
		String str3 = "  particular  ";
		StringMethod.getLength(str1);
		StringMethod.getLength(str2);
		StringMethod.getLength(str3);
		
	}
}
