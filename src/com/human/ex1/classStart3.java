package com.human.ex1;

class Phone{
	public int phNum;
	public String brand;
	public int price;
	public String phName;
	public Phone() {}
	public Phone(String brand ,int price,String phName,int phNum) {
		this.brand=brand;
		this.price=price;
		this.phName=phName;
		this.phNum=phNum;
	}
	
	public void phoneData() {
		System.out.println("�귣��:"+brand+"����:"+price+"����"+"����:"+phName+"��ȣ:"+phNum);
	}
	public void Call(String to,String num) {
		System.out.println("�߽���:"+phName);
		System.out.println("�߽��� ��ȣ:"+phNum);
		System.out.println("������:"+to);
		System.out.println("������ ��ȣ"+num);
	}
	public void Message(String to,String s,String time) {
		System.out.println("������ ���:"+phNum);
		System.out.println("�޴� ���:"+to);
		System.out.println("����:"+s);
		System.out.println("����ð�:"+time);
	}
	
}
class Tv{
	public String brand;
	public int price;
	
	public Tv() {}
	public Tv(String b,int p) {
		this.brand=b;
		this.price=p;
	}
	public void TvData() {
		System.out.println("�귣��:"+brand+"����:"+price+"����");
	}

}
class Ev{
	
}


public class classStart3 {

	public static void main(String[] args) {
		Phone ip=new Phone("Apple",130,"������",88889999);
		ip.phoneData();
		ip.Message("ȫ�浿","����","15����");
		ip.Call("����","77776666");
		System.out.println("==========================");
		
		Tv tv1=new Tv("SS",500);
		tv1.TvData();
		

	}

}
