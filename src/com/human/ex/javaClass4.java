package com.human.ex;

public class javaClass4 {
	public static void triangle1() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void triangle2() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void triangle3() {
		for(int i=0;i<3;i++) {
			for(int j=i;j<2;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void cardName(String name) {
		System.out.print("�̸�=");
		System.out.println(name);
	}
	public static void cardNum(String Num) {
		System.out.print("��ȣ=");
		System.out.println(Num);
	}
	public static void cardAdress(String adress) {
		System.out.print("�ּ�=");
		System.out.println(adress);
	}
	public static void calender() {
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int i=1;i<32;i++) {
			if(i%7==0) {
				System.out.print(i);
				System.out.println();
			}
			else {
			System.out.print(i+"\t");
			}
		}
	}
	public static int intFunc(int a) {
		return a;
	}
	public static double doubleFunc(double a) {
		return a;
	}
	public static String stringFunc(String s) {
		return s;
	}
	public static void catFunc(String a,double b,int c) {
		System.out.println("�̸�="+a);
		System.out.println("����="+b);
		System.out.println("����="+c);
	}
	public static int[] intArrFunc(int[] arr) {
		return arr;
	}
	public static void catObject(String s,int[]arr) {
		System.out.println("�̸�="+s);
		System.out.println("����="+arr[0]);
		System.out.println("����="+arr[1]);
	}
	
	public static void main(String[] args) {
		triangle1();
		System.out.println();
		triangle2();
		System.out.println();
		triangle3();
		System.out.println();
		cardName("ȫ�浿");
		cardNum("010-xxxx-xxxx");
		cardAdress("������");
		System.out.println();
		calender();
		System.out.println();
		System.out.println();
	
		int age=intFunc(3);
		
		double tall=doubleFunc(13.1);
		
		String name=stringFunc("�����");
		
		System.out.println();
		catFunc(name,tall,age);
		for(int i=0;i<3;i++) {
			
		}
		
		
		 
	}

}
