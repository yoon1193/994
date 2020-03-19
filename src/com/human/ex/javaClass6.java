package com.human.ex;
public class javaClass6 {
	public static int intFunc(int a) {
		int i=0;
		i=a+1;
		return i;
	}
	public static double doubleFunc(double a) {
		double i=0;
		i=a+1;
		return i;
	}
	public static String stringFunc(String a) {
		String s=null;
		s=a+"ÇÏ¼¼¿ä";
		return s;
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
	public static void main(String[] args) {
		int i=0;
		i=intFunc(i);
		System.out.println(i);
		
		double i1=doubleFunc(2.1);
		System.out.println(i1);
		
		String s="¾È³ç";
		s=stringFunc(s);
		System.out.println(s);
		
		int arr1[]= {1,1};
		int arr2[]=intArrFunc(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
	}

}
