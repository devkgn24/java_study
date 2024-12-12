package com.gn.study.controller;

import java.util.HashSet;
import java.util.Set;

import com.gn.study.model.vo.Student;

public class SetRun {
	public static void main(String[] args) {
		Set<Integer> class1 = new HashSet<Integer>();
		class1.add(1);
		class1.add(2);
		class1.add(3);
		Set<Integer> class2 = new HashSet<Integer>();
		class2.add(3);
		class2.add(4);
		class2.add(5);
		
		System.out.println("=== 합집합 ===");
//		class1.addAll(class2);
		Set<Integer> union = new HashSet<Integer>(class1);
		union.addAll(class2);
		System.out.println(class1);
		System.out.println(union);
		
		System.out.println("=== 교집합 ===");
//		class1.retainAll(class2);
		Set<Integer> intersection = new HashSet<Integer>(class1);
		intersection.retainAll(class2);
		System.out.println(class1);
		System.out.println(intersection);
		
		System.out.println("=== 차집합 ===");
		Set<Integer> difference = new HashSet<Integer>(class1);
		difference.removeAll(class2);
		System.out.println(difference);
		
		Set<Student> set1 = new HashSet<Student>();
		set1.add(new Student("철수",20));
		set1.add(new Student("우석",28));
		set1.add(new Student("은우",30));
		
		Set<Student> set2 = new HashSet<Student>();
		set2.add(new Student("철수",20));
		set2.add(new Student("길동",25));
		
//		set1.addAll(set2);
//		set1.retainAll(set2);
		set1.removeAll(set2);
		System.out.println(set1);
	}
}
