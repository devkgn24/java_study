package com.gn.practice;

import java.util.Scanner;
public class Practice06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번재 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 : ");
		int num2 = sc.nextInt();
		// 삼항 연산자를 사용하여
		// 두 수중에서 작은 수를 찾아서 출력
		int result = num1 < num2 ? num1 : num2 ; 
		System.out.println("두 수 중에서 작은 수는? "+result);
	}
}
