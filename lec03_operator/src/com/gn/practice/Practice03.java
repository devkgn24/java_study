package com.gn.practice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 두 개의 숫자를 입력 받으세요.
		System.out.print("숫자(1) : ");
		int num1 = sc.nextInt();
		System.out.print("숫자(2) : ");
		int num2 = sc.nextInt();
		// System.out.println(num1+" : "+num2);
		// 첫번째 숫자가 두번째 숫자보다 큰지 확인하는 프로그램을 만드세요.
		boolean isFirstGTSecond = num1 > num2;
		// 결과는 boolean 타입값을 그대로 출력하세요.
		System.out.println("첫번째 숫자가 두번째 숫자보다 큰가요? "+isFirstGTSecond);
		// 비교 연산자를 활용해서 문제를 해결하세요.
	}
}
