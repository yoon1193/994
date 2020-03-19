 package com.human.ex;

import java.util.Scanner;

public class javaClass10 {
	//전역변수,static변수,클래스변수
	public static int total=0;//언제 어디서든지 접근가능
	public static int add(int num1,int i) {
		int sum=num1+i;
		total=total+sum;
		return sum;
	}
	public static void main(String[] args) {
//		System.out.println(total);
//		System.out.println(javaClass10.total);
//		int i=0;{
//			total=10;
//			int i1=0;
//		}
//		if(true) {
//			int i2=10;
//			System.out.println(total);
//		}
//		for(int j=0;j<11;j++) {
//			int i3=10;
//			i++;
//		}
		int result=0;
		int num1=10;
		result=add(num1,30);
		System.out.println(result);
		System.out.println(total);
		result=add(num1,40);
		System.out.println(result);
		System.out.println(total);
	}



}
