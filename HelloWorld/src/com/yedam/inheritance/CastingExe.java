package com.yedam.inheritance;

public class CastingExe {
	public static void main(String[] args) {
		// byte < short < int < long
		
		int n1 = 100;
		long n2 = 0;
		n1 = (int) n2; // 큰 값을 작은 값에 넣을때 casting
		n2 = n1; // promotion 자동 형변환
		
		Friend f1 = new ComFriend(null, null, null, null); // promotion
		//ComFriend f2 = (ComFriend) new Friend(null, null); // casting
		
		f1 = new Friend("홍길동", "010-0000-0001");
		System.out.println(f1.toString());
		
		if (f1 instanceof ComFriend) {
		ComFriend f2 = (ComFriend) f1;
		System.out.println(f2.showInfo());
		} else {
			System.out.println("형변환 못함.");
		}
		
		//System.out.println(f2.showInfo());
	}

}
