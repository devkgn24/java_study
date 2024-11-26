package com.gn.practice;

public class Practice01 {
	public static void main(String[] args) {
		// 철수는 변수를 배우지 못한 상태에서 계산식을 작성했습니다. 
		// 변수를 배운 후에 변수 개념을 도입하여 코드를 수정하고자 합니다.
		// 철수가 변수를 배우기 전 작성한 코드를 보고, 
		// 변수 개념을 도입하여 코드를 효율적으로 수정하세요. 
		System.out.println(100 + 10);	// 110
		System.out.println(10 * (100 + 10));	// 1100
		System.out.println((10 * (100 + 10)) / 10);	// 110
		
		int num = 100;
		int su = 10;
		System.out.println(num+su);
		System.out.println(su * (num + su));
		System.out.println((su * (num + su)) / su);
		
		// 유지보수 효율적
		int percent = (100-10);
		System.out.println(11000*percent/100);
		System.out.println(10000*percent/100);
		System.out.println(40000*percent/100);
		
		
	}
}
