package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.inheritance.ComFriend;
import com.yedam.inheritance.Friend;
import com.yedam.reference.Student;

/*
 * String[] StrAry;
 * Collection 1) List 2) Set 3) Map
 */

public class Exe {
	public static void main(String[] args) {
		// 학생 정보를 저장하는 컬렉션(ArrayList) 선언
		// 3명 추가
		// 출력
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("홍길동", 91, 92));
		students.add(new Student("이길동", 93, 92));
		students.add(new Student("박길동", 91, 94));
		
		for(int i = 0; i < students.size(); i++) {
			System.out.println("이름 : " + students.get(i).getStudentName());
		}
		
		
		
	}
	
	void method() {
		String[] strAry = new String[10]; // 배열
		List<String> strList = new ArrayList<String>(); // 컬렉션
		List<Friend> friends = new ArrayList<Friend>();
		
		friends.add(new Friend("홍길동", "010-9101-3322"));
		friends.add(new ComFriend("김길동", "010-3495-2965", "국민은행", "신용보증팀"));
		
		friends.remove(new Friend("홍길동", "010-9101-3322"));
		System.out.println("friends 크기 : " + friends.size());
		
		System.out.println(friends.get(1).showInfo());
		
		// 추가
		strList.add("안녕하세여");
		strList.add("Hello");
		strList.add("반갑습니다");
		System.out.println("strList 크기 : " + strList.size());
		
		// 삭제
//		strList.remove(0);
//		strList.remove("Hello");
		System.out.println("strList 크기 : " + strList.size());
		
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	} // method

}
