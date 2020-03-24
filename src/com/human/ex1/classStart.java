package com.human.ex1;

class Cat{
	public static int ageVaccination=5;
	public String name="이름";//인스턴스 필드
	public int age=0;
	public static void changeAgeVaccination(int ageVacc) {
		//static 메소드에서는 인스턴스 필드에 접급할수없다.
		//static 메소드에서는 static필드에 접근 할수있다.
		//인스턴스 메소드에서는 static 필드에 접근 할 수있다.
		Cat.ageVaccination=ageVacc;
	}
	public String isVaccination() {
		String returnValue="";
		if(Cat.ageVaccination<age) {
			returnValue="예방접종";
		}else {
			returnValue="예방접종X";
		}
		return returnValue;
	}
	public Cat() {
		System.out.println("기본생성자 함수 실행");
	}
	
	public Cat(String name) {//오버로드
		this(name,1);
	}
	
	public Cat(String name,int age) {//생성자메소드=인스턴스 변수의 값을 초기화하는데 사용;리턴값 X,클래스명과 이름이 동일!
		//변수 접근순서=1.지역변수2.인스턴스필드3.클래스필드
		this.name=name;
		this.age=age;
	}
	
	//public,private,(default,protected 잘안씀) 
	public void catPrint() {//public 인스턴스메소드,멤버베소드
		System.out.println(name+" "+age);
	}
	
	public void catAddAge(int age1) {
		age+=age1;
	}
}

public class classStart {
	public static void catPrint(Cat c) {//public static 클래스메소드,스테틱메소드
		System.out.println(c.name+" "+c.age);
	}
	
	public static void main(String[] args) {
		
//		Cat cat1=new CAt();
//		cat1.name="고1";
//		cat1.age=13;
//		Cat cat2=new Cat();
//		cat2.name ="고2";
//		cat2.age=14;
//		Cat cat3=new Cat();
//		cat3.name ="고3";
//		cat3.age=15;
		//고양이 나이가 5삻 이하이면 예방접종
		//1.법이 바뀌면 6살로 변경
		//인스턴스들이 공유 할 수 있는 변수Static
		System.out.println(Cat.ageVaccination);
		Cat.changeAgeVaccination(10);
		System.out.println(Cat.ageVaccination);
		Cat cat1=new Cat("고1",13);
		cat1.age=3;
		System.out.println(cat1.isVaccination());
		System.out.println(Cat.ageVaccination);
		System.out.println(cat1.ageVaccination);
		Cat cat2=new Cat("고2",14);
		Cat cat3=new Cat("고3",15);
		Cat cat4=new Cat();
		Cat cat5=new Cat("고5");
		//고양이 나이를 매개변수 만큼 증가,감소 시키는 함수
		cat1.catAddAge(5);
		cat2.catAddAge(6);
		cat3.catAddAge(7);
		//객체안 함수 방식
		cat1.catPrint();
		cat2.catPrint();
		cat3.catPrint();
		cat4.catPrint();
		cat5.catPrint();
//		//절차적 방식
//		System.out.println(cat1.name+" "+cat1.age);
//		System.out.println(cat2.name+" "+cat2.age);
//		System.out.println(cat3.name+" "+cat3.age);
//		//함수적 방식
//		catPrint(cat1);
//		catPrint(cat2);
//		catPrint(cat3);

	}

}
