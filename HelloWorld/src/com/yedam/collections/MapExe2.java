package com.yedam.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExe2 {
	public static void main(String[] args) {
		// map collection
		
		// 객체 타입을 값의 형태로..
		Map<String, Person> family = new HashMap<String, Person>();
		family.put("아버지", new Person("홍기동", 45, "낚시"));
		family.put("어머니", new Person("홍미동", 40, "축구"));
		family.put("아들", new Person("홍이동", 15, "아이스하키"));
		family.put("딸", new Person("홍삼동", 9, "골프"));
		
		Person result = family.get("아버지");
		System.out.println("취미는 " + result.getHobby());
	}

}
