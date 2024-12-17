package com.gn.practice10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
		// 오늘 날짜를 기준으로 1주일 뒤에 날짜 정보를 출력
		// OO월 OO일 O요일
		Calendar today = Calendar.getInstance();
		today.add(Calendar.DATE, 7);
		Date d = today.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf.format(d));
		// 오늘 날짜 기준으로 1달 뒤에 날짜 정보를 출력
		// OO월 OO일 O요일
		Calendar today2 = Calendar.getInstance();
		today2.add(Calendar.MONTH, 1);
		Date d2 = today2.getTime();
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf2.format(d2));
	}
}
