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
		System.out.println("��ü ȸ�� �ο�:" + Bank.totalCount);
		System.out.println("ȸ�� �̸�:" + this.name+"��");
		System.out.println("��й�ȣ:"+this.password);
		System.out.println("���¹�ȣ:"+this.num);
		System.out.println("�ܾ�:" + this.count+"�� ");

	}

	// ������
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
	// 1. ȸ�����
	public void registBank(Bank p) {
		bankMember[arrIndex++] = p;
	}
	public void registBank() {
		System.out.println("���� ���������");
		System.out.println("ȸ���̸�>>");
		String name = sc.nextLine();
		System.out.println("���¹�ȣ>>");
		String num=sc.nextLine();
		System.out.println("��й�ȣ �Է�");
		String password=sc.nextLine();
		System.out.println("�Աݱݾ�>>");
		int count = Integer.parseInt(sc.nextLine());
		bankMember[arrIndex++] = new Bank(name,num,password,count);

	}

	// 2. �Ա�
	public void inputMoney() {
		System.out.println("ȸ���� �Է�>>");
		String name = sc.nextLine();
		System.out.println("��й�ȣ �Է�");
		String password=sc.nextLine();
		System.out.println("�Ա��� �ݾ��Է�>>");
		int count = Integer.parseInt(sc.nextLine());
		
		Bank p = searchMember(name,password);
		if (p == null) {
			System.out.println("���� ȸ���Դϴ�.");
		} else if(password!=p.password){
			System.out.println("�߸��� ��й�ȣ");
		}
		else {
			p.count = p.count + count;
			System.out.println(p.count+"�Ա� �Ϸ�");
		}
		p.display();

	}

	// 3. ���
	public void outputMoney() {
		System.out.println("ȸ���� �Է�>>");
		String name = sc.nextLine();
		String password=sc.nextLine();
		System.out.println("��й�ȣ �Է�>>");
		System.out.println("����� �ݾ��Է�>>");
		int count = Integer.parseInt(sc.nextLine());

		Bank p = searchMember(name,password);
		if (p == null) {
			System.out.println("���� ȸ���Դϴ�.");
		}
		else if(password!=p.password){
			System.out.println("�߸��� ��й�ȣ");
		}
		else {
			p.count = p.count - count;
			System.out.println(p.count+"��� �Ϸ�");
		}
		p.display();
	}

	// 4. ȸ���˻�
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

	// 5. ȸ��Ȯ��
	public void didplayMember() {
		for (int i = 0; i < Bank.totalCount; i++) {
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
				String password=sc.nextLine();
				searchMember(name,password).display();
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
