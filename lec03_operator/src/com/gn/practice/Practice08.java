package com.gn.practice;

import java.util.Scanner;

public class Practice08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Scanner로 유무 입력받기
		System.out.print("과제를 제출하셨나요? ");
		boolean report = sc.nextBoolean();
		System.out.print("퀴즈를 제출하셨나요? ");
		boolean quiz = sc.nextBoolean();
		// 입력받은 결과로 점수 계산하기
		int score = (report && quiz) ? 100  : ((report || quiz) ? 60 : 20); 
		// 점수 출력하기
		System.out.println("총점 : "+score+"점");
		// Scanner 닫아주기
		sc.close();
	}
}
