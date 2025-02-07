package com.yedam.stream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileExe {
	public static void main(String[] args) {
		
		// ListExe.java 읽기
		try {
			Reader reader = new FileReader("c:/temp/ListExe.java");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("END");
	}
	
	// 문자기반 테스트 생성
	void write() {
		
		// 문자 기반 출력
				try {
					Writer wr = new FileWriter("c:/temp/test2.txt");
					wr.write(65);
					wr.write(new char[] {'B','C'});
					wr.write("DEFGHI", 2, 3);
					
					wr.flush();wr.close();
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		
		
	}
	
	
	// 파일 복사
	void copy() {
		
		// c:/temp/sample.PNG -> c:/temp/copy.PNG
		try {
			InputStream is = new FileInputStream("c:/temp/sample.PNG");
			OutputStream os = new FileOutputStream("c:/temp/copy1.PNG");
			
			int data = -1;
			byte[] buf = new byte[100]; // 100byte 씩 읽기
			while(true) {
				// 읽기
				data = is.read(buf); // -1 반환
				
				os.write(buf); // 출력(바이트 쓰기)
				
				if (data == -1) {
					break;
				}
				
				
			}
			is.close();
			os.flush();
			os.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	// byte 기반 파일 읽기
	void input() {
		
		try {
			InputStream is = new FileInputStream("c:/temp/test1.dat");
			while(true) {
				int data = is.read(); // 바이트 읽고 반환 -1 값 반환
				System.out.println(data);
				if(data == -1)
					break;
				
			}
			is.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	// byte 기반 파일 생성 
	void output() {
		
		try {
			OutputStream os = new FileOutputStream("c:/temp/test1.dat");
			os.write(10);
			os.write(20);
			os.write(30); // 쓰기
			os.flush(); // 버퍼 비우기
			os.close(); // 리소스 반환
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
