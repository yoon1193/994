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
		System.out.println("�ֹ���ȣ:"+orderNum);
		System.out.println("�ֹ��� ���̵�:"+orderId);
		System.out.println("�ֹ� ��¥:"+day);
		System.out.println("�ֹ��� �̸�:"+orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ:"+goodsNum);
		System.out.println("��� �ּ�:"+address);
	}
	
}
public class classQuiz1 {

	public static void main(String[] args) {
		System.out.println("�� ����� ����="+Man.age);
		System.out.println("�� ����� �̸�="+Man.name);
		System.out.println("�� ����� ��ȥ ����="+Man.isMarried);
		System.out.println("�� ����� �ڳ��="+Man.children);
		System.out.println();
		Order a=new Order("201803120001", "abc123","2018�� 3�� 12��","ȫ���",
							"PD0345-12","����� �������� ���ǵ��� 20����");
		a.content();
		
	}

}
