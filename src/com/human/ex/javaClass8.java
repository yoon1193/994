 package com.human.ex;
//class Cat{
//	String name;
//	int age;
//}
public class javaClass8 {

	public static Cat[] catArrFunc(Cat[] arr) {
		Cat[] rArr=new Cat[2];
		rArr[0]=new Cat();
		rArr[0].name=arr[0].name;
		rArr[0].age=arr[0].age;
		rArr[0].age=2;
		
		rArr[1]=new Cat();
		rArr[1].name=arr[1].name;
		rArr[1].age=arr[1].age;
		rArr[1].age=8;
		return rArr;
		
	}
	public static void main(String[] args) {
		Cat[] cArr1=new Cat[2];
		Cat[] cArr2;
		
		cArr1[0]=new Cat();
		cArr1[0].name="°í1";
		cArr1[0].age=11;
		
		cArr1[1]=new Cat();
		cArr1[1].name="°í2";
		cArr1[1].age=12;
		
		cArr2=catArrFunc(cArr1);
		System.out.println(cArr1[0].age);
		System.out.println(cArr1[1].age);
		System.out.println(cArr2[0].age);
		System.out.println(cArr2[1].age);
		
//		cArr2=cArr1;
//		cArr2[1].age=6;
//		System.out.println(cArr1[1].age);
//		System.out.println(cArr2[1].age);
	}

}
