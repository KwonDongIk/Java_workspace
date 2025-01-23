package com.yedam.reference;
import java.util.*;

public class Reference {
	public static void main(String[] args) {
		String[][] aryExe = new String [5][2];
		
		// String[][] aryExe = {{"홍길동","80"},{"김민수","85"}}; // 바로 선언
		aryExe[0][0] = "홍길동";
		aryExe[0][1] = "80";
		aryExe[1][0] = "김민수";
		aryExe[1][1] = "85";
		aryExe[2][0] = "박헌수";
		aryExe[2][1] = "88";
		aryExe[3][0] = "심상현";
		aryExe[3][1] = "90";
		aryExe[4][0] = "최기동";
		aryExe[4][1] = "75";
//		System.out.println(aryExe[0][0]);
		
		int sum = 0;
		int max = 0;
		String maxStudent = ""; 
		for (int i = 0; i < aryExe.length; i++) {
			int sumAry = Integer.parseInt(aryExe[i][1]);
			sum += sumAry;
			
			if (max < Integer.parseInt(aryExe[i][1])) {
				max = sumAry;
				maxStudent = aryExe[i][0];
			}
			System.out.println("점수 -> " + aryExe[i][1]);
		}
		System.out.println("최고점수는 -> " + max);
		System.out.println("최고점수의 학생 이름은 -> " + maxStudent);
		System.out.println("점수 합계는 -> " + sum);
	}

}
