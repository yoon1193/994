package com.human.ex;

import java.util.Arrays;

class Cat{
	public String name;
	public int age;
}

public class javaClass01 {

	public static void main(String[] args) {
		/*int a;
		a=1;
		Cat cat1;
		cat1=new Cat();
		cat1.name="고양이1";
		cat1.age=13;
		Cat cat2;
		cat2=new Cat();
		cat2.name="고양이2";
		cat2.age=13;
		Cat cat3;
		cat3=cat2;
		cat3.name="고양이3";
		cat3.age=13;
		
		System.out.println(cat2.name);
		
		Cat []cArr=new Cat[3];
		cArr[0]=new Cat();
		cArr[0].name="고1";
		cArr[0].age=10;
		cArr[1]=new Cat();
		cArr[1].name="고2";
		cArr[1].age=11;
		cArr[2]=new Cat();
		cArr[2].name="고3";
		cArr[2].age=12;
		
		for(int i=0;i<3;i++) {
			cArr[i]=new Cat();
			cArr[i].name="고"+i;
			cArr[i].age=i+10;		
		}
		for(int i=0;i<3;i++) {
			System.out.println(cArr[i].name+":");
			System.out.println(cArr[i].age);
		}
		int sum=0;
		for(int i=0;i<cArr.length;i++) {
			sum+=cArr[i].age;
			cArr[i].age=1;
		}
		System.out.println(sum);
		sum=0;
		for(Cat cat:cArr) {
			sum+=cat.age;
			cat.age=2;
		}
		System.out.println(sum);
		
		//배열에 3의배수 3개를 넣고 더한값을 구하세요
		//고양이의 나이에 총함을 구하시오
		int[]a=new int[3];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=(i+1)*3;
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		sum=0;
		for(int i:a) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		
		
		
		
		
		//배열 : 한번에 여러개 데이터선언
		//int []a=new int[]
		int a[];
		a=new int [3];
		a[0]=0;//인덱스는 0부터 시작
		a[1]=1;
		a[2]=2;
		int index=1;//인덱스를 변수로 넣을수 잇따.
		a[index]=3;
		System.out.println(Arrays.toString(a));
		int sum=0;
		for(int i=0;i<3;i++) {
			a[i]=i;
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//문제1
		int a[]= {1,2,3,4,5};
		int b=1;
		System.out.println(a[0]);
		System.out.println(a[b]);
		//문제2
		int a[]= {1,2,3};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]+2;	
			System.out.println(a[i]);
		}
		for(int i:a){
			System.out.println(i);
		}
		
		
		
		//문제3
		int[]a=new int[6];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
		}
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
		//문제4
		int []a=new int[10];
		for(int i=1;i<a.length;i++) {
			a[i]=i*3;
			System.out.println(a[i]);
		}
		//문제5
		int sum=0;
		int []a= {12,1,5,3,6,8,5,3};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum+=a[i];
			}
		}
		System.out.println(sum);
		
		//문제6
		
		int []a= {12,1,51,3,6,8,5};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];	
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(max+min);
		//문제6
		int team1[]={0,0,0,0,1,3,2,3,1};
		int team2[]={0,2,2,0,4,1,0,0,0};
		int team1TotalScore=0;
		int team2TotalScore=0;
		for(int i=0;i<team1.length;i++) {
			team1TotalScore+=team1[i];
		}
		System.out.println(team1TotalScore);
		for(int i=0;i<team1.length;i++) {
			team2TotalScore+=team2[i];	
		}
		System.out.println(team2TotalScore);*/
		
	}

}
