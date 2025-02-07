package com.yedam.api;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance(); // 인스턴스
		today.set(Calendar.YEAR, 2024);
		today.set(2024, 1, 10);
		
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DATE);
		int day = today.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		
		switch(day) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
			
		}
		
		
		int dayOfMonth = today.getActualMaximum(Calendar.DATE);
		
		System.out.printf("%d년 %d월 %d일 ",year, month+1, date);
		System.out.println("요일은 " + strWeek + "요일");
		System.out.printf("말일은 : " + dayOfMonth);
	}

}
