package com.gn.practice;

public class Practice09 {
	public static void main(String[] args) {
	// while문을 사용하여 1부터 5까지 출력하세요.
//		반복 횟수: 1
//		반복 횟수: 2
//		반복 횟수: 3
//		반복 횟수: 4
//		반복 횟수: 5
//		반복 종료!
//		for(int i = 1 ; i <= 5 ; i++) {
//			System.out.println("반복 횟수 : "+i);
//		}
//		System.out.println("반복 종료!");
		
//		int i = 1; 
//		while(i <= 5) {
//			System.out.println("반복 횟수 : "+i);
//			i++;
//		}
//		System.out.println("반복 종료!");
		
		int i = 1;
		while(true) {
			System.out.println("반복 횟수 : "+i);
			i++;
			if(i > 5) {
				break;
			}
		}
		System.out.println("반복 종료!");
	}
}
