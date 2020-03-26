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
//	public static int totalCount=0;//등록한 상품개수 저장
//	public String name;//상품명
//	public int count = 0;//개수 세는
//	//입고,출고,내용
//	public void add(int count) {
//		this.count+=count;
//	}
//	public void min(int count) {
//		this.count-=count;
//	}
//	public void display() {
//		System.out.println("전체 상품 종류 개수:"+Product.totalCount);
//		System.out.println("상품 이름:"+name);
//		System.out.println("상품 개수:"+count);
//	}
//	//생성자
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
//		Product p1=new Product("과자",100);
//		Product p2=new Product("연필",100);
//		Product p3=new Product("책",100);
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
//		arr[3]=new Product("노트",10);
//		String input="연필";
//		for(Product p:arr) {
//			if(p!=null) {
//				if(p.name.equals(input))
//					p.display();
//			}
//		}
//		//재고가 101이하인 제품을 출력하는 프로그램
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
////		//프로그램 중간에 파이값을 3.14592
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
