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
//	//static(Ŭ����) �޼ҵ忡���� �ν��Ͻ� �ʵ忡 �����Ҽ�����.
//	//static(Ŭ����) �޼ҵ忡���� static(Ŭ����) �ʵ忡 ���� �Ҽ��ִ�.
//	//�ν��Ͻ� �޼ҵ忡���� static(Ŭ����) �ʵ忡 ���� �� ���ִ�.
//	public Exchange() {}
//	public Exchange(double dollar,double won) {
//		this.dollar=dollar;
//		this.won=won;
//	}
//	public void exchangeDollartoWon() {
//		System.out.println(dollar+"�޷��� ȯ���� �ݾ���");
//		rWon=dollar*exchangeRate*(1-exchangeTax);//dollar*exchangeRate-(dollar*exchangeRate*exchangeTax)
//		System.out.println(rWon+"�� �Դϴ�");
//	}
//	public void exchangeWontoDollar() {
//		System.out.println(won+"���� ȯ���� �ݾ���");
//		rDollar=won/exchangeRate*(1-exchangeTax);//won/exchangeRate-(won/exchangeRate*exchangeTax)
//		System.out.println(rDollar+"�޷� �Դϴ�");//System.out.println(String.format("%.3f", changeMoney)+"�޷� �Դϴ�");
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
