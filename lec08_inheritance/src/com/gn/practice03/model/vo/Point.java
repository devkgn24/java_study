package com.gn.practice03.model.vo;

public class Point {
	private int x;
	private int y;
	
	// 기본 생성자
	public Point() {}
	
	// 매개변수 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y; 
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// x,y좌표값 출력
	public void draw() {
		System.out.println("(x,y) : ("+x+","+y+")");
	}
}
