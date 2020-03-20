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
	public static int evensum(){
		int sum=0;
		System.out.print("1~100까지 짝수의 합은=");
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static int oddSum(){
		int sum1=0;
		System.out.print("1~100까지 홀수의 합은=");
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				sum1+=i;
			}
		}
		return sum1;
	}
	public static void sum() {
		System.out.println("짝수의 합="+evensum());
		System.out.println("홀수의 합="+oddSum());
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("입력하시오");
		int num=sc.nextInt();
		mul(num);
		sum();
		
	}

}
