package com.human.ex1;
//package com.human.ex1;
//
//import java.util.Scanner;
//
//class Exchange{
//	public static double exchangeRate=1200;
//	public static double exchangeTax=0.05;
//	public double won=0;
//	public double dollar=0;
//	public double rDollar=0;
//	public double rWon=0;
//	//static(클래스) 메소드에서는 인스턴스 필드에 접급할수없다.
//	//static(클래스) 메소드에서는 static(클래스) 필드에 접근 할수있다.
//	//인스턴스 메소드에서는 static(클래스) 필드에 접근 할 수있다.
//	public Exchange() {}
//	public Exchange(double dollar,double won) {
//		this.dollar=dollar;
//		this.won=won;
//	}
//	public void exchangeDollartoWon() {
//		System.out.println(dollar+"달러의 환전된 금액은");
//		rWon=dollar*exchangeRate*(1-exchangeTax);//dollar*exchangeRate-(dollar*exchangeRate*exchangeTax)
//		System.out.println(rWon+"원 입니다");
//	}
//	public void exchangeWontoDollar() {
//		System.out.println(won+"원의 환전된 금액은");
//		rDollar=won/exchangeRate*(1-exchangeTax);//won/exchangeRate-(won/exchangeRate*exchangeTax)
//		System.out.println(rDollar+"달러 입니다");//System.out.println(String.format("%.3f", changeMoney)+"달러 입니다");
//	}
//}
//public class classStart7 {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		Exchange user=new Exchange(20,20000);
//		Exchange user1=new Exchange(30,30000);
//		Exchange user2=new Exchange(40,40000);
//		user.exchangeDollartoWon();
//		user.exchangeWontoDollar();
//		user1.exchangeDollartoWon();
//		user1.exchangeWontoDollar();
//		user2.exchangeDollartoWon();
//		user2.exchangeWontoDollar();
//		
//	}
//
//}
