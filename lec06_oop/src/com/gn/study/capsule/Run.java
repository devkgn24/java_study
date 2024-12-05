package com.gn.study.capsule;

import com.gn.study.capsule.open.Account1;

public class Run {
	
	public static void main(String[] args) {
		Student s = new Student(25);
		
//		System.out.println(s.studentNo);
//		setter
		s.setStudentNo(15);
		
// 		getter		
		int num = s.getStudentNo();
		System.out.println(num);
		
		System.out.println(s.getStudentNo());
		
		
		
		Account1 a1 = new Account1("김철수",2000);
		
		a1.balance -= 5000;
		
		System.out.println(a1.balance);
		
	}

}
