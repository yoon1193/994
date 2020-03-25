package quiz;
class Printer{
	private int numOfpapers=0;

	public Printer() {}
	public Printer(int numOfpapers) {
		this.numOfpapers = numOfpapers;
	}
	public String getNumOfPapers() {
		if(numOfpapers>0) {
			return "���� "+numOfpapers+" �� �����ֽ��ϴ�.";
		}
		return "������ �����ϴ�";
	}
	public void print(int amount) {
		if(amount>numOfpapers) {
			System.out.println("��� ����ҷ��� "+(amount-numOfpapers)+"�� �����մϴ�.");
			System.out.println(numOfpapers+"�� �� ����մϴ�.");
			numOfpapers=0;
		}else if(amount<=numOfpapers) {
		numOfpapers=numOfpapers-amount;
		System.out.println(amount+"�� ����߽��ϴ�");
		System.out.println("���� "+numOfpapers+"�� ���ҽ��ϴ�.");
		
		}
	}

}
public class classQuiz2 {

	public static void main(String[] args) {
		Printer p=new Printer(10);
		p.print(2);
		p.print(20);
		System.out.println(p.getNumOfPapers());
		
		
		
	
		
		

	}

}
