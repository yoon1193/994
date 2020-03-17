package com.human.ex;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class javaClass01 {

	public static void main(String[] args) {
		//p.5문제
//		int []a= {10,20,30,40,50,60,70,80,90,100};
//		System.out.println(Arrays.toString(a));
//		Scanner sc=new Scanner(System.in);
//		System.out.println("탐색할 값을 입력하세요:");
//		int num=sc.nextInt();
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==num) {
//				System.out.println("탐색 성공 인덱스는"+i+"입니다");
//			}
//		}
//		//p.6문제1
//		String s[]= new String[6];
//		s[0]="A";
//		s[1]="B";
//		s[2]="C";
//		System.out.println(Arrays.toString(s));
//		String s1[]=new String[6];
//		s1[0]=s[0];
//		s1[1]=s[1];
//		s1[2]=s[2];
//		s1[3]=s[2];
//		s1[4]=s[1];
//		s1[5]=s[0];
//		System.out.println(Arrays.toString(s1));
		//p.7문제
//		Random rand=new Random();
//		String []s2= {"a","p","p","l","e"};
//		String temp;
//		for(int i=0;i<s2.length;i++) {
//			int a=rand.nextInt(5);
//			int b=rand.nextInt(5);
//			temp=s2[1];
//			s2[a]=s2[b];
//			s2[b]=temp;
//			System.out.print(s2[i]);
//		}
		//p.7문제4
//		int []a= {1,2,3,4,5,6,7,8,9,10};
//		System.out.println("이동을 원하는 숫자를 입력하시오:");
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		for(int i=0;i<a.length;i++) {
//			a[i]=a[i]+num;
//			if(a[i]>10) {
//				a[i]=0;
//			}
//			System.out.print(" "+a[i]);
//		}
		//p.문제
//		int []a= {1,9,3,6,5,4,7,8,2,10};
//		int []b= {7,8,2,5,10,1,3,6,4,9};
//		int []c= new int[10];
//		for(int i=0;i<10;i++) {
//			c[i]=a[i]*b[i];
//			System.out.print(" "+c[i]);
//		}
//		//p.9문제1
//		int a[]=new int[5];
//		int max=a[0];
//		System.out.println("시험 점수를 입력하세요");
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<5;i++) {
//			int num=sc.nextInt();
//			a[i]=num;
//		}
//		for(int i=0;i<5;i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//			System.out.println(i+1+"번째 사람의 점수는 "+a[i]+"점 입니다");
//		}
//		System.out.println("최고 점수는 "+max+"점 입니다");
//		
//		//p.10문제2
//		int a[] = new int[5];
//		int count=0;
//		System.out.println("시험 점수를 입력하세요");
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 5; i++) {
//			int num = sc.nextInt();
//			a[i] = num;
//		}
//		for (int i = 0; i < 5; i++) {
//			if (a[i] >=70) {
//				count++;
//			}
//			System.out.println(i+1+"번째 사람의 점수는 "+a[i]+"점 입니다");
//		}
//		System.out.println("70점 이상인 학생은 "+count+"명 입니다");
		//p.11
//		int []a=new int[5];
//		double avg1=0;
//		double avg2=0;
//		double avg3=0;
//		String []s= {"국어","영어","수학"};
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.println(i+1+"번 학생"+s[j]+"성적 입력:");
//				int num=sc.nextInt();
//			}			
//		}
		//p.11문제3
//		int []a=new int[4];
//		System.out.println("4자릿수 정수를 입력하세요");
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		a[0]=num/1000;
//		a[1]=num%1000/100;
//		a[2]=num%1000%100/10;
//		a[3]=num%10;
//		for(int i=0;i<4;i++) {
//			System.out.println("a["+i+"]"+"의 값="+a[i]);
//		}
//		for(int i=3;i>=0;i--){
//			System.out.print("역순 출력="+a[i]);
//		}
//		//p.12출석문제
//		int []a=new int[16];
//		int i=0;
//		while(true) {
//			System.out.println(a[i]);
//		}
		//p.12도전
		int a[]=new int[5];
		int max=a[0];
		int min=a[0];
		int avg=0;
		int pn[]=new int[5];
		System.out.println("5명의 심사위원의 점수 입력=");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			int score=sc.nextInt();
			a[i]=score;
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=max&&a[i]!=min) {
				pn[i]=a[i];
				System.out.print(pn[i]);
			}	
			
		
		}
		
	}

}
