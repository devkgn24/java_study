package com.gn.study.controller;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateRun {
	public static void main(String[] args) {
		// 1.LocalDate
		// (1) 현재 날짜 구하기
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		// (2) 특정 날짜 설정
		LocalDate date2 = LocalDate.of(2024, 12, 25);
		System.out.println(date2);
		// (3) 필드 조회
		System.out.println(date1.getYear());
		System.out.println(date1.getMonthValue());
		System.out.println(date1.getDayOfMonth());
		// 1 : 월 ~ 7 : 일
		System.out.println(date1.getDayOfWeek().getValue());
		// (4) 필드 증가
		LocalDate date3 = date1.plusWeeks(3);
		System.out.println(date3);
		// (5) 필드 감소
		LocalDate date4 = date1.minusDays(3);
		System.out.println(date4);
	}
}
