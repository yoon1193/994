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
		System.out.println("브랜드:"+brand+"가격:"+price+"만원"+"기종:"+phName+"번호:"+phNum);
	}
	public void Call(String to,String num) {
		System.out.println("발신자:"+phName);
		System.out.println("발신자 번호:"+phNum);
		System.out.println("수신자:"+to);
		System.out.println("수신자 번호"+num);
	}
	public void Message(String to,String s,String time) {
		System.out.println("보내는 사람:"+phNum);
		System.out.println("받는 사람:"+to);
		System.out.println("내용:"+s);
		System.out.println("예약시간:"+time);
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
		System.out.println("브랜드:"+brand+"가격:"+price+"만원");
	}

}
class Ev{
	
}


public class classStart3 {

	public static void main(String[] args) {
		Phone ip=new Phone("Apple",130,"아이폰",88889999);
		ip.phoneData();
		ip.Message("홍길동","뭐해","15분후");
		ip.Call("김김김","77776666");
		System.out.println("==========================");
		
		Tv tv1=new Tv("SS",500);
		tv1.TvData();
		

	}

}
