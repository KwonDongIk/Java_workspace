package com.yedam.reference;
//gender => MEN, WOMEN

public class Student {
	// 필드(속성) : 이름, 영어, 수학
	String studentName;
	int engScore;
	int mathScore;
	Gender gender; // 남, 여, 남자, M

	// 생성자 : 필드의 초기값을 지정해서 인스턴스 생성
	Student() { // 기본생성자 : 매개값이 없는 생성자
		
	}
	
	Student(String studentName, int engScore) {
		this.studentName = studentName;
		this.engScore = engScore;
	}
	
	
	Student(String studentName, int engScore, int mathScore) {
		this.studentName = studentName;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	Student(String studentName, int engScore, int mathScore, Gender gender) {
		this.studentName = studentName;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.gender = gender;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
	// 메소드 (기능)
	void printInfo() {
		System.out.printf("이름은 %s, 영어점수는 %d점 수학점수는 %d점 입니다.\n", studentName, engScore, mathScore);
		System.out.printf("평균은 " + (engScore + mathScore) / 2.0 + "입니다.\n");
	}
	
	// 기능추가 : 평균을 반환
	double avgInfo() {
		return (engScore + mathScore) / 2.0;
	}
	
	
	

}
