package com.gn.practice03.run;

import com.gn.practice03.model.vo.Circle;
import com.gn.practice03.model.vo.Rectangle;

public class Run {
	public static void main(String[] args) {
		Circle[] arr1 = new Circle[2];
		
		Circle c1 = new Circle(1,2,3);
		Circle c2 = new Circle(3,3,4);
		
		arr1[0] = c1;
		arr1[1] = c2;
		
		Rectangle[] arr2 = new Rectangle[2];
		
		Rectangle r1 = new Rectangle(-1,-2,5,2);
		Rectangle r2 = new Rectangle(-2,5,2,8);
		
		arr2[0] = r1;
		arr2[1] = r2;
		
		 // 반복문을 통해 각 도형의 draw 메소드 실행
		for(Circle c : arr1) {
			c.draw();
		}
		for(Rectangle r : arr2) {
			r.draw();
		}
		
	}
}
