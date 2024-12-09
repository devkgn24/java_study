package com.gn.study.controller;

import com.gn.study.model.vo.Beverage;
import com.gn.study.model.vo.Coffee;
import com.gn.study.model.vo.OrangeJuice;

public class Run {
	public static void main(String[] args) {
		// 1. 클래스의 업캐스팅
		int i_num = 3; 
		double d_num = i_num;
		System.out.println(d_num);

		Beverage b1 = new Coffee();
		Beverage b2 = new OrangeJuice();
		
		b1.drink();
		b2.drink();
		
		// 2. 객체 배열과 다형성
		Beverage[] arr = new Beverage[3];
		
		Beverage bev = new Beverage();
		arr[0] = bev;
		
		Coffee cof = new Coffee();
		arr[1] = cof;
		
		OrangeJuice oj = new OrangeJuice();
		arr[2] = oj;
		
		for(Beverage b : arr) {
			b.drink();
		}
		
	}
}
