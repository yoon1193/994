 package com.human.ex;

import java.util.Scanner;

	public class javaClass12 {	public static void menu() {
		System.out.println("1.�ܹ��� 2.ġ����� 3.������ġ 4.����");
		System.out.println("���ϴ� �޴��� ������");
	}
	public static void checkmenuNumber(int a) {
		if(a==1) {
			ham();
		}
		else if(a==2) {
			cheeze();
		}
		else if(a==3) {
			san();
		}
		else if(a<1||a>4){
			System.out.println("�߸��Է�");
		}
	}
	public static void ham() {
		System.out.println("1�� �޴��� ���� �Ǿ����ϴ�.");
	}
	public static void cheeze() {
		System.out.println("2�� �޴��� ���� �Ǿ����ϴ�.");
	}
	public static void san() {
		System.out.println("3�� �޴��� ���� �Ǿ����ϴ�.");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean state=false;
		while(!state) {
			menu();
			int menuNum=sc.nextInt();
			if(menuNum==4) {
				state=true;
				System.out.println("����");
			}
			checkmenuNumber(menuNum);
	}
	}

}
