 package com.human.ex;

import java.util.Scanner;

public class javaClass9 {
//	public static int sum(int a,int b) {
//		System.out.println("int+int");
//		return a+b;
//	}
//	public static int sum(int a,int b,int c) {
//		System.out.println("int+int+int");
//		return a+b+c;
//	}
//	public static int sum(int a,double b) {
//		System.out.println("int+double");
//		return (int) (a+b);
//	}
	public static int funcAll(int a) {
		return a;
	}
	public static double funcAll(double a,int b) {
		return a+b;
	}
	public static String funcAll(String s,double a, int b) {
		return s+a+b;
	}
	public static double circle(double a) {
		System.out.println("원 넓이는"+3.14*a*a);
		return 3.14*a*a;
	}
	public static double rectangle(double a,double b) {
		System.out.println("직사각형 넓이는"+a*b);
		return a*b;
	}
	public static double triangle(double a,double b) {
		System.out.println("삼각형 넓이는"+0.5*a*b);
		return 0.5*a*b;
	}
	public static void main(String[] args) {
		//함수 overload override overloading overriding
		//overload 매개변수가 다르면 같은 이름의 함수를 만들수 있다.
		//리턴값과는 관계가없다.
		//override 상속 관련된 메소드 재정의
//		System.out.println(sum(10,20));
//		System.out.println(sum(10,20.1));
//		System.out.println(sum(10,10,10));
		System.out.println(funcAll(10));
		System.out.println(funcAll(123.23,10));
		System.out.println(funcAll("dd",13.12,10));
		System.out.println();
		boolean state=false;
		while(!state) {
			System.out.println("1.원의 넓이 2.직사각형 넓이 3.삼각형넓이 4.종료");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			if(num==1) {
				System.out.println("반지름의 길이를 입력해주세요");
				int r=sc.nextInt();
				circle(r);
			}
			else if(num==2) {
				System.out.println("가로의 길이를 입력해주세요");
				int r=sc.nextInt();
				System.out.println("세로의 길이를 입력해주세요");
				int r1=sc.nextInt();
				rectangle(r, r1);
			}
			else if(num==3) {
				System.out.println("밑변의 길이를 입력해주세요");
				int r=sc.nextInt();
				System.out.println("높이를 입력해주세요");
				int r1=sc.nextInt();
				triangle(r, r1);
			}
			else if(num==4) {
				state=true;
				System.out.println("종료");
			}
		}
		
			
		
	}

}
