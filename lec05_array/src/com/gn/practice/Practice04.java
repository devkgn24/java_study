package com.gn.practice;

public class Practice04 {
	public static void main(String[] args) {
		int[] ages = {20, 18, 22, 19, 21};
		int max = ages[0];
		int min = ages[0];
		for(int i = 0 ; i < ages.length ; i++) {
			if(max < ages[i]) {
				max = ages[i];
			}
			if(min > ages[i]) {
				min = ages[i];
			}
		}
		System.out.println("가장 나이가 많은 학생의 나이 : "+max);
		System.out.println("가장 나이가 어린 학생의 나이 : "+min);
	}
}
