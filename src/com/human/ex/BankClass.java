package com.human.ex;

import java.util.Scanner;

public class BankClass {

	public static int account;
	public static String s="";
	public static Scanner sc=new Scanner(System.in);
	public static int input=0;
	public static int output=0;
	public static void in() {
		System.out.println("�Ա� �� �ݾ��� �־��ּ���");
		input=sc.nextInt();
		account=account+input;
		System.out.println(input+"�� �ԱݿϷ�");
		System.out.println("���� �ܾ���"+ account+"�� �Դϴ�");
	}
	public static void out() {
		System.out.println("��� �� �ݾ��� �Է��ϼ���");
		output=sc.nextInt();
		if(output>account) {
			System.out.println("�ܾ� ����");
		}
		else {
			account=account-output;
			System.out.println(output+"�� ��ݿϷ�");
		}
		
		System.out.println("���� �ܾ���"+ account+"�� �Դϴ�");
	}
	public static void money() {
		System.out.println("��ȸ �� �ݾ���"+account+"�� �Դϴ�");
	}
	public static void end() {
		System.out.println("����");
	}
	public static void wrong() {
		System.out.println("�� ���� �Է��Դϴ�.");
	}
	public static void bank() {
		while(!s.equals("4")) {
			System.out.println("1:�Ա�, 2:���, 3:��ȸ, 4:����");
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
