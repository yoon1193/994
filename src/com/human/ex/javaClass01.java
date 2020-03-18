package com.human.ex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class javaClass01 {

	public static void main(String[] args) {
		/*Random rand=new Random();
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int a[]=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=rand.nextInt(100);
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(max+" "+min);
		p.5문제
		int []a= {10,20,30,40,50,60,70,80,90,100};
		System.out.println(Arrays.toString(a));
		Scanner sc=new Scanner(System.in);
		boolean state= false;
		while(!state) {
			System.out.println("탐색할 값을 입력하세요:");
			int num=sc.nextInt();
			for(int i=0;i<a.length;i++) {
				if(a[i]==num) {
					System.out.println("탐색 성공 인덱스는"+i+"입니다");
					state=true;
					break;
				}
			}
			if(state==false) {
				System.out.println("잘 못 입력");
			}
		}
		//p.6문제1
		String s[]= new String[6];
		s[0]="A";
		s[1]="B";
		s[2]="C";
		System.out.println(Arrays.toString(s));
		int index=2;
		for(int i=3;i<s.length;i++) {
			s[i]=s[index];
			index--;
		}
		System.out.println(Arrays.toString(s));
		p.7문제
		Random rand=new Random();
		String []s2= {"a","p","p","l","e"};
		String temp;
		for(int i=0;i<s2.length;i++) {
			int a=rand.nextInt(5);
			int b=rand.nextInt(5);
			temp=s2[1];
			s2[a]=s2[b];
			s2[b]=temp;
			System.out.print(s2[i]);
		}
		p.7문제4
		int []a= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("이동을 원하는 숫자를 입력하시오:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]+num;
			if(a[i]>10) {
				a[i]=0;
			}
			System.out.print(" "+a[i]);
		}
		int []a= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("이동을 원하는 숫자를 입력하시오:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=num;i<a.length;i++) {
			a[i-num]=a[i];
			a[i]=0;
		}
		System.out.println(Arrays.toString(a));
		//p.문제
		int []a= {1,9,3,6,5,4,7,8,2,10};
		int []b= {7,8,2,5,10,1,3,6,4,9};
		int []c= new int[10];
		for(int i=0;i<10;i++) {
			c[i]=a[i]*b[i];
			System.out.print(" "+c[i]);
		}
		//p.9문제1
		int a[]=new int[5];
		int max=a[0];
		System.out.println("시험 점수를 입력하세요");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			int num=sc.nextInt();
			a[i]=num;
		}
		for(int i=0;i<5;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			System.out.println(i+1+"번째 사람의 점수는 "+a[i]+"점 입니다");
		}
		System.out.println("최고 점수는 "+max+"점 입니다");
		
		//p.10문제2
		int a[] = new int[5];
		int count=0;
		System.out.println("시험 점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			a[i] = num;
		}
		for (int i = 0; i < 5; i++) {
			if (a[i] >=70) {
				count++;
			}
			System.out.println(i+1+"번째 사람의 점수는 "+a[i]+"점 입니다");
		}
		System.out.println("70점 이상인 학생은 "+count+"명 입니다");
		p.11
		int []a=new int[5];
		int scoreSum[]=new int[3];
		String []s= {"국어","영어","수학"};
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(i+1+"번 학생"+s[j]+"성적 입력:");
				int num=sc.nextInt();
				scoreSum[j]+=num;//국 영 수 총점 저장
			}
		}
		for(int i=0;i<3;i++) {
			System.out.println(s[i]+"총점="+scoreSum[i]+"평균="+(double)scoreSum[i]/5);
			
		}
		
		
		//p.11문제3
		int []a=new int[4];
		System.out.println("4자릿수 정수를 입력하세요");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		a[0]=num/1000;
		a[1]=num%1000/100;
		a[2]=num%1000%100/10;
		a[3]=num%10;
		for(int i=0;i<4;i++) {
			System.out.println("a["+i+"]"+"의 값="+a[i]);
		}
		for(int i=3;i>=0;i--){
			System.out.print("역순 출력="+a[i]);
		}
		p.12출석문제
		Scanner sc=new Scanner(System.in);
		
		int checking[] = new int[16];
		for (int i = 0; i < checking.length; i++) {
			System.out.println(i+1+"번 쨰 강의에 축석했나?"+"1.출석입력 0.결석 입력 3.all출,결 4.출석정보 출력 5.프로그램종료");
			int check = sc.nextInt();
			switch (check) {
			case 1:
				checking[i] = 1;
				break;
			case 2:
				checking[i] = 0;
				break;	
			case 3:
				System.out.println("31.all출석 30.all결석");
				int allCheck = sc.nextInt();
				if (allCheck == 31) {
					for (i = 0; i < checking.length; i++) {
						checking[i] = 1;
					}
				}
				if (allCheck == 30) {
					for (i = 0; i < checking.length; i++) {
						checking[i] = 0;
					}
				}
				break;
			case 4:
				for(i=0;i<checking.length;i++) {
				}
				System.out.println(Arrays.toString(checking));
				break;
			}
			if(check==5) {
				System.out.println("출석 종료");
				break;
				}
		
		}
		System.out.println(Arrays.toString(checking));
	
		
		

		
		p.12도전
		int a[]=new int[5];
		int max=Integer.MIN_VALUE;	
		int min=Integer.MAX_VALUE;
		int sum=0;
		System.out.println("5명의 심사위원의 점수 입력=");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			int score=sc.nextInt();
			a[i]=score;
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.print("유효점수=");
		for(int i=0;i<a.length;i++) {
			if(a[i]!=max&&a[i]!=min) {
				System.out.print(a[i]+" ");
				sum+=a[i];
			}	
		}
		System.out.println();
		System.out.println("평균="+(double)sum/3);
		//p.14문제5
		int []a=new int[50];
		int []b=new int[50];
		System.out.println("숫자를 입력하세요:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
			if(i%10==9) {
				System.out.println(a[i]);
				System.out.println();
			}
			else
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<b.length;i++) {
			b[i]=a[i];
			if(b[i]%num==0) {
				b[i]=0;
			}
			if(i%10==9) {
				System.out.println(b[i]);
				System.out.println();
			}
			else
			System.out.print(b[i]+" ");
	}
		로또문제
		int lottoNum[]=new int[6];
		int count=0;
		boolean check;
		Scanner sc=new Scanner(System.in);
		while(count<6) {
			check=false;
			System.out.println("로또 번호 입력:");
			int num=sc.nextInt();
			for(int i=0;i<lottoNum.length;i++) {
				if(lottoNum[i]==num){
					check=true;
					break;
				}
			}
			if(check) {
				System.out.println("중복된숫자");	
			}
			else {
				lottoNum[count]=num;
				count++;
			}
			
		}
		for(int i=0;i<lottoNum.length;i++) {
			System.out.print(lottoNum[i]+" ");
		}*/
		//369해답지 출력
		int []a=new int[1000];
		String s="짝";
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%3==0) {
				a[i]=0;
				System.out.println(a[i]);
			}
		}
	}

}
