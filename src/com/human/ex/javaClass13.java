 package com.human.ex;

import java.util.Scanner;


public class javaClass13 {
	public static int total=0;
	public static int save(int amount) {
		total+=amount;
		System.out.println("���ݱ����� ������� "+total+"�� �Դϴ�.");
		return total;
	}
	public static int draw(int amount) {
		total-=amount;
		System.out.println("���ݱ����� ������� "+total+"�� �Դϴ�.");
		return total;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean state = false;
		while(!state) {
			System.out.println("1.�Ա�    2.���  3.����");
			int i=sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("�󸶸� �Ա� �ұ��?");
				int in=sc.nextInt();
				save(in);
				break;
			case 2:
				System.out.println("�󸶳� ��� �ұ��?");
				int out=sc.nextInt();
				draw(out);
				break;
			case 3:
				state=true;
				System.out.println("����");
			}
			
			
		}
	}

}
