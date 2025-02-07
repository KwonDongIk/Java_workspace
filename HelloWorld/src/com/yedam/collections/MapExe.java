package com.yedam.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExe { // Key와 value로 구성된 Map.Entry 객체를 저장하는 구조
	// 키 : 값 => 엔트리
	public static void main(String[] args) {
		
	
		Map<String, Integer> map = new HashMap<String, Integer>(); // 중복된 키는 허용하지 않는다.
		map.put("홍길동", 90);
		map.put("김민수", 80);
		map.put("박은수", 85);
		map.put("박은수", 89);
		
		
		// 키 => 값 반환
		Integer val = map.get("홍길동");
		
		// 키 => set 반환
		Set<String> keys = map.keySet();
		for (String k : keys) {
			System.out.printf("키 : %s, 값 : %d\n", k, map.get(k));
		}
		
		// 키 : 값 (엔트리) 엔트리반환
		Set <Entry<String, Integer>> entry = map.entrySet();
		for(Entry<String, Integer> ent : entry) {
			System.out.printf("키 : %s, 값 : %d\n",ent.getKey(), ent.getValue());
		}
	}

}
