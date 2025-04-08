package com.gn.practice;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		// 날씨와 기분 정보 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("날씨 : ");
		String weather = sc.nextLine();
		System.out.print("기분 : ");
		String mood = sc.nextLine();
		
		// 입력받은 정보를 통해 boolean 값 도출
		boolean bool1 = weather.equals("sunny");
		boolean bool2 = mood.equals("happy");
		
		// boolean 값 console에 출력하기
		System.out.print("날씨가 sunny한가요? ");
		System.out.println(bool1);
		System.out.print("기분이 happy한가요? ");
		System.out.println(bool2);
		System.out.print("날씨가 sunny하고 기분도 happy한가요? ");
		System.out.println(bool1 && bool2);
		
		// Scanner 닫기
		sc.close();
	}
}
