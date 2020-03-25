//package com.human.ex1;
//class ExchangeClass{
//	public double exchangeRate=1200;
//	public double exchangeTax=0.05;
//	public double dollar=0;
//	public double won=0;
//	public double rDollar=0;
//	public double rWon=0;
//	public ExchangeClass() {}
//	public ExchangeClass(double exchangeRate, double exchangeTax, double dollar, double won) {
//		this.exchangeRate = exchangeRate;
//		this.exchangeTax = exchangeTax;
//		this.dollar = dollar;
//		this.won = won;
//		
//	}
//	public double exchangeWonToDollar() {
//		this.rDollar=this.won / this.exchangeRate * (1 - this.exchangeTax);
//		return this.rDollar;
//	}
//
//	public double exchangeDollarToWon() {
//		this.rWon=this.dollar * this.exchangeRate * (1 - this.exchangeTax);
//		return this.rWon;
//	}
//	public void display() {
//		System.out.println("exRate:" + this.exchangeRate);
//		System.out.println("exTax:" + this.exchangeTax);
//		System.out.println("dollar:" + this.dollar);
//		System.out.println("rDollar:" + this.rDollar);
//		System.out.println("won:" + this.won);
//		System.out.println("rWon:" + this.rWon);
//	}
//	
//}
//public class classStart5 {
//	
//
//	public static void main(String[] args) {
//		ExchangeClass user1=new ExchangeClass(1200,0.05,20,20000);
//		ExchangeClass user2=new ExchangeClass(1200,0.05,30,30000);
//		ExchangeClass user3=new ExchangeClass(1200,0.05,40,40000);
//		user1.exchangeWonToDollar();
//		user2.exchangeWonToDollar();
//		user3.exchangeWonToDollar();
//		user1.exchangeDollarToWon();
//		user2.exchangeDollarToWon();
//		user3.exchangeDollarToWon();
//		user1.display();
//		user2.display();
//		user3.display();
//	}
//	
//
//}
