package com.yedam.reference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 * 실행클래스.
 * 1. 게시글 목록 2. 게시글 등록 3. 게시글 삭제 9. 종료
 */
public class BoardExe {
	static Board[] boardRepo = new Board[100]; // 게시글 등록 배열
	static Scanner sc = new Scanner(System.in);
	static String loginId; // 로그인 아이디를 저장
	public static void initData() throws ParseException {
		// 배열의 샘플
		// 1페이지 : 0~4, 2페이지 : 5~9
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		boardRepo[0] = new Board("게시글제목0", "내용임다0", "user00", sdf.parse("2025-01-28"));
		boardRepo[1] = new Board("게시글제목1", "내용임다1", "user01", sdf.parse("2025-01-28"));
		boardRepo[2] = new Board("게시글제목2", "내용임다2", "user02", sdf.parse("2025-01-28"));
		boardRepo[3] = new Board("게시글제목3", "내용임다3", "user03", sdf.parse("2025-01-28"));
		boardRepo[4] = new Board("게시글제목4", "내용임다4", "user04", sdf.parse("2025-01-28"));
		boardRepo[5] = new Board("게시글제목5", "내용임다5", "user05", sdf.parse("2025-01-28"));
		boardRepo[6] = new Board("게시글제목6", "내용임다6", "user06", sdf.parse("2025-01-28"));
		boardRepo[7] = new Board("게시글제목7", "내용임다7", "user07", sdf.parse("2025-01-28"));
		boardRepo[8] = new Board("게시글제목8", "내용임다8", "user08", sdf.parse("2025-01-28"));
		boardRepo[9] = new Board("게시글제목9", "내용임다9", "user09", sdf.parse("2025-01-28"));
		boardRepo[10] = new Board("게시글제목10", "내용임다10", "user10", sdf.parse("2025-01-28"));
		boardRepo[11] = new Board("게시글제목11", "내용임다11", "user11", sdf.parse("2025-01-28"));
		boardRepo[12] = new Board("게시글제목12", "내용임다12", "user12", sdf.parse("2025-01-28"));
		
	}
	
	public static void boardList() {
		// 게시글 목록
		int page = 1;
		int lastPage = (int) Math.ceil(getMaxConut() / 5.0); // ceil 올림 연산
		while(true) {
			int count = 1;
//			int firstIndex = (page - 1) * 5;
//			int lastIndex = (page * 5) - 1;
			for(int i = 0; i < boardRepo.length; i++) {
				if (boardRepo[i] != null) {
					if (count > (page - 1) * 5 && count <= page * 5)
					System.out.println(count + " " + boardRepo[i].showBoard());
					
					count++;
				}
			}
			System.out.println("이전페이지:p, 이후페이지:n, 종료:q");
			String paging = sc.nextLine();
			if(paging.equals("n")) {
				if(page < lastPage) {
				// 마지막 페이지보다는 작은 값
				page++;
				}
			} else if(paging.equals("p")) {
				if(page > 1) {
				// 1 보다는 큰 페이지
				page--;
				}
			} else if(paging.equals("q")) {
				return;
			} else {
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
				break;
			}
		} // while
	} // boardList
	// 배열을 매개값으로 전달하면 건수가 몇 건인지 반환해주는 메소드
	public static int getMaxConut() {
		int count = 0; // 전체 건수
		for(int i = 0; i < boardRepo.length; i++) {
			if(boardRepo[i] != null) {
				count++;
			}
		}
		return count; // 건수 반환
	}
	
	public static void addBoard() {
		// 게시글 등록
		// 제목 : 5글자 미만 ~ 15글자 초과. 콘솔 출력("등록 불가합니다.");
		// 똑같은 글 제목이 있으면 콘솔출력("이미 있는 제목입니다.");
		System.out.println("게시글 제목을 입력해주세요. >> ");
		String title = sc.nextLine();
//		System.out.println("작성자 아이디를 입력해주세요. >> ");
//		String writer = sc.nextLine();
//		System.out.println("날짜를 기입해주세요.(2000-00-00) >> ");
//		String writeDate = sc.nextLine();
		// 배열의 빈 공간에 등록
		
		if(title.length() < 5 || title.length() > 15) {
			System.out.println("등록 불가합니다!!");
			return;
		}
		
		for(int i = 0; i < boardRepo.length; i ++) {
			if(boardRepo[i] != null && boardRepo[i].getTitle().equals(title)) {
				System.out.println("이미 등록된 제목입니다!!");
				return;
			}
		}
		
		System.out.println("게시글 내용을 입력해주세요. >> ");
		String content = sc.nextLine();
		
		for(int i = 0; i < boardRepo.length; i ++) {
			if(boardRepo[i] == null) {
				boardRepo[i] = new Board(title, content, loginId, new Date());
				System.out.println("등록완료");
				break; // 한 건만 등록
			}
		}
	}
	
	public static void removeBoard() {
		// 게시글 삭제
		System.out.println("삭제할 게시글 제목을 입력해주세요. >> ");
		String title = sc.nextLine();
		
		for(int i = 0; i <boardRepo.length; i ++) {
			if(boardRepo[i] != null && boardRepo[i].getTitle().equals(title)) {
				boardRepo[i] = null;
				System.out.println("삭제완료");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		//MemberExe exe = new MemberExe();
		
		
		while(true) {
			// ID, Password 일치하면 글 목록 기능 사용
			System.out.println("아이디를 입력하세요. >> ");
			String id = sc.nextLine();
			System.out.println("비밀번호를 입력하세요. >> ");
			String pw = sc.nextLine();
			
			String name = MemberExe.login(id, pw);
			if(name != null) {
				loginId = id; // 여러메소드 공용사용
				System.out.println(name + "님 환영합니다.");
				break;
			}
			else {
				System.out.println("아이디와 비밀번호를 확인하세요.");
			}
		} // while
		
		boolean run = true;
		try {
			initData();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 초기데이터 생성
		
		while(run) {
			System.out.println("*********** 게시글 등록 프로그램 ***********");
			System.out.println("1. 게시글 목록 2. 게시글 등록 3. 게시글 삭제 9. 종료");
			System.out.print("선택 > ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: // 목록
				boardList();
				break;
			case 2: // 등록
				addBoard();
				break;
			case 3: // 삭제
				removeBoard();
				break;
			case 9: // 종료
				System.out.println("******* 프로그램을 종료합니다. *******");
				run = false;
				break;
			default: // 1,2,3,9 외의 경우
				System.out.println("메뉴를 확인하세요.");
			}
		} // while
		System.out.println("End of Program");
		
	} // main
	
}
