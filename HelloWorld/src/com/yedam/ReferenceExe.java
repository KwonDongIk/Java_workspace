package com.yedam;

import com.yedam.reference.*;


public class ReferenceExe {
	public static void main(String[] args) {
		
		ReferenceExe1.main(args); // static 메소드는 클래스, 메소드()
		
		com.yedam.reference.ReferenceExe1 ref1;
		
		
		
		ref1 = new ReferenceExe1();
		ref1.method1(); // public , private 접근제한
	}

}
