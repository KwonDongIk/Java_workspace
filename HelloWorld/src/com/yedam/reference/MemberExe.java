package com.yedam.reference;

public class MemberExe {
	// 싱글톤 객체 생성
	// 1. 필드를 static 선언
	private static MemberExe instance = new MemberExe(); // static 필드
	// 2. 생성자 은닉
	private MemberExe() {
		
	}
	// 3. 인스턴스를 제공해주는 메소드 getInstance();
	public static MemberExe getInstance() {
		return instance;
	}
	
	static Member[] members= {//
			new Member("user01", "1111", "홍길동"),
			new Member("user02", "2222", "홍김동"),
			new Member("user03", "3333", "홍기동")
	};
	
	
	public static String login(String id, String password) {
		for(int i = 0; i < members.length; i ++) {
			if(members[i] != null && members[i].getMemberId().equals(id) 
								  && members[i].getPassword().equals(password)) 
			{
				return members[i].getMemberName();
			}
		}
		return null;
	} // login

}
