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

	// ������
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

	// ����
	public int area() {
		return this.width * this.height;
	}
	public static int area(int w,int h) {
		return w * h;
	}

	// �ѷ�
	public int border() {
		return 2 * (this.width + this.height);
	}
	public static int border(int w,int h) {
		return 2 * (w + h);
	}

}

public class classStart8 {

	public static void main(String[] args) {
		// �簢�� ���̿� �ѷ� ���ϴ� ���α׷�
		MyRectangle r1 = new MyRectangle(10, 20);
		System.out.println(r1.area());
		System.out.println(r1.border());
		//r1.width=10; private �ٸ� Ŭ�������� �����Ҽ�����.
		//ĸ��ȭ ���������ϸ� ������ �����ֵ�.
		r1.setWidth(20);
		System.out.println(r1.area());
		//������ �μ��� ���̿� �ѷ��� �޼ҵ屸��
		System.out.println(MyRectangle.area(10, 20));
		System.out.println(MyRectangle.border(10, 20));
		
		
		

	}

}
