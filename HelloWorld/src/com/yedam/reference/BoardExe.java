package com.yedam.reference;
import java.util.*;

/*
 * 실행클래스.
 * 1. 게시글 목록 2. 게시글 등록 3. 게시글 삭제 9. 종료
 */
public class BoardExe {
	static Board[] boardRepo = new Board[100]; // 게시글 등록 배열
	static Scanner sc = new Scanner(System.in);
	
	public static void initData() {
		// 배열의 샘플
		// 1페이지 : 0~4, 2페이지 : 5~9
		boardRepo[0] = new Board("게시글제목0", "내용임다0", "user00", "2025-02-02");
		boardRepo[1] = new Board("게시글제목1", "내용임다1", "user01", "2025-02-03");
		boardRepo[2] = new Board("게시글제목2", "내용임다2", "user02", "2025-02-04");
		boardRepo[3] = new Board("게시글제목3", "내용임다3", "user03", "2025-02-04");
		boardRepo[4] = new Board("게시글제목4", "내용임다4", "user04", "2025-02-04");
		
		boardRepo[5] = new Board("게시글제목5", "내용임다5", "user05", "2025-02-04");
		boardRepo[6] = new Board("게시글제목6", "내용임다6", "user06", "2025-02-04");
		boardRepo[7] = new Board("게시글제목7", "내용임다7", "user07", "2025-02-04");
		boardRepo[8] = new Board("게시글제목8", "내용임다8", "user08", "2025-02-04");
		boardRepo[9] = new Board("게시글제목9", "내용임다9", "user09", "2025-02-04");
		
		boardRepo[10] = new Board("게시글제목10", "내용임다10", "user10", "2025-02-04");
		boardRepo[11] = new Board("게시글제목11", "내용임다11", "user11", "2025-02-04");
		boardRepo[12] = new Board("게시글제목12", "내용임다12", "user12", "2025-02-04");
		
	}
	
	public static void boardList() {
		// 게시글 목록
		int page = 1;
		int lastPage = (int) Math.ceil(getMaxConut() / 5.0); // 올림 연산 ceil
		while(true) {
			int firstIndex = (page - 1) * 5;
			int lastIndex = (page * 5) - 1;
			for(int i = firstIndex; i <= lastIndex; i++) {
				if (boardRepo[i] != null) {
					System.out.println(boardRepo[i].showBoard());
				}
			}
			System.out.println("이전페이지:p, 이후페이지:n, 종료:q");
			String paging = sc.nextLine();
			if(page < lastPage && paging.equals("n")) {
				// 마지막 페이지보다는 작은 값
				page++;
			} else if(page > 1 && paging.equals("p")) {
				// 1 보다는 큰 페이지
				page--;
			} else if(paging.equals("q")) {
				return;
			} else {
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
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
		System.out.println("게시글 제목을 입력해주세요. >> ");
		String title = sc.nextLine();
		System.out.println("게시글 내용을 입력해주세요. >> ");
		String content = sc.nextLine();
		System.out.println("작성자 아이디를 입력해주세요. >> ");
		String writer = sc.nextLine();
		System.out.println("날짜를 기입해주세요.(2000-00-00) >> ");
		String writeDate = sc.nextLine();
		// 배열의 빈 공간에 등록
		for(int i = 0; i < boardRepo.length; i ++) {
			if(boardRepo[i] == null) {
				boardRepo[i] = new Board(title, content, writer, writeDate);
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
		boolean run = true;
		initData(); // 초기데이터 생성
		
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
