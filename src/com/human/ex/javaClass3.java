package com.human.ex;
public class javaClass3 {
	//메소드의 지역변수는 메쏘드가 실행되면 stack에 올라간다.
	//메소드간 지역변수는 공유되지 않는다
	//메소드가 종료되면 메모리에서 사라진다
	//코드블럭의 지역변수는 코드블록이 종료되면 사라진
	public static int sum(int a,int b) {
	int sum=0;
	sum=a+b;
	return sum;
	}
	public static int min(int a,int b) {
	return a-b;
	}
	public static int mul(int a,int b) {
	return a*b;
	}
	public static int div(int a,int b) {
	return a/b;
	}
	public static int allSum(int a,int b) {
	int sum=0;
	int temp=0;
	if(a>b) {
		temp=a;
		a=b;
		b=temp;
	}
	for(int i=a;a<=b;a++) {
	sum+=a;
	}
	return sum;
	}
	public static void hello() {
		System.out.println("안녕하세요");
	}

	public static void main(String[] args) {
		int a=sum(1,2);
		int b=a+sum(2,2);
		System.out.println(a+" "+b);
		int a1=min(1,2);
		int b1=a1-min(2,2);
		System.out.println(a1+" "+b1);
		int a2=mul(1,2);
		int b2=a2*mul(2,2);
		System.out.println(a2+" "+b2);
		int a3=div(4,2);
		int b3=a3/div(4,2);
		System.out.println(a3+" "+b3);
		int z=allSum(10,1);
		System.out.println(z);
		int z1=10,z2=12;
		System.out.println(allSum(z1,z2));
		for(int i=0;i<3;i++) {
			hello();
		}
		 
	}

}
