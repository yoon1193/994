package com.human.ex1;
class Rectangle{
	private int width=0;
	private int height=0;
	//setter ���� �����ϴ� �޼ҵ�
	public void setWidth(int width) {
		if(width<0) {
			width=0;
		}
		this.width=width;
	}
	public void setHeight(int height) {
		if(height<0) {
			height=0;
		}
		this.height=height;
	}
	//getter ���� �о���� �޼ҵ�
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	public Rectangle() {
	
	}
	public Rectangle(int width,int height) {
		if(width<0) {
			width=0;
		}
		if(height<0) {
			height=0;
		}
		this.width=width;
		this.height=height;
	}
	public int area() {
		return width*height;
	}
}

class Student{
	public int korean=0;
	public int english=0;
	public int math=0;
	public Student() {
		
	}
	public Student(int k,int e,int m) {
		this.korean=k;
		this.english=e;
		this.math=m;
//		korean=k;
//		english=e;
//		math=m;
	}
	public int sum() {
		return korean+english+math;
	}
	public double avg() {
		return sum()/3;
	}
}
public class classStart1 {

	public static void main(String[] args) {
		//�簢�� ���̱��ϴ� �޼ҵ带 ������ ��ü�� ����� �簢�� ���� ���ϱ�
		Rectangle rc=new Rectangle(40, 50);
		rc.setWidth(-1);
		rc.setHeight(5);
		System.out.println("�簢���� ����="+rc.area());
		
		
		
		//������ ���� ��հ� ������  ����Ҽ��ִ� ��ü
		Student st1=new Student(80,90,75);
		System.out.println(st1.sum());
		System.out.println(st1.avg());
		
		
		
	}

}
