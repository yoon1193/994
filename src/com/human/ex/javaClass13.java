 package com.human.ex;

import java.util.Scanner;


public class javaClass13 {
	public static int total=0;
	public static int save(int amount) {
		total+=amount;
		System.out.println("지금까지의 저축액은 "+total+"원 입니다.");
		return total;
	}
	public static int draw(int amount) {
		total-=amount;
		System.out.println("지금까지의 저축액은 "+total+"원 입니다.");
		return total;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean state = false;
		while(!state) {
			System.out.println("1.입금    2.출금  3.종료");
			int i=sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("얼마를 입금 할까요?");
				int in=sc.nextInt();
				save(in);
				break;
			case 2:
				System.out.println("얼마나 출금 할까요?");
				int out=sc.nextInt();
				draw(out);
				break;
			case 3:
				state=true;
				System.out.println("종료");
			}
			
			
		}
	}

}
