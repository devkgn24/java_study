package com.gn.homework;

import java.util.Scanner;

public class Practice {
	public void practice05() {
		Scanner sc = new Scanner(System.in);
		int sum = 0; 
		while(true) {
			System.out.print("숫자(0을 입력하면 종료) : ");
			int num = sc.nextInt();
			if(num == 0) {
				break;
			} 
			if(num < 0) {
				continue;
			}
			sum += num;
		}
		System.out.println("양수의 합계 : "+sum);
	}
}
