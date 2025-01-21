package com.yedam;

public class Variable2 {
	
public static void main(String[] args) {
		
		// 구구단 중첩 for문
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
//				System.out.printf("%d * %d = %d ", i, j, (i * j)); // `${num} * ${i}
			}
			System.out.println();
		}
		System.out.println("End of Program");
	}
}
