 package com.human.ex;

import java.util.Scanner;

public class javaClass11 {
	public static int mul(int a) {
		System.out.println("-"+a+"단 "+"-");
		for(int i=1;i<=9;i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}
		return 0;
	}
	public static int arr(){
		int sum=0;
		int temp=0;
		System.out.print("a~b까지 짝수의 합은=");
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static int arr1(){
		int sum1=0;
		int temp=0;
		System.out.print("a~b까지 홀수의 합은=");
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				sum1+=i;
			}
		}
		return sum1;
	}
	public static void sum() {
		System.out.println("짝수의 합="+arr());
		System.out.println("홀수의 합="+arr1());
	}
	public static void menu() {
		System.out.println("1.햄버거 2.치즈버거 3.샌드위치 4.종료");
		System.out.println("원하는 메뉴를 고르세요");
	}
	public static void checkmenuNumber(int a) {
		if(a>=1&&a<=3) {
			System.out.println(a+"번 메뉴가 선택되었습니다.");
		}
		else {
			System.out.println("잘 못 입력");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("하나의 숫자를 입력하세요");
		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		mul(num);
		boolean state=false;
		while(!state) {
			menu();
			int num=sc.nextInt();
			if(num==4) {
				state=true;
				System.out.println("종료");
				break;
			}
			checkmenuNumber(num);
			
		}
		
	}

}
