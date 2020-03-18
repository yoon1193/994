package com.human.ex;

public class javaClass5 {
	public static void b() {
		System.out.println("b함수의 시작");
		System.out.println("b함수의 종료");
	}
	
	public static void a() {
		System.out.println("a함수의 시작");
		b();
		System.out.println("a함수의 종료");
	}
	public static void c() {
		System.out.println("c함수의 시작");
		
		System.out.println("c함수의 종료");
	}
	public static void d() {
		System.out.println("d함수의 시작");
		
		System.out.println("d함수의 종료");
	}
	

	public static void main(String[] args) {
		a();
		c();
		d();
		
	
	}

}
