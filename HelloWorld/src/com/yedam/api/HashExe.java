package com.yedam.api;
import java.util.*;

public class HashExe {

	public static void main(String[] args) {
		
		// 컬렉션(List, Set, Map)
		// set  : 중복된 값은 저장불가
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("user01", 100));
		set.add(new Member("user01", 100));
	}
}
