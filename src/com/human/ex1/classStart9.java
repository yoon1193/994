//package com.human.ex1;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
////class Circle{
////	private static double pi=3.14;
////	public static void changePi(double pi) {
////		Circle.pi=pi;
////	}
////	public double r=0;
////	public Circle() {}
////	public Circle( double r) {
////		this.r = r;
////	}
////	public double border() {
////		return 3.14*2*r;
////	}
////	public double area() {
////		return 3.14*2*r*r;
////	}
////	
////	
////}
//class Product{
//	public static int totalCount=0;//����� ��ǰ���� ����
//	public String name;//��ǰ��
//	public int count = 0;//���� ����
//	//�԰�,���,����
//	public void add(int count) {
//		this.count+=count;
//	}
//	public void min(int count) {
//		this.count-=count;
//	}
//	public void display() {
//		System.out.println("��ü ��ǰ ���� ����:"+Product.totalCount);
//		System.out.println("��ǰ �̸�:"+name);
//		System.out.println("��ǰ ����:"+count);
//	}
//	//������
//	public Product(){ 
//		Product.totalCount++;
//	}
//	public Product(String name){ 
//		this(name,0);
//	}
//	public Product(String name,int count){ 
//		this();
//		this.name=name;
//		this.count=count;
//	}
//}
//public class classStart9 {
//	public static void main(String[] args) {
//		Product p1=new Product("����",100);
//		Product p2=new Product("����",100);
//		Product p3=new Product("å",100);
//		p1.min(4);
//		p3.add(10);
//		p1.display();
//		p2.display();
//		p3.display();
//		System.out.println("------------------------");
//		Product arr[]=new Product[5];
//		arr[0]=p1;
//		arr[1]=p2;
//		arr[2]=p3;
//		arr[3]=new Product("��Ʈ",10);
//		String input="����";
//		for(Product p:arr) {
//			if(p!=null) {
//				if(p.name.equals(input))
//					p.display();
//			}
//		}
//		//��� 101������ ��ǰ�� ����ϴ� ���α׷�
//		System.out.println("=--------------------------------=");
//		int number=101;
//		for(int i=0;i<Product.totalCount;i++) {
//			if(arr[i].count<number) {
//				arr[i].display();
//			}	
//		}
//	
////		double r=5;
////		Circle c=new Circle(r);
////		c.area();
////		c.border();
////		double r1=6;
////		Circle c1=new Circle(r);
////		c1.area();
////		c1.border();
////		double r2=7;
////		Circle c2=new Circle(r);
////		c2.area();
////		c2.border();
////		//���α׷� �߰��� ���̰��� 3.14592
////		Circle.changePi(3.14592);
////		c.area();
////		c.border();
////		c1.area();
////		c1.border();
////		c2.area();
////		c2.border();
//		
//	}
//
//}
