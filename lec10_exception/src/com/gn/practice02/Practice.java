package com.gn.practice02;

public class Practice {
	// 메소드
	// 메소드명 : printStrLength
	// 매개변수 : 참조형 변수 -> String
	public void printStrLength(String str) {
		try {
			int leng = str.length();
			System.out.println("문자열의 길이 : "+leng);
		}catch(NullPointerException e) {
			System.out.println(
					"NullPointerException 발생: "
					+e.getMessage());
		}
	}
	
//	NullPointerException 발생: 
//	Cannot invoke "String.length()" because "str" is null
}
