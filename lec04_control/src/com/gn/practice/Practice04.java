package com.gn.practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		// ctrl + shift + 'o'
		Scanner sc = new Scanner(System.in);
		
		System.out.print("조명의 밝기를 입력하세요(0~3) : ");
		int light = sc.nextInt();
		// 현재 조명의 밝기 : OOOOO (V)
//		System.out.print("현재 조명의 밝기 : ");
//		switch(light) {
//			case 0 : System.out.print("조명을 끕니다.");break;
//			case 1 : System.out.print("어두운 조명입니다.");break;
//		}
//		System.out.print(" (V)");
		
		String text = "";
		// 현재 조명의 밝기 : OOOOO (V)
		text += "현재 조명의 밝기 : ";
		switch(light) {
			case 2 : text += "밝은 조명입니다.";break;
			case 3 : text += "매우 밝은 조명입니다.";break;
		}
		text += "(V)";
		System.out.println(text);
	}
}
