 package com.human.ex;

import java.util.Scanner;

public class javaClass11 {
	public static int mul(int a) {
		System.out.println("-"+a+"�� "+"-");
		for(int i=1;i<=9;i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}
		return 0;
	}
	public static int arr(){
		int sum=0;
		int temp=0;
		System.out.print("a~b���� ¦���� ����=");
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
		System.out.print("a~b���� Ȧ���� ����=");
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				sum1+=i;
			}
		}
		return sum1;
	}
	public static void sum() {
		System.out.println("¦���� ��="+arr());
		System.out.println("Ȧ���� ��="+arr1());
	}
	public static void menu() {
		System.out.println("1.�ܹ��� 2.ġ����� 3.������ġ 4.����");
		System.out.println("���ϴ� �޴��� ������");
	}
	public static void checkmenuNumber(int a) {
		if(a>=1&&a<=3) {
			System.out.println(a+"�� �޴��� ���õǾ����ϴ�.");
		}
		else {
			System.out.println("�� �� �Է�");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("�ϳ��� ���ڸ� �Է��ϼ���");
		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		mul(num);
		boolean state=false;
		while(!state) {
			menu();
			int num=sc.nextInt();
			if(num==4) {
				state=true;
				System.out.println("����");
				break;
			}
			checkmenuNumber(num);
			
		}
		
	}

}
