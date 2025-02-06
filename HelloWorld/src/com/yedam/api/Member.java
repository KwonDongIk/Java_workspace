package com.yedam.api;

public class Member {
	
	String memberId;
	int memberPoint;
	
	Member(){
		
	}
	
	Member(String id, int point){
		memberId = id;
		memberPoint = point;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode(); // object의 hashcode는 주소값
		return memberPoint;
	}
	

	@Override
	public boolean equals(Object obj) {
		
		// memberId가 같을 경우 논리적으로 같은 객체
		if (obj instanceof Member) {
			Member m2 = (Member) obj;
				if(this.memberId == m2.memberId && this.memberPoint == m2.memberPoint) {
					return true;
				}
			}
			return false;
	
	}
	
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPoint=" + memberPoint + "]";
	}

}
