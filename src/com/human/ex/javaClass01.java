package com.human.ex;

import java.util.Arrays;

public class javaClass01 {

	public static void main(String[] args) {
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
		
		for(int i=0;i<3;i++) {
			a[i]=i;	
		}
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		
	}

}
