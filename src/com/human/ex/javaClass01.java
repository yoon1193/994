package com.human.ex;

import java.util.Arrays;

public class javaClass01 {

	public static void main(String[] args) {
		//�迭 : �ѹ��� ������ �����ͼ���
		//int []a=new int[]
		int a[];
		a=new int [3];
		a[0]=0;//�ε����� 0���� ����
		a[1]=1;
		a[2]=2;
		int index=1;//�ε����� ������ ������ �յ�.
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
