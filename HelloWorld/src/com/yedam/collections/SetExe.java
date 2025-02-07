package com.yedam.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("홍길동");
		set.add("반갑습니다.");
		set.add("1000");
		set.add(String.valueOf(true));
		
		Iterator<String> iter = set.iterator(); // iterator 담긴 문자열
		while(iter.hasNext()) { // 컬렉션에 요소 있는지 확인
			String result = iter.next(); // 컬렉션의 요소를 반환
			System.out.println(result);
		}
	}

}
