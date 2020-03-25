package quiz;
class Man{
	public static int age=40;
	public static String name="James";
	public static boolean isMarried=true;
	public static int children=3;
}
class Order{
	public String orderNum;
	public String orderId;
	public String day;
	public String orderName;
	public String goodsNum;
	public String address;
	public Order() {}
	public Order(String orderNum, String orderId, String day, String orderName,
					String goodsNum, String address) {
		
		this.orderNum = orderNum;
		this.orderId = orderId;
		this.day = day;
		this.orderName = orderName;
		this.goodsNum = goodsNum;
		this.address = address;
	}
	public void content() {
		System.out.println("주문번호:"+orderNum);
		System.out.println("주문자 아이디:"+orderId);
		System.out.println("주문 낳짜:"+day);
		System.out.println("주문자 이름:"+orderName);
		System.out.println("주문 상품 번호:"+goodsNum);
		System.out.println("배송 주소:"+address);
	}
	
}
public class classQuiz1 {

	public static void main(String[] args) {
		System.out.println("이 사람의 나이="+Man.age);
		System.out.println("이 사람의 이름="+Man.name);
		System.out.println("이 사람의 결혼 여부="+Man.isMarried);
		System.out.println("이 사람의 자녀수="+Man.children);
		System.out.println();
		Order a=new Order("201803120001", "abc123","2018년 3월 12일","홍길순",
							"PD0345-12","서울시 영등포구 여의도동 20번지");
		a.content();
		
	}

}
