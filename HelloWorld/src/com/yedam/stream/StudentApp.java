package com.yedam.stream;

/*
 * 학생정보 관리프로그램 v.1
 * 학생 이름, 키, 몸무게, 점수
 */
import java.util.*;
import java.io.*;

public class StudentApp {
	
	Scanner sc = new Scanner(System.in);
	boolean run = true;
	
	// 임시 저장공간
	List<Student> students = new ArrayList<>();
	
	public StudentApp() {
		init();
	}
	
	public void start() {
		
		while(run) {
			
		System.out.println("--------------------------------------------");
		System.out.println("1. 학생목록 2. 학생추가 3. 학생삭제 9. 프로그램 종료");
		System.out.println("--------------------------------------------");
		System.out.println("메뉴 선택 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   ");
		
		
		int menu = Integer.parseInt(sc.nextLine());
		
		
			switch(menu) {
			
			case 1: 
				studentList();
				break;
				
			case 2: 
				addStudent(); 
				break;
				
			case 3: 
				removeStudent(); 
				break;
				
			case 9:
				System.out.println("프로그램 종료");
				save();
				run = false;
				
			default:
				System.out.println("잘못 선택하셨어요.");
			}
		}
		
		System.out.println("END");
	} // start
	
	public void studentList() {
		
		// 이름     점수
		// -----------
		// 홍길동    50
		System.out.println("이름      점수");
		System.out.println("-------------");
		for(Student st : students) {
			System.out.println(st.getName() + "      " + st.getScore());
		}
		
	}
	
	public void addStudent() {
		System.out.println("학생 이름을 입력해주세요. >> ");
		String studentName = sc.nextLine();
		
		double height = 0;
		
		while(true) {
			
			try {
				
				System.out.println("학생 키를 입력해주세요. >> ");
				height = Double.parseDouble(sc.nextLine());
				break;
				
			} catch (NumberFormatException e) {
				
				System.out.println("숫자 말고 한글이 입력된 것 같아요.");
			
			}
		}
		
		System.out.println("학생 몸무게를 입력해주세요. >> ");
		double weight = Double.parseDouble(sc.nextLine());
		System.out.println("학생 점수를 입력해주세요. >> ");
		int studentScore = Integer.parseInt(sc.nextLine());
		
		students.add(new Student(studentName, height, weight, studentScore)); // 추가
		System.out.println("등록완료 됐어요.");
		
		
	}
	
	public void removeStudent() {
		System.out.println("학생 이름을 입력해주세요. >> ");
		String name = sc.nextLine();
		
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getName().equals(name)) {
				students.remove(i);
				System.out.println("삭제완료 됐어요.");
				return;
			}
		}
		
	}
	
	public void save() {
		//c:/temp/studentList.txt
		try {
			Writer writer = new FileWriter("c:/temp/studentList.txt");
			// 갯수만큼 반복저장
			for(Student std : students) {
				writer.write(std.getName() + " " + std.getHeight() + " " 
						+ std.getWeight() + " " + std.getScore() + "\n");
			}
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("saved");
	}
	
	// 파일 읽어서 컬렉션에 저장
	public void init() {
		// c:/temp/studentList.txt
		try {
			Reader reader = new FileReader("c:/temp/studentList.txt");
			BufferedReader br = new BufferedReader(reader);
			
			
			while(true) {
				String str = br.readLine();
				if(str == null) break; // 반복종료
				String[] ary = str.split(" ");
				Student student = new Student(ary[0], Double.parseDouble(ary[1]), 
						Double.parseDouble(ary[2]), Integer.parseInt(ary[3]));
				
				students.add(student);
			}
			br.close();
			reader.close();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	

}
