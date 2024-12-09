package com.gn.practice03.controller;

import com.gn.practice03.model.vo.Bicycle;
import com.gn.practice03.model.vo.Car;
import com.gn.practice03.model.vo.Vehicle;

public class Run {	
	public static void main(String[] args) {
		Vehicle v1 = new Car();
//		모터힘으로 지나가요~
		v1.go();
		System.out.println();
		Vehicle v2 = new Bicycle();
//		다리힘으로 지나가요~
		v2.go();
		
	}

}
