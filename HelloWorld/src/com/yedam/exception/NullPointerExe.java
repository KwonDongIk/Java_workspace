package com.yedam.exception;

import com.yedam.reference.Student;

public class NullPointerExe {
	
	public static void main(String[] args) {
		
		Student student = null;
		String[] strAry = { "Hello", "World" };
		
		// 예외처리
		try {
			int menu = Integer.parseInt("a");
			strAry[2] = "Nice";
			System.out.println(student.getStudentName());
		
		} catch (NullPointerException e) {
			// NullPointerException || ArrayIndexOutOfBoundsExcetion e
			
			System.out.println("null 값 참조");
			e.printStackTrace();
		
		} catch (NumberFormatException e) {
			
			System.out.println("NumberFormatException 예외");
			
		}
			
//		} catch (ArrayIndexOutOfBoundsException e) {
//			
//			System.out.println("배열의 범위를 초과 ! ");
//			e.printStackTrace();
			
//		} catch (RuntimeException e) {
//			
//			System.out.println("상위 exception은 하위 exception 처리");
//			
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//			
//		}
		System.out.println("End"); // end 끝
	}
}
