package com.yedam.collections;

public class Person {
	// 필드
	private String name;
	private int age;
	private String hobby;
	
	
	// 생성자
	Person(){
		
	}
	
	Person(String name, int age, String hobby){
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	

}
