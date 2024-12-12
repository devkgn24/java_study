package com.gn.practice06.controller;

import java.util.HashSet;
import java.util.Set;

import com.gn.practice06.model.vo.Food;

public class Run {
	public static void main(String[] args) {
//		Food f = new Food("샐러드",5000);
//		System.out.println(f);
		
		
		
		
		Set<Food> order = new HashSet<Food>();
		order.add(new Food("샐러드",14000));
		order.add(new Food("치킨",23000));
		order.add(new Food("치킨",50000));
		
		order.remove(new Food("치킨",50000));
		System.out.println("5만원 치킨 취소 : "+order);
		
		order.clear();
		System.out.println("전체 주문 취소 : "+order);
	}
}
