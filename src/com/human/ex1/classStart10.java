package com.human.ex1;

class Product {
	public static int totalCount = 0;
	public String name;
	public int count = 0;

	// �԰�,���,����
//	public void add(int count) {
//		this.count = this.count + count;
//	}

//	public void min(int count) {
//		this.count = this.count - count;
//	}

	public void display() {
		System.out.println("��ü ��ǰ���� ����:" + Product.totalCount);
		System.out.println("��ǰ �̸�:" + this.name);
		System.out.println("��ǰ ����:" + this.count);

	}

	// ������
	public Product() {
		Product.totalCount++;
	}

	public Product(String name) {
		this(name, 0);

	}

	public Product(String name, int count) {
		this();
		this.name = name;
		this.count = count;
	}

}

//
//��ǰ���� ���α׷�
//1. ��ǰ���
//2. �԰�
//3. ���
//4. ��ǰ�˻�
//5. ��ǰ��� Ȯ��
class ProductManager {
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public int arrIndex = 0;
	public Product[] arrProduct = new Product[10];

	public ProductManager() {
	}

	
	public void registTestData() {
		Product p1 = new Product("�����", 100);
		registProduct(p1);
		Product p2 = new Product("����", 100);
		registProduct(p2);
		Product p3 = new Product("���찳", 90);
		registProduct(p3);
		Product p4 = new Product("å", 70);
		registProduct(p4);
		Product p5 = new Product("����", 90);
		registProduct(p5);

	}
	// 1. ��ǰ���
	public void registProduct(Product p) {
		arrProduct[arrIndex++] = p;
		// arrProduct[Product.totalCount-1]=p;
	}

	public void registProduct() {
		// arrProduct[0]=new Product("�����",10);
		System.out.println("��ǰ����������");
		System.out.println("��ǰ��>>");
		String name = sc.nextLine();
		System.out.println("��ϰ���>>");
		int count = Integer.parseInt(sc.nextLine());
		arrProduct[arrIndex++] = new Product(name, count);

	}

	// 2. �԰�
	public void inputProduct() {
		System.out.println("�԰��� ��ǰ�Է�>>");
		String name = sc.nextLine();
		System.out.println("�԰��� ��ǰ�����Է�>>");
		int count = Integer.parseInt(sc.nextLine());

		Product p = searchProduct(name);
		if (p == null) {
			System.out.println("���� ��ǰ�Դϴ�.");
		} else {
			p.count = p.count + count;
		}
		p.display();

	}

	// 3. ���
	public void outputProduct() {
		System.out.println("����� ��ǰ�Է�>>");
		String name = sc.nextLine();
		System.out.println("����� ��ǰ�����Է�>>");
		int count = Integer.parseInt(sc.nextLine());

		Product p = searchProduct(name);
		if (p == null) {
			System.out.println("���� ��ǰ�Դϴ�.");
		} else {
			p.count = p.count - count;
		}
		p.display();
	}

	// 4. ��ǰ�˻�
	public Product searchProduct(String name) {
		Product returnValue = null;
		for (int i = 0; i < arrIndex; i++) {
			if (arrProduct[i].name.equals(name)) {
				returnValue = arrProduct[i];
				break;
			}
			;
		}
		return returnValue;
	}

	// 5. ��ǰ��� Ȯ��
	public void displayProduct() {
		for (int i = 0; i < Product.totalCount; i++) {
			arrProduct[i].display();
		}

	}
	public void start() {
		String s="";
		while(!s.equals("6")) {
			System.out.println("1.��ǰ��� 2.�԰� 3.��� 4.��ǰ�˻� 5.���Ȯ�� 6.����");
			s=sc.nextLine();
			switch(s) {
			case "1":
				registProduct();
				break;
			case "2":
				inputProduct();
				break;
			case "3":
				outputProduct();
				break;
			case "4":
				System.out.println("�˻� �� ��ǰ:");
				String name=sc.nextLine();
				searchProduct(name).display();
				break;
			case "5":
				displayProduct();
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

public class classStart10 {
	public static void main(String[] args) {
		ProductManager pm = new ProductManager();
		// pm.start(); ����� �Է��� �޾Ƽ� ó���Ǵ� ���α׷� ����.
		// pm.registProduct();
		// pm.registProduct();
		// pm.registTestData();
		// pm.displayProduct();
		pm.start();

	}

}
