package com.human.ex1;
class ExchangeClass{
	public static double exchangeRate=1200;
	public static double exchangeTax=0.05;
	public double dollar=0;
	public double won=0;
	public double rDollar=0;
	public double rWon=0;
	public ExchangeClass() {}
	public ExchangeClass(double exchangeRate, double exchangeTax, double dollar, double won) {
		this.exchangeRate = exchangeRate;
		this.exchangeTax = exchangeTax;
		this.dollar = dollar;
		this.won = won;
		
	}
	public static void changeExchangeRate() {//static ���� ȯ������, ��������ִ� static�޼ҵ�
		ExchangeClass.exchangeRate=exchangeRate*1.1;
	}
//	public void changeExchangeRate2() {
//		ExchangeClass.exchangeRate=exchangeRate*1.1;
//	}
	public double exchangeWonToDollar() {
		this.rDollar=this.won / this.exchangeRate * (1 - this.exchangeTax);
		return this.rDollar;
	}

	public double exchangeDollarToWon() {
		this.rWon=this.dollar * this.exchangeRate * (1 - this.exchangeTax);
		return this.rWon;
	}
	public void display() {
		System.out.println("exRate:" + this.exchangeRate);
		System.out.println("exTax:" + this.exchangeTax);
		System.out.println("dollar:" + this.dollar);
		System.out.println("rDollar:" + this.rDollar);
		System.out.println("won:" + this.won);
		System.out.println("rWon:" + this.rWon);
	}
	
}
public class classStart6 {
	

	public static void main(String[] args) {
		System.out.println(ExchangeClass.exchangeRate);
		ExchangeClass.changeExchangeRate();
		System.out.println(ExchangeClass.exchangeRate+"�����");
//		new ExchangeClass().changeExchangeRate2();
		
		ExchangeClass user1=new ExchangeClass(1200,0.05,20,20000);
//		user1.changeExchangeRate();
//		user1.exchangeWonToDollar();
//		user1.exchangeDollarToWon();
//		user1.display();
		ExchangeClass user2=new ExchangeClass(1200,0.05,30,30000);
		ExchangeClass user3=new ExchangeClass(1200,0.05,40,40000);
		user1.exchangeWonToDollar();
		user2.exchangeWonToDollar();
		user3.exchangeWonToDollar();
		user1.exchangeDollarToWon();
		user2.exchangeDollarToWon();
		user3.exchangeDollarToWon();
		user1.display();
		user2.display();
		user3.display();
		
		//�����ִ� �ڵ带 ����,�����ִ� �޼ҵ带 ����,������ ���Ѱ�,�����Ǵ�data�� Static,Static�޼ҵ带 �̿���Static�ʵ尪�� ����ϰ�!
	}
	

}
