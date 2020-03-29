package com.human.ex1;

class Product {
	public static int totalCount = 0;
	public String name;
	public int count = 0;

	// 입고,출고,내용
//	public void add(int count) {
//		this.count = this.count + count;
//	}

//	public void min(int count) {
//		this.count = this.count - count;
//	}

	public void display() {
		System.out.println("전체 상품종류 개수:" + Product.totalCount);
		System.out.println("상품 이름:" + this.name);
		System.out.println("상품 개수:" + this.count);

	}

	// 생성자
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
//상품관리 프로그램
//1. 상품등록
//2. 입고
//3. 출고
//4. 상품검색
//5. 상품재고 확인
class ProductManager {
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public int arrIndex = 0;
	public Product[] arrProduct = new Product[10];

	public ProductManager() {
	}

	
	public void registTestData() {
		Product p1 = new Product("새우깡", 100);
		registProduct(p1);
		Product p2 = new Product("연필", 100);
		registProduct(p2);
		Product p3 = new Product("지우개", 90);
		registProduct(p3);
		Product p4 = new Product("책", 70);
		registProduct(p4);
		Product p5 = new Product("볼팬", 90);
		registProduct(p5);

	}
	// 1. 상품등록
	public void registProduct(Product p) {
		arrProduct[arrIndex++] = p;
		// arrProduct[Product.totalCount-1]=p;
	}

	public void registProduct() {
		// arrProduct[0]=new Product("새우깡",10);
		System.out.println("상품명등록페이지");
		System.out.println("상품명>>");
		String name = sc.nextLine();
		System.out.println("등록개수>>");
		int count = Integer.parseInt(sc.nextLine());
		arrProduct[arrIndex++] = new Product(name, count);

	}

	// 2. 입고
	public void inputProduct() {
		System.out.println("입고할 상품입력>>");
		String name = sc.nextLine();
		System.out.println("입고할 상품개수입력>>");
		int count = Integer.parseInt(sc.nextLine());

		Product p = searchProduct(name);
		if (p == null) {
			System.out.println("없는 상품입니다.");
		} else {
			p.count = p.count + count;
		}
		p.display();

	}

	// 3. 출고
	public void outputProduct() {
		System.out.println("출고할 상품입력>>");
		String name = sc.nextLine();
		System.out.println("출고할 상품개수입력>>");
		int count = Integer.parseInt(sc.nextLine());

		Product p = searchProduct(name);
		if (p == null) {
			System.out.println("없는 상품입니다.");
		} else {
			p.count = p.count - count;
		}
		p.display();
	}

	// 4. 상품검색
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

	// 5. 상품재고 확인
	public void displayProduct() {
		for (int i = 0; i < Product.totalCount; i++) {
			arrProduct[i].display();
		}

	}
	public void start() {
		String s="";
		while(!s.equals("6")) {
			System.out.println("1.상품등록 2.입고 3.출고 4.상품검색 5.재고확인 6.종료");
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
				System.out.println("검색 할 상품:");
				String name=sc.nextLine();
				searchProduct(name).display();
				break;
			case "5":
				displayProduct();
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

public class classStart10 {
	public static void main(String[] args) {
		ProductManager pm = new ProductManager();
		// pm.start(); 사용자 입력을 받아서 처리되는 프로그램 구현.
		// pm.registProduct();
		// pm.registProduct();
		// pm.registTestData();
		// pm.displayProduct();
		pm.start();

	}

}
