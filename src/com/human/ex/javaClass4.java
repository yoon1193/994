package com.human.ex;
class Cat{
	String name;
	int age;
}
public class javaClass4 {
	public static void triangle1() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void triangle2() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void triangle3() {
		for(int i=0;i<3;i++) {
			for(int j=i;j<2;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void card(String name,int Num,String adress) {
		System.out.print("이름=");
		System.out.println(name);
		System.out.print("번호=");
		System.out.println(Num);
		System.out.print("주소=");
		System.out.println(adress);
	}
	public static int arrSum(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
		return sum;
		
	}
	public static void calender() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1;i<32;i++) {
			if(i%7==0) {
				System.out.print(i);
				System.out.println();
			}
			else {
			System.out.print(i+"\t");
			}
		}
	}
	public static int intFunc(int a) {
		System.out.println("나이="+a);
		return a;
	}
	public static double doubleFunc(double a) {
		System.out.println("신장="+a);
		return a;
	}
	public static String stringFunc(String s) {
		System.out.println("이름="+s);
		return s;
	}
	public static Cat catFunc(Cat c) {
		Cat rValue=c;
		c.age=c.age+1;
		return c;
	}
	public static int[] intArrFunc(int arr[]) {
		int rArr[]=new int[2];
		rArr[0]=arr[0];
		rArr[1]=arr[1];
		for(int i=0;i<2;i++) {
		rArr[i]=rArr[i]+1;
		}
		return rArr;
	}
	public static Cat[] catArrFunc(Cat[] arr) {
		Cat[] rArr=new Cat[2];
		rArr[0]=new Cat();
		rArr[0].name=arr[0].name;
		rArr[0].age=arr[0].age;
		rArr[1]=new Cat();
		rArr[1].name=arr[1].name;
		rArr[1].age=arr[1].age;
		return rArr;
	}
	
	public static void main(String[] args) {
		//문제1
		triangle1();
		System.out.println();
		triangle2();
		System.out.println();
		triangle3();
		//문제2
		System.out.println();
		card("홍길동",12341234,"두정동");
		System.out.println();
		//문제3
		int []a= {1,2,10};
		arrSum(a);
		System.out.println();
		//문제4
		calender();
		System.out.println();
		System.out.println();
		//문제5
		intFunc(3);
		doubleFunc(80.1);
		stringFunc("고양이");
		System.out.println();
		Cat cat1=new Cat();
		cat1.name="고1";
		cat1.age=11;
		Cat cat2;
		cat2=catFunc(cat1);
		System.out.println(cat1.age);
		System.out.println(cat2.age);
		System.out.println();
		int arr1[]= {1,1};
		int arr2[]=intArrFunc(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println();
		Cat[] cArr1=new Cat[2];
		Cat[] cArr2;
		cArr1[0]=new Cat();
		cArr1[0].name="고1";
		cArr1[0].age=11;
		cArr1[1]=new Cat();
		cArr1[1].name="고2";
		cArr1[1].age=12;
		cArr2=catArrFunc(cArr1);
		System.out.println(cArr1[0].age);
		System.out.println(cArr1[1].age);
		System.out.println(cArr2[0].age);
		System.out.println(cArr2[1].age);
	
		
		
		
		
		 
	}

}
