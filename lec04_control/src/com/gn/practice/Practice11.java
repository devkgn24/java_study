package com.gn.practice;

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
		
		for(int i = 0 ; i < str.length() ; i++) {
//			if(str.charAt(i) == ' ') {
//				continue;
//			}
//			System.out.print(str.charAt(i));
			if(str.charAt(i) != ' ') {
				System.out.println(str.charAt(i));
			}
		}
	}
}
