package com.yedam.collections;


class Box<E>{ // <- 제네릭 : 클래스나 메서드에서 사용할 데이터 타입을 컴파일 시에 미리 지정
	E item; // object 클래스형이라 모든 형태가..
	
	void setItem(E item) {
		this.item = item;
	}
	
	Object getItem() {
		return item;
	}
}

public class BoxExe {
	public static void main(String[] args) {
		Box<String> box = new Box();
		box.setItem("오렌지");
		//box.setItem(99);
		
		String result = (String) box.getItem(); // Object -> String casting
		System.out.println(result);
	}

}
