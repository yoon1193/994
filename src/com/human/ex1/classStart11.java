package com.human.ex1;

import sun.net.www.content.text.plain;
import sun.security.util.Password;

class Bank {
	public static int totalCount = 0;
	public String name;
	public int count = 0;
	public String num;
	public String password;

	public void display() {
		System.out.println("전체 회원 인원:" + Bank.totalCount);
		System.out.println("회원 이름:" + this.name+"님");
		System.out.println("비밀번호:"+this.password);
		System.out.println("계좌번호:"+this.num);
		System.out.println("잔액:" + this.count+"원 ");

	}

	// 생성자
	public Bank() {
		Bank.totalCount++;
	}

	public Bank(String name) {
		this(name, "" ,"", 0);
 
	}

	public Bank(String name,String num,String password,int count) {
		this();
		this.name = name;
		this.num=num;
		this.password =password;
		this.count = count;
	}

}


class BankManager {
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public int arrIndex = 0;
	public Bank[] bankMember = new Bank[100];

	public BankManager() {
	}
	// 1. 회원등록
	public void registBank(Bank p) {
		bankMember[arrIndex++] = p;
	}
	public void registBank() {
		System.out.println("계좌 등록페이지");
		System.out.println("회원이름>>");
		String name = sc.nextLine();
		System.out.println("계좌번호>>");
		String num=sc.nextLine();
		System.out.println("비밀번호 입력");
		String password=sc.nextLine();
		System.out.println("입금금액>>");
		int count = Integer.parseInt(sc.nextLine());
		bankMember[arrIndex++] = new Bank(name,num,password,count);

	}

	// 2. 입금
	public void inputMoney() {
		System.out.println("회원명 입력>>");
		String name = sc.nextLine();
		System.out.println("비밀번호 입력");
		String password=sc.nextLine();
		System.out.println("입금할 금액입력>>");
		int count = Integer.parseInt(sc.nextLine());
		
		Bank p = searchMember(name,password);
		if (p == null) {
			System.out.println("없는 회원입니다.");
		} else if(password!=p.password){
			System.out.println("잘못된 비밀번호");
		}
		else {
			p.count = p.count + count;
			System.out.println(p.count+"입금 완료");
		}
		p.display();

	}

	// 3. 출금
	public void outputMoney() {
		System.out.println("회원명 입력>>");
		String name = sc.nextLine();
		String password=sc.nextLine();
		System.out.println("비밀번호 입력>>");
		System.out.println("출금할 금액입력>>");
		int count = Integer.parseInt(sc.nextLine());

		Bank p = searchMember(name,password);
		if (p == null) {
			System.out.println("없는 회원입니다.");
		}
		else if(password!=p.password){
			System.out.println("잘못된 비밀번호");
		}
		else {
			p.count = p.count - count;
			System.out.println(p.count+"출금 완료");
		}
		p.display();
	}

	// 4. 회원검색
	public Bank searchMember(String name,String password) {
		Bank returnValue = null;
		for (int i = 0; i < arrIndex; i++) {
			if (bankMember[i].name.equals(name)) {
				returnValue = bankMember[i];
				break;
			}
			if (bankMember[i].password.equals(password)) {
				returnValue = bankMember[i];
				break;
			}
			
		}
		return returnValue;
	}

	// 5. 회원확인
	public void didplayMember() {
		for (int i = 0; i < Bank.totalCount; i++) {
			bankMember[i].display();
		}

	}
	public void start() {
		String s="";
		while(!s.equals("6")) {
			System.out.println("1.계좌등록 2.입금 3.출금 4.회원검색 5.회원확인 6.종료");
			s=sc.nextLine();
			switch(s) {
			case "1":
				registBank();
				break;
			case "2":
				inputMoney();
				break;
			case "3":
				outputMoney();
				break;
			case "4":
				System.out.println("검색 할 회원:");
				String name=sc.nextLine();
				String password=sc.nextLine();
				searchMember(name,password).display();
				break;
			case "5":
				didplayMember();
				break;
			case "6":
				System.out.println("종료");
				break;
			default:
				System.out.println("다시 입력");
				break;		
			}
		}
		
	}
}

public class classStart11 {
	public static void main(String[] args) {
		BankManager bm = new BankManager();
		bm.start();

	}

}
