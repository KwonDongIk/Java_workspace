package com.yedam.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExe { // Key와 value로 구성된 Map.Entry 객체를 저장하는 구조
	// 키 : 값 => 엔트리
	public static void main(String[] args) {
		
	
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 90);
		map.put("김민수", 80);
		map.put("박은수", 85);
		
		// 키 => 값 반환
		Integer val = map.get("홍길동");
		
		// 키 => set 반환
		Set<String> keys = map.keySet();
		for (String k : keys) {
			System.out.printf("키 : %s, 값 : %d\n", k, map.get(k));
		}
	}

}
