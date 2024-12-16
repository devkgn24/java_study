package com.gn.study.practice03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		// 1. 사용자로부터 문자열 입력 받기
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// 2. 입력받은 단어가 sentence에 존재하는지 확인
//		if(sentence.indexOf(str) != -1) {
//			System.out.println(str);
//		}else {
//			System.out.println("존재하지 않는 단어입니다.");
//		}
		// 3. 일치하는 애가 있으면 해당 단어를 출력
		// 4. 일치하는 단어가 없으면 => 존재하지 않는 단어입니다.
		String[] arr = sentence.split(" ");
		boolean result = false;
		for(String a : arr) {
			if(str.equals(a)) {
				//System.out.println(str);
				result = true;
			} else {
				//System.out.println("존재하지 않는 단어입니다.");
			}
		}
		
		if(result == true) {
			
		} else {
			
		}
	}
}
