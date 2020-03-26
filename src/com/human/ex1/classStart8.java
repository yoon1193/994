package com.human.ex1;

class MyRectangle {
	private int width = 0;
	private int height = 0;

	// setter getter
	public void setWidth(int width) {
		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}
	}

	public int getWidth() {
		return this.width;
	}

	public void setHeight(int height) {
		if (height < 0) {
			this.height = 0;
		} else {
			this.height = height;
		}
	}

	public int getHeight() {
		return this.height;
	}

	// 생성자
	public MyRectangle() {
	}

	public MyRectangle(int length) {
		this(length, length);
	}

	public MyRectangle(int width, int height) {
		if (width < 0 || height < 0) {
			this.width = 0;
			this.height = 0;
		}
		this.width = width;
		this.height = height;
	}

	// 넓이
	public int area() {
		return this.width * this.height;
	}
	public static int area(int w,int h) {
		return w * h;
	}

	// 둘레
	public int border() {
		return 2 * (this.width + this.height);
	}
	public static int border(int w,int h) {
		return 2 * (w + h);
	}

}

public class classStart8 {

	public static void main(String[] args) {
		// 사각형 넓이와 둘레 구하는 프로그램
		MyRectangle r1 = new MyRectangle(10, 20);
		System.out.println(r1.area());
		System.out.println(r1.border());
		//r1.width=10; private 다른 클래스에서 접근할수없다.
		//캡슐화 직접전근하면 음수가 들어갈수있따.
		r1.setWidth(20);
		System.out.println(r1.area());
		//간단히 두수의 넓이와 둘레는 메소드구현
		System.out.println(MyRectangle.area(10, 20));
		System.out.println(MyRectangle.border(10, 20));
		
		
		

	}

}
