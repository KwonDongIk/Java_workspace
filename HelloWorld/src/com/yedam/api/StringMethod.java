package com.yedam.api;

public class StringMethod {
	
	static void checkGender(String ssn) {
		// 성별을 출력, "남" or "여"
		
		char gender = 0;
		
		if(ssn.indexOf("-") > 0) {
			
			gender = ssn.charAt(7);
		
		} else {
		
			gender = ssn.charAt(6);
		}
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남");
			break;
		case '2':
		case '4':
			System.out.println("여");
			break;
		default:
			System.out.println("ERROR");
		}
	}
	
	static void checkExtension(String file) {
		
		// 파일의 확장자는 jpg or mp3 , hwp 입니다.
		String extension = file.substring(file.indexOf(".") + 1);
		System.out.println(extension);
		
	}
	
	static void getLength(String str) {
		// 문장의 길이는 7글자입니다.
		int leng = str.trim().length();
		System.out.printf("문자열의 길이는 %d글자입니다.\n",leng);
		
	}

}
