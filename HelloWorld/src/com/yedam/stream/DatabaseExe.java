package com.yedam.stream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DatabaseExe {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // oracle DB의 접속 정보
		String user = "hr";
		String password = "hr";
		
		try {
			
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공");
			// tbl_student 테이블의 조회
			java.sql.Statement stmt = conn.createStatement();
			
			String query = "delete from tbl_student where student_name = '박김수'";
			int r = stmt.executeUpdate(query);
			if (r > 0) {
				System.out.println("삭제완료");
			}
			ResultSet rs = stmt.executeQuery("select * from tbl_student order by student_no asc");
			
			// 반복문 활용
			while(rs.next()) { // 조회결과 true, 마지막 데이터 false
				// 컬럼명
				System.out.println(rs.getString("student_no") + " " + rs.getString("student_name"));
				
			}
			System.out.println("END");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("연결 실패");
		}
		System.out.println("END");
	}

}
