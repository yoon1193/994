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
		System.out.print("이름=");
		System.out.println(name);
	}
	public static void cardNum(String Num) {
		System.out.print("번호=");
		System.out.println(Num);
	}
	public static void cardAdress(String adress) {
		System.out.print("주소=");
		System.out.println(adress);
	}
	public static void calender() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
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
		System.out.println("이름="+a);
		System.out.println("신장="+b);
		System.out.println("나이="+c);
	}
	public static int[] intArrFunc(int[] arr) {
		return arr;
	}
	public static void catObject(String s,int[]arr) {
		System.out.println("이름="+s);
		System.out.println("신장="+arr[0]);
		System.out.println("나이="+arr[1]);
	}
	
	public static void main(String[] args) {
		triangle1();
		System.out.println();
		triangle2();
		System.out.println();
		triangle3();
		System.out.println();
		cardName("홍길동");
		cardNum("010-xxxx-xxxx");
		cardAdress("두정동");
		System.out.println();
		calender();
		System.out.println();
		System.out.println();
	
		int age=intFunc(3);
		
		double tall=doubleFunc(13.1);
		
		String name=stringFunc("고양이");
		
		System.out.println();
		catFunc(name,tall,age);
		for(int i=0;i<3;i++) {
			
		}
		
		
		 
	}

}
