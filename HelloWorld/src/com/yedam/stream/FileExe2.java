package com.yedam.stream;

import java.io.*;


public class FileExe2 {
	public static void main(String[] args) {
		// 보조 스트림(입출력스트림)
		
		try {
			Reader reader = new FileReader("c:/temp/students.txt");
			BufferedReader br = new BufferedReader(reader);
			
			
			while(true) {
				String str = br.readLine(); // 한 라인씩 읽어옴..
				if(str == null) {
					
					break; // 반복문 종료
					
				} else if(str != null) {
					
					String[] strAry = str.split(" "); // 구분자(공백) 배열생성
					System.out.println("이름 : " + strAry[0] + " 영어점수 : " + strAry[1] + " 수학점수 : " + strAry[2]);
				
				}
				
			}
				
				
			br.close();
			reader.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("END");
		
	}

}
