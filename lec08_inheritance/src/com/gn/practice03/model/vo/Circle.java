package com.gn.practice03.model.vo;

public class Circle extends Point{
	
	private int radius;
	private static final double PI = 3.14;

	// 기본 생성자
	public Circle() {}
	
	// 매개변수 생성자
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	
	@Override
	public void draw() {
		super.draw();
		// 면적 : PI * 반지름 * 반지름
		System.out.printf("면적 : %.1f\n",(PI*radius*radius));
		//둘레 : 18.84
		//System.out.println("면적 : "+(PI*radius*radius));
		// 둘레 : PI * 반지름 * 2 
		System.out.printf("둘레 : %.1f\n", (PI*radius*2));
		// System.out.println("둘레 : "+(PI*radius*2));
	}
}
