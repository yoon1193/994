package com.human.ex;

public class javaClass5 {
	public static void b() {
		System.out.println("b�Լ��� ����");
		System.out.println("b�Լ��� ����");
	}
	
	public static void a() {
		System.out.println("a�Լ��� ����");
		b();
		System.out.println("a�Լ��� ����");
	}
	public static void c() {
		System.out.println("c�Լ��� ����");
		
		System.out.println("c�Լ��� ����");
	}
	public static void d() {
		System.out.println("d�Լ��� ����");
		
		System.out.println("d�Լ��� ����");
	}
	

	public static void main(String[] args) {
		a();
		c();
		d();
		
	
	}

}
