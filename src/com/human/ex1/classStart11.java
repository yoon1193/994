package com.human.ex1;

class Bank {
	public static int totalCustomer = 0;
	public String name;
	public int money = 0;
	public int account=0;
	public int password=0;

	public void display() {
		System.out.println("총 회원"+Bank.totalCustomer+"명");
		System.out.println("회원 이름:" + this.name+"님");
		System.out.println("계좌번호:"+this.account);
		System.out.println("잔액:" + this.money+"원 ");
	}
	
	// 생성자
	public Bank() {
		Bank.totalCustomer++;
	}
	public Bank(String name,int password,int account,int money) {
		this();
		this.name = name;
		this.password=password;
		this.account=account;
		this.money = money;
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
		int account=Integer.parseInt(sc.nextLine());
		System.out.println("비밀번호>>");
		int password=Integer.parseInt(sc.nextLine());
		System.out.println("첫 입금금액>>");
		int money = Integer.parseInt(sc.nextLine());
		bankMember[arrIndex++] = new Bank(name,password,account,money);
	}

	// 2. 입금
	public void inputMoney() {
		System.out.println("회원명 입력>>");
		String name = sc.nextLine();
		Bank p = searchMember(name);
		if (p == null) {
			System.out.println("없는 회원입니다.");
			return ;
		}
		System.out.println("비밀번호 입력>>");
		int password=Integer.parseInt(sc.nextLine());
		if(p.password!=password) {
			System.out.println("틀린번호");
			return;
		}
		System.out.println("입금할 금액입력>>");
		int money = Integer.parseInt(sc.nextLine());
		p.money += money;
		System.out.println(money+"입금 완료");
	
		p.display();
	
	}
	
	// 3. 출금
	public void outputMoney() {
		System.out.println("회원명 입력>>");
		String name = sc.nextLine();
		Bank p = searchMember(name);
		if (p == null) {
			System.out.println("없는 회원입니다.");
			return ;
		}
		System.out.println("비밀번호 입력>>");
		int password=Integer.parseInt(sc.nextLine());
		if(p.password!=password) {
			System.out.println("틀린번호");
			return;
		}
		System.out.println("출금할 금액입력>>");
		int money = Integer.parseInt(sc.nextLine());
		if(p.money<money) {
			System.out.println("잔액 부족");
			return;
		}
		p.money -=  money;
		System.out.println(money+"출금 완료");
		p.display();
	
	}
	
	// 4. 회원검색
	public Bank searchMember(String name) {
		Bank returnValue = null;
		for (int i = 0; i < arrIndex; i++) {
			if (bankMember[i].name.equals(name)) {
				returnValue = bankMember[i];
				break;
			}
		
		}
		return returnValue;
	}
	
	// 5. 회원확인
	public void didplayMember() {
		for (int i = 0; i < Bank.totalCustomer; i++) {
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
				searchMember(name).display();
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
