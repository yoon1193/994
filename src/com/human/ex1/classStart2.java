package com.human.ex1;
//Card의 높이 Card의 너비,Card의모양,Card의 숫자
//class Card{
//	클래스 안에 생성한것들
//	1.인스턴스 필드(변수,멤버변수)
//	-각각의 인스턴스들이 값을 따로 가지는 변수
//	2.클래스 필드(변수,static변수,정적변수)
//	-모든 인스턴스에서 값을 공유하는 변수
//	3.인스턴스 메소드
//	4.클래스 메소드	
// 	5.생성자 메소드
//}
//Card c1=new Card();//c1이 인스턴스화 되었따.
//Card c2=new Card();
//객체
//인스턴스-객체가 사용할수있도록 메모리에 올라간 형태
//클래스-실제 프로그램에서 객체구현할때 사용하는 키워드
//인스턴스-클래스로 생선된 객체
//클래스-객체만들려고 선언해놓은 키워드
//static(클래스) 메소드에서는 인스턴스 필드에 접급할수없다.
//static(클래스) 메소드에서는 static(클래스) 필드에 접근 할수있다.
//인스턴스 메소드에서는 static(클래스) 필드에 접근 할 수있다.
class Card{
	public static int width=100;//클래스필드
	public static int height=200;
	public String shape="스페이드";//인스턴스 필드
	public String number="2";
	
	//카드의 넓이를 리턴하는 클래스메소드
	public static int area() {
		return Card.height*Card.width; 
	} 
	
	//인스턴스 메소드
	public String cardDisplay() {
		return shape+number;
	} 
	//생성자메소드
	public Card() {}
	public Card(String shape,String number) {
		this.shape=shape;
		this.number=number;
	}
}
public class classStart2 {

	public static void main(String[] args) {
	System.out.println(Card.area());
	
	//c 참조변수에는 주소가 들어있음
	//참조변수에 들어있는값을 참조값(메모리주소가 값이됨)
	Card c=new Card();
	System.out.println(c.cardDisplay());

	}

}
