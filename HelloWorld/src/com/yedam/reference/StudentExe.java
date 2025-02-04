package com.yedam.reference;
import java.util.*;

public class StudentExe {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		
		// 상수 선언 final
		final Student std1 = new Student("홍길동", 80, 85); // 인스턴스 생성
//		std1.studentName = "홍길동";
//		std1.engScore = 80;
//		std1.mathScore = 85;
		std1.gender = Gender.MEN;
		
		Student std2 = new Student();
		std2.studentName = "김민수";
		std2.engScore = 85;
		std2.mathScore = 88;
		std2.gender = Gender.MEN;
		
		Student std3 = new Student();
		std3.studentName = "홍정학";
		std3.engScore = 75;
		std3.mathScore = 90;
		std3.gender = Gender.WOMEN;
		
		students[0] = std1;
		students[1] = std2;
		students[2] = std3;
		students[3] = new Student("김민지", 95, 91, Gender.WOMEN);
		
		// 학생의 이름을 입력받는 변수 : studName
		// 학생의 평균을 출력하는 프로그램을 작성
		
		
		System.out.println("학생의 이름을 입력해주세요! > ");
		Scanner sc = new Scanner(System.in);
		String studentName = sc.nextLine();
		
		for (int i = 0; i < students.length; i++) {
//			if(students[i] != null && students[i].avgInfo() >= 85) {
//				students[i].printInfo();
//				
//			}
			
			if(students[i] != null //&& students[i].studentName.equals(studentName)
					&& students[i].gender == Gender.MEN) { // students[i] 배열에서 sc 값과 studentName이 같은지 equals 비교
				//System.out.printf("학생의 평균은 %.2f 입니다.\n", students[i].avgInfo());
				students[i].printInfo();
				
			}
		}
	}
}
