//
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
//	}
//}
//public class classStart4 {
//	//class+함수
//	public static double exchangeWonToDollar(ExchangeClass ec) {
//		ec.rDollar=ec.won / ec.exchangeRate * (1 - ec.exchangeTax);
//		return ec.rDollar;
//	}
//
//	public static double exchangeDollarToWon(ExchangeClass ec) {
//		ec.rWon=ec.dollar * ec.exchangeRate * (1 - ec.exchangeTax);
//		return ec.rWon;
//	}
//	
//	//함수적 절차
//	public static double exchangeWonToDollar(double won, double rate, double tax) {
//		return won / rate * (1 - tax) ;
//	}
//
//	public static double exchangeDollarToWon(double dollar, double rate, double tax) {
//		return dollar * rate * (1 - tax);
//
//	}
//
//	//class+함수
//	public static void display(ExchangeClass ec) {
//
//		System.out.println("exRate:" + ec.exchangeRate);
//		System.out.println("exTax:" + ec.exchangeTax);
//		System.out.println("dollar:" + ec.dollar);
//		System.out.println("rDollar:" + ec.rDollar);
//		System.out.println("won:" + ec.won);
//		System.out.println("rWon:" + ec.rWon);
//	}
//	
//	//함수적
//	public static void display(String user, double rate, double tax, double dollar, double rDollar, double won,
//			double rWon) {
//		System.out.println("exUser:" + user);
//		System.out.println("exRate:" + rate);
//		System.out.println("exTax:" + tax);
//		System.out.println("dollor:" + dollar);
//		System.out.println("rDollor:" + rDollar);
//		System.out.println("won:" + won);
//		System.out.println("rWon:" + rWon);
//	}
//
//	public static void main(String[] args) {
//		//class+함수
//		ExchangeClass user1=new ExchangeClass(1200,0.05,20,20000);
//		ExchangeClass user2=new ExchangeClass(1200,0.05,30,30000);
//		ExchangeClass user3=new ExchangeClass(1200,0.05,40,40000);
//		exchangeWonToDollar(user1);
//		exchangeWonToDollar(user2);
//		exchangeWonToDollar(user3);
//		exchangeDollarToWon(user1);
//		exchangeDollarToWon(user2);
//		exchangeDollarToWon(user3);
//		display(user1);
//		display(user2);
//		display(user3);
//		//절차적 절차
//		double exchangeRate1=1200,exchangeRate2=1200,exchangeRate3=1200;
//		double exchangeTax1=0.05,exchangeTax2=0.05,exchangeTax3=0.05;
//		double dollar1=20,dollar2=30,dollar3=40;
//		double won1=20000,won2=30000,won3=40000;
//		double rDollar1=0,rDollar2=0,rDollar3=0;
//		double rWon1=0,rWon2=0,rWon3=0;
//		rDollar1=won1/exchangeRate1*(1-exchangeTax1);
//		rDollar2=won2/exchangeRate2*(1-exchangeTax2);
//		rDollar3=won3/exchangeRate3*(1-exchangeTax3);
//		rWon1=dollar1*exchangeRate1*(1-exchangeTax1);
//		rWon1=dollar2*exchangeRate2*(1-exchangeTax2);
//		rWon1=dollar3*exchangeRate3*(1-exchangeTax3);
//		//함수적
//		rDollar1=exchangeWonToDollar(won1,exchangeRate1,exchangeTax1);
//		rDollar2=exchangeWonToDollar(won2,exchangeRate2,exchangeTax2);
//		rDollar3=exchangeWonToDollar(won3,exchangeRate3,exchangeTax3);
//		rWon1=exchangeDollarToWon(dollar1,exchangeRate1,exchangeTax1);
//		rWon2=exchangeDollarToWon(dollar2,exchangeRate2,exchangeTax2);
//		rWon3=exchangeDollarToWon(dollar3,exchangeRate3,exchangeTax3);
//		display("1",exchangeRate1,exchangeTax1,dollar1,rDollar1
//			    ,won1,rWon1);
//		display("2",exchangeRate2,exchangeTax2,dollar2,rDollar2
//			    ,won2,rWon2);
//		display("3",exchangeRate3,exchangeTax3,dollar3,rDollar3
//	    ,won3,rWon3);
//	}
//	
//
//}
