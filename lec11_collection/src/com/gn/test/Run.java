package com.gn.test;

public class Run {
	public static void main(String[] args) {
//		Menu m = new Menu();
//		m.insertItem();
		
		String str = "가나다라마바사아자차카타파하";
		if(str.equals("가나다")) {
			System.out.println("완벽 일치");
		}
		
		if(str.contains("가나다")) {
			System.out.println("포함");
		}
		
	}
}
