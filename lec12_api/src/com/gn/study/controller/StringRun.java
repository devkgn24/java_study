package com.gn.study.controller;

public class StringRun {
	public static void main(String[] args) {
		// 1. 리터럴 -> ""
		// 값이 같으면 hashCode 동일, == 비교 연산자 사용 가능
		String str = "Hello";
//		String str = new String("Hello");
		System.out.println("Hello(1) : "+System.identityHashCode(str));
//		str += "World";
		System.out.println(System.identityHashCode(str));
		
		String str1 = "Hello";
		System.out.println("Hello(2) : "+System.identityHashCode(str1));
		if(str == str1) {
			System.out.println("같다!!");
		}
		// 2. new 연산자 -> 객체
		String str2 = new String("Hello");
		System.out.println(System.identityHashCode(str2));
		// 3. equals
		System.out.println("equals() : "+("Hi".equals(str2)));
		// 4. length()
		System.out.println("length() : "+str2.length());
		// 5. charAt()
		System.out.println("charAt(i) : "+str2.charAt(1));
		// 6. toCharArray()
		char[] arr = str2.toCharArray();
		// 7. contains()
		System.out.println("contains() : "+str2.contains("lo"));
		// 8. compareTo() => Hello
		System.out.println("compareTo() : "+str2.compareTo("ZZZ"));
		// 9. concat -> 원본값 수정 불가능
		String test = "우리는";
		
		test = test.concat("할수있다.");
		
		System.out.println(test);
		
		// 10. indexOf
		test = "2024+12+16+12+43";
		System.out.println(test.indexOf("."));
		System.out.println(test.indexOf("12"));
		System.out.println(test.lastIndexOf("12"));
		String[] time = test.split("\\+");
		System.out.println(time);
		for(String t : time) {
			System.out.println(t);
		}
		
		
		
		String a = "a+b+c+d";
		String[] arrA = a.split("\\+");
		String b = "e.f.g.h";
		String[] arrB = b.split("\\.");
		
		
				
		String name = "김 철 수";
		String[] nameArr = name.split("-");
		for(String n : nameArr) {
			System.out.println(n);
		}
		
		// 문자열 바꾸기
		String ide = "eclipse";
		ide = ide.replace("e", "a");
		System.out.println(ide);
		String id = "김 철 수";
		id = id.replace(" ", "");
		System.out.println(id);
		
		// 비어있는지 확인
		String empty1 = "";
		String empty2 = " ";
		System.out.println("(1) : "+empty1.isBlank());
		System.out.println("(2) : "+empty2.isBlank());
		
		System.out.println("(3) : "+empty1.isEmpty());
		System.out.println("(4) : "+empty2.isEmpty());
		
		System.out.println(empty1.length() == 0);
		empty2 = empty2.replace(" ", "");
		System.out.println(empty2.length() == 0);
				
		String empty3 = " 안 녕 ";
		empty3 = empty3.trim();
		System.out.println(empty3);
		
		String[] students = {"철수","영희","길동"};
		String allStudent = String.join("-", students);
		System.out.println(allStudent);
		
		String cutTest = "hello world";
		System.out.println(cutTest.substring(6));
		System.out.println(cutTest.substring(0,5));
		// cutTest.charAt(3)
		System.out.println(cutTest.substring(3,4));
		
		String file = "test.jpg";
		String ex = file.substring(file.lastIndexOf(".")+1);
		String file_name = file.substring(0,file.lastIndexOf("."));
		System.out.println(ex+" : "+file_name);
				
		// valueOf
		double pi = 3.14;
		String piStr = String.valueOf(pi);
		System.out.println(piStr+2.1);
		
		// StringBuilder
		StringBuilder sb 
			= new StringBuilder("Hello");
		sb.append("World!!");
		System.out.println(sb);
		
		sb.insert(5, " Java ");
		System.out.println(sb);
		
		sb.delete(11, 16+1);
		System.out.println(sb);
		
		int idx = sb.indexOf("!");
		sb.deleteCharAt(idx);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
	}
}
