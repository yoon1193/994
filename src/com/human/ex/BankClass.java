package com.human.ex;

import java.util.Scanner;

public class BankClass {

	public static int account;
	public static String s="";
	public static Scanner sc=new Scanner(System.in);
	public static int input=0;
	public static int output=0;
	public static void in() {
		System.out.println("입금 할 금액을 넣어주세요");
		input=sc.nextInt();
		account=account+input;
		System.out.println(input+"원 입금완료");
		System.out.println("현재 잔액은"+ account+"원 입니다");
	}
	public static void out() {
		System.out.println("출금 할 금액을 입력하세요");
		output=sc.nextInt();
		if(output>account) {
			System.out.println("잔액 부족");
		}
		else {
			account=account-output;
			System.out.println(output+"원 출금완료");
		}
		
		System.out.println("현재 잔액은"+ account+"원 입니다");
	}
	public static void money() {
		System.out.println("조회 된 금액은"+account+"원 입니다");
	}
	public static void end() {
		System.out.println("종료");
	}
	public static void wrong() {
		System.out.println("잘 못된 입력입니다.");
	}
	public static void bank() {
		while(!s.equals("4")) {
			System.out.println("1:입금, 2:출금, 3:조회, 4:종료");
			s = sc.next();
			switch(s) {
			case "1":
				in();
				break;
			case "2":
				out();
				break;
			case "3":
				money();
				break;
			case "4":
				end();
				break;
			default:
				wrong();
				break;
			}	
		}
	}
	public static void main(String[] args) {
		bank();
	}
}
