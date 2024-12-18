package com.gn.practice11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run {
	public static void main(String[] args) {
		// 1. 오늘 날짜 출력
		LocalDate today = LocalDate.now();
		// 오늘 날짜 : OOOO년 OO월 OO일
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		System.out.println("오늘 날짜 : "+today.format(dtf));
		
		// 2. 영화 개봉까지 남은 날 출력
		LocalDate release = LocalDate.of(2024, 12, 25);
		System.out.println("영화 개봉까지 남은 날 : "
				+ ChronoUnit.DAYS.between(today, release) + "일");
		// 3. 영화 개봉일의 요일 출력 -> getKoreanDayOfWeek 메소드 호출
		int yoil = release.getDayOfWeek().getValue();
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("E요일");
		System.out.println("영화 개봉일의 요일 : "+release.format(dtf1));
		
		//System.out.println("영화 개봉일의 요일 : "+getKoreanDayOfWeek(yoil));
		// 4. 개봉일 출력
		System.out.println("개봉일 : "+release.format(dtf));
	}
	
	public static String getKoreanDayOfWeek(int day) {
		// 요일의 정보를 숫자 형태로 전달 받아서 문자열 형태의 요일 정보 리턴
		// LocalDate의 getDayOfWeek().getValue() 활용
		String result = "";
		switch(day) {
			case 1 : result = "월요일";break;
			case 2 : result = "화요일";break;
			case 3 : result = "수요일";break;
			case 4 : result = "목요일";break;
		}
		return result;
  }
}
