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
//		System.out.println("�귣��:"+brand+"����:"+price+"����"+"����:"+phName+"��ȣ:"+phNum);
//	}
//	public void phoneCall(Phone a) {
//		System.out.println(a.phNum+"��ȣ�� ��ȭ��");
//		System.out.println("��ȭ�� �����ʾ� �����Է�");
//	}
//	public void Message(Phone a,String m,int time) {
//		a.remessage=m;
//		System.out.println(a.phNum+"��ȣ�� ���ں���");
//		System.out.println("������ ���:"+phNum);
//		System.out.println(time+"�� �� ����");
//	}
//	public void messageCheck() {
//		System.out.println(phNum+"���� �� ����");
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
		System.out.println("�귣��:"+brand+" "+"����:"+price+"����"+" "+"�� ä��:"+channel+"��");
	}
	public void mChannel(String s) {
		System.out.println("ä�� �Է�");
		rechannel=s;
		System.out.println(channel+"�߿�"+s+"ä�η� �̵�");
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
		Tv tv1=new Tv("�Ｚ",1000,500);
		tv1.TvData();
		tv1.mChannel(sc.nextLine());

	}

}
