package com.human.ex1;

class Cat{
	public static int ageVaccination=5;
	public String name="�̸�";//�ν��Ͻ� �ʵ�
	public int age=0;
	public static void changeAgeVaccination(int ageVacc) {
		//static �޼ҵ忡���� �ν��Ͻ� �ʵ忡 �����Ҽ�����.
		//static �޼ҵ忡���� static�ʵ忡 ���� �Ҽ��ִ�.
		//�ν��Ͻ� �޼ҵ忡���� static �ʵ忡 ���� �� ���ִ�.
		Cat.ageVaccination=ageVacc;
	}
	public String isVaccination() {
		String returnValue="";
		if(Cat.ageVaccination<age) {
			returnValue="��������";
		}else {
			returnValue="��������X";
		}
		return returnValue;
	}
	public Cat() {
		System.out.println("�⺻������ �Լ� ����");
	}
	
	public Cat(String name) {//�����ε�
		this(name,1);
	}
	
	public Cat(String name,int age) {//�����ڸ޼ҵ�=�ν��Ͻ� ������ ���� �ʱ�ȭ�ϴµ� ���;���ϰ� X,Ŭ������� �̸��� ����!
		//���� ���ټ���=1.��������2.�ν��Ͻ��ʵ�3.Ŭ�����ʵ�
		this.name=name;
		this.age=age;
	}
	
	//public,private,(default,protected �߾Ⱦ�) 
	public void catPrint() {//public �ν��Ͻ��޼ҵ�,������ҵ�
		System.out.println(name+" "+age);
	}
	
	public void catAddAge(int age1) {
		age+=age1;
	}
}

public class classStart {
	public static void catPrint(Cat c) {//public static Ŭ�����޼ҵ�,����ƽ�޼ҵ�
		System.out.println(c.name+" "+c.age);
	}
	
	public static void main(String[] args) {
		
//		Cat cat1=new CAt();
//		cat1.name="��1";
//		cat1.age=13;
//		Cat cat2=new Cat();
//		cat2.name ="��2";
//		cat2.age=14;
//		Cat cat3=new Cat();
//		cat3.name ="��3";
//		cat3.age=15;
		//����� ���̰� 5�� �����̸� ��������
		//1.���� �ٲ�� 6��� ����
		//�ν��Ͻ����� ���� �� �� �ִ� ����Static
		System.out.println(Cat.ageVaccination);
		Cat.changeAgeVaccination(10);
		System.out.println(Cat.ageVaccination);
		Cat cat1=new Cat("��1",13);
		cat1.age=3;
		System.out.println(cat1.isVaccination());
		System.out.println(Cat.ageVaccination);
		System.out.println(cat1.ageVaccination);
		Cat cat2=new Cat("��2",14);
		Cat cat3=new Cat("��3",15);
		Cat cat4=new Cat();
		Cat cat5=new Cat("��5");
		//����� ���̸� �Ű����� ��ŭ ����,���� ��Ű�� �Լ�
		cat1.catAddAge(5);
		cat2.catAddAge(6);
		cat3.catAddAge(7);
		//��ü�� �Լ� ���
		cat1.catPrint();
		cat2.catPrint();
		cat3.catPrint();
		cat4.catPrint();
		cat5.catPrint();
//		//������ ���
//		System.out.println(cat1.name+" "+cat1.age);
//		System.out.println(cat2.name+" "+cat2.age);
//		System.out.println(cat3.name+" "+cat3.age);
//		//�Լ��� ���
//		catPrint(cat1);
//		catPrint(cat2);
//		catPrint(cat3);

	}

}
