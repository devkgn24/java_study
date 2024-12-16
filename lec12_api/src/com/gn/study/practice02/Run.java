package com.gn.study.practice02;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[3];
//		for(int i = 0 ; i < arr.length ; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int max = arr[0];
//		for(int i = 1 ; i <arr.length ; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		
		String result = "";
		// str1 | str2 | str3
		//   a 	|  bb  | ccc
		if(str1.length() < str2.length()) {
			result = str2;
		} else {
			
		}
		
		if(result.length() < str3.length()) {
			result = str3;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		if(str1.length() < str2.length()) {
			result = str2;
		} else if(str1.length() > str2.length()) {
			result = str1;
		} else {
			if(str1.compareTo(str2) < 0) {
				result = str2;
			}else {
				result = str1;
			}
		}
	
		
		// str1 | str2 | str3
		//   a  |  b   |  c 
		
		
		
		
		
		
		
	}
}
