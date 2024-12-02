package com.gn.practice;

public class Practice02 {
	public static void main(String[] args) {
		int[] nums = { -62, 107, -12, 89, -35 };
		for(int num : nums) {
//			if(num > 50) {
//				System.out.println(num);
//			}
			if(num <= 50) {
				continue;
			}
			System.out.println(num);
		}
	}
}
