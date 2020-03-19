 package com.human.ex;

import java.util.Scanner;

	public class javaClass12 {	public static void menu() {
		System.out.println("1.햄버거 2.치즈버거 3.샌드위치 4.종료");
		System.out.println("원하는 메뉴를 고르세요");
	}
	public static void checkmenuNumber(int a) {
		if(a==1) {
			ham();
		}
		else if(a==2) {
			cheeze();
		}
		else if(a==3) {
			san();
		}
		else if(a<1||a>4){
			System.out.println("잘못입력");
		}
	}
	public static void ham() {
		System.out.println("1번 메뉴가 선택 되었습니다.");
	}
	public static void cheeze() {
		System.out.println("2번 메뉴가 선택 되었습니다.");
	}
	public static void san() {
		System.out.println("3번 메뉴가 선택 되었습니다.");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean state=false;
		while(!state) {
			menu();
			int menuNum=sc.nextInt();
			if(menuNum==4) {
				state=true;
				System.out.println("종료");
			}
			checkmenuNumber(menuNum);
	}
	}

}
