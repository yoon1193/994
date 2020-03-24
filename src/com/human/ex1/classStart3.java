package com.human.ex1;

import java.util.Scanner;

//class Phone{
//	public int phNum;
//	public String brand;
//	public int price;
//	public String phName;
//	public String remessage;
//	public Phone() {}
//	public Phone(String brand ,int price,String phName,int phNum) {
//		this.brand=brand;
//		this.price=price;
//		this.phName=phName;
//		this.phNum=phNum;
//		this.remessage="";
//		
//	}
//	
//	public void phoneData() {
//		System.out.println("브랜드:"+brand+"가격:"+price+"만원"+"기종:"+phName+"번호:"+phNum);
//	}
//	public void phoneCall(Phone a) {
//		System.out.println(a.phNum+"번호로 전화중");
//		System.out.println("전화를 받지않아 문자입력");
//	}
//	public void Message(Phone a,String m,int time) {
//		a.remessage=m;
//		System.out.println(a.phNum+"번호로 문자보냄");
//		System.out.println("보내는 사람:"+phNum);
//		System.out.println(time+"분 후 전송");
//	}
//	public void messageCheck() {
//		System.out.println(phNum+"에게 온 문자");
//		System.out.println(remessage);
//	}
//	
//	
//}
class Tv{
	public String brand;
	public int price;
	public int channel;
	public int volume=0;
	public String rechannel;
	public Tv() {}
	public Tv(String b,int p,int c) {
		this.brand=b;
		this.price=p;
		this.channel=c;
		
	}
	public void TvData() {
		System.out.println("브랜드:"+brand+" "+"가격:"+price+"만원"+" "+"총 채널:"+channel+"개");
	}
	public void mChannel(String s) {
		System.out.println("채널 입력");
		rechannel=s;
		System.out.println(channel+"중에"+s+"채널로 이동");
	}

}
class Ev{
	
}


public class classStart3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Phone p1=new Phone("Apple",130,"iphonepro",8888);
//		Phone p2=new Phone("LG",100,"lg",5555);
//		p1.phoneData();
//		p2.phoneData();
//		p1.phoneCall(p2);
//		p1.Message(p2,sc.nextLine(),15);
//		p2.messageCheck();
		System.out.println("==============================");
		Tv tv1=new Tv("삼성",1000,500);
		tv1.TvData();
		tv1.mChannel(sc.nextLine());

	}

}
