package quiz;
class Printer{
	private int numOfpapers=0;
	public int paper=0;
	
	public Printer() {}
	public Printer(int paper) {
		this.paper = paper;
	}
	public void setNumofpaper(int numOfpapaers) {
		if(numOfpapers==0) {
			numOfpapaers=0;
		}
		this.numOfpapers=numOfpapaers;
	}
	public int getNumofpaper() {
		System.out.println("������ �����ϴ�.");
		return this.numOfpapers;
	}
	public void print(int amount) {
		if(amount>paper) {
			System.out.println(Math.abs(this.paper-amount)+"���� ����"+this.numOfpapers+"�� ���");
		}
		this.numOfpapers=this.paper-amount;
		System.out.println(amount+"�� ����߽��ϴ�");
		System.out.println(this.numOfpapers+"�� ���ҽ��ϴ�.");
		
	}

}
public class classQuiz2 {

	public static void main(String[] args) {
		Printer p=new Printer(100);
		p.print(100);
		
	
		
		

	}

}
