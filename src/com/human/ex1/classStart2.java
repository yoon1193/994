package com.human.ex1;
//Card�� ���� Card�� �ʺ�,Card�Ǹ��,Card�� ����
//class Card{
//	Ŭ���� �ȿ� �����Ѱ͵�
//	1.�ν��Ͻ� �ʵ�(����,�������)
//	-������ �ν��Ͻ����� ���� ���� ������ ����
//	2.Ŭ���� �ʵ�(����,static����,��������)
//	-��� �ν��Ͻ����� ���� �����ϴ� ����
//	3.�ν��Ͻ� �޼ҵ�
//	4.Ŭ���� �޼ҵ�	
// 	5.������ �޼ҵ�
//}
//Card c1=new Card();//c1�� �ν��Ͻ�ȭ �Ǿ���.
//Card c2=new Card();
//��ü
//�ν��Ͻ�-��ü�� ����Ҽ��ֵ��� �޸𸮿� �ö� ����
//Ŭ����-���� ���α׷����� ��ü�����Ҷ� ����ϴ� Ű����
//�ν��Ͻ�-Ŭ������ ������ ��ü
//Ŭ����-��ü������� �����س��� Ű����
class Card{
	public static int width=100;//Ŭ�����ʵ�
	public static int height=200;
	public String shape="�����̵�";//�ν��Ͻ� �ʵ�
	public String number="2";
	
	//ī���� ���̸� �����ϴ� Ŭ�����޼ҵ�
	public static int area() {
		return Card.height*Card.width;
	}
	//�ν��Ͻ� �޼ҵ�
	public int cardDisplay() {
		return width*height;
	}
	//�����ڸ޼ҵ�
	public Card() {}
	public Card(String shape,String number) {
		this.shape=shape;
		this.number=number;
	}
}
public class classStart2 {

	public static void main(String[] args) {
	System.out.println(Card.area());
	
	//c ������������ �ּҰ� �������
	//���������� ����ִ°��� ������(�޸��ּҰ� ���̵�)
	Card c=new Card();
	System.out.println(c.cardDisplay());

	}

}
