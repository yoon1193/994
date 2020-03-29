package com.human.ex1;

class Bank {
	public static int totalCustomer = 0;
	public String name;
	public int money = 0;
	public int account=0;
	public int password=0;

	public void display() {
		System.out.println("�� ȸ��"+Bank.totalCustomer+"��");
		System.out.println("ȸ�� �̸�:" + this.name+"��");
		System.out.println("���¹�ȣ:"+this.account);
		System.out.println("�ܾ�:" + this.money+"�� ");
	}
	
	// ������
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
	
	// 1. ȸ�����
	public void registBank(Bank p) {
		bankMember[arrIndex++] = p;
	}
	public void registBank() {
		System.out.println("���� ���������");
		System.out.println("ȸ���̸�>>");
		String name = sc.nextLine();
		System.out.println("���¹�ȣ>>");
		int account=Integer.parseInt(sc.nextLine());
		System.out.println("��й�ȣ>>");
		int password=Integer.parseInt(sc.nextLine());
		System.out.println("ù �Աݱݾ�>>");
		int money = Integer.parseInt(sc.nextLine());
		bankMember[arrIndex++] = new Bank(name,password,account,money);
	}

	// 2. �Ա�
	public void inputMoney() {
		System.out.println("ȸ���� �Է�>>");
		String name = sc.nextLine();
		Bank p = searchMember(name);
		if (p == null) {
			System.out.println("���� ȸ���Դϴ�.");
			return ;
		}
		System.out.println("��й�ȣ �Է�>>");
		int password=Integer.parseInt(sc.nextLine());
		if(p.password!=password) {
			System.out.println("Ʋ����ȣ");
			return;
		}
		System.out.println("�Ա��� �ݾ��Է�>>");
		int money = Integer.parseInt(sc.nextLine());
		p.money += money;
		System.out.println(money+"�Ա� �Ϸ�");
	
		p.display();
	
	}
	
	// 3. ���
	public void outputMoney() {
		System.out.println("ȸ���� �Է�>>");
		String name = sc.nextLine();
		Bank p = searchMember(name);
		if (p == null) {
			System.out.println("���� ȸ���Դϴ�.");
			return ;
		}
		System.out.println("��й�ȣ �Է�>>");
		int password=Integer.parseInt(sc.nextLine());
		if(p.password!=password) {
			System.out.println("Ʋ����ȣ");
			return;
		}
		System.out.println("����� �ݾ��Է�>>");
		int money = Integer.parseInt(sc.nextLine());
		if(p.money<money) {
			System.out.println("�ܾ� ����");
			return;
		}
		p.money -=  money;
		System.out.println(money+"��� �Ϸ�");
		p.display();
	
	}
	
	// 4. ȸ���˻�
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
	
	// 5. ȸ��Ȯ��
	public void didplayMember() {
		for (int i = 0; i < Bank.totalCustomer; i++) {
			bankMember[i].display();
		}
	}
	
	public void start() {
		String s="";
		while(!s.equals("6")) {
			System.out.println("1.���µ�� 2.�Ա� 3.��� 4.ȸ���˻� 5.ȸ��Ȯ�� 6.����");
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
				System.out.println("�˻� �� ȸ��:");
				String name=sc.nextLine();
				searchMember(name).display();
				break;
			case "5":
				didplayMember();
				break;
			case "6":
				System.out.println("����");
				break;
			default:
				System.out.println("�ٽ� �Է�");
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
