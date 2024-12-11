package com.gn.study.practice01;

public class Practice {
	// 메소드명 : printSum
	// 반환형 : void
	// 매개변수 : String a, String b
	// 기능 
	// 매개변수로 전달받은 문자열 2개를 정수로 변환
	// 두 정수를 더한 결과를 출력
	public void printSum(String a, String b) {
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		
		int sum = num1+num2;
		System.out.println("합 : "+sum);
	}
	
}
