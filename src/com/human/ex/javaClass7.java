package com.human.ex;
//class Cat{
//	String name;
//	int age;
//}
public class javaClass7 {
	public static Cat catFunc(Cat c) {
		Cat rValue=c;
		c.age=c.age+1;
		return c;
	}
	public static void main(String[] args) {
		Cat cat1=new Cat();
		cat1.name="°í1";
		cat1.age=11;
		Cat cat2;
		cat2=catFunc(cat1);
		System.out.println(cat1.age);
		System.out.println(cat2.age);
	}

}
