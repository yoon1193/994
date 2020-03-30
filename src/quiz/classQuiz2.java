package quiz;
class Printer{
	private static int numOfpapers=0;
	private boolean duplex;

	public Printer() {}
	public Printer(int numOfpapers,boolean duplex) {
		this.numOfpapers = numOfpapers;
		this.duplex=duplex;
	}
	public String getNumOfPapers() {
		if(numOfpapers>0) {
			return "���� "+numOfpapers+" �� �����ֽ��ϴ�.";
		}
		return "������ �����ϴ�";
	}
	public void print(int amount) {
		if (this.duplex) {
			if (amount > numOfpapers) {
				System.out.println("������� ��� ����ҷ��� " + (amount - numOfpapers) + "�� �����մϴ�.");
				System.out.println(numOfpapers + "�� �� ����մϴ�.");
				numOfpapers = 0;
			} else if (amount <= numOfpapers) {
				numOfpapers = numOfpapers - amount;
				System.out.println("�������" + amount + "�� ����߽��ϴ�");
			}
		}
		else { 
			if (amount > numOfpapers) {
				System.out.println("�ܸ����� ��� ����ҷ��� " + (amount - numOfpapers) + "�� �����մϴ�.");
				System.out.println(numOfpapers + "�� �� ����մϴ�.");
				numOfpapers = 0;
			} else if (amount <= numOfpapers) {
				numOfpapers = numOfpapers - amount;
				System.out.println("�ܸ�����" + amount + "�� ����߽��ϴ�");
			}
		}
	}
	public void setDuplex(boolean duplex) {
		if(duplex==true) {
			this.duplex=duplex;
		}else {
			this.duplex=duplex;
		}
	
	}
	public boolean getDuplex() {
		return this.duplex;
	}
	public static void main(String[] args) {
		
	}

}
public class classQuiz2 {

	public static void main(String[] args) {
		Printer p=new Printer(20,true);
		p.print(13);
		System.out.println(p.getNumOfPapers());
		p.setDuplex(false);
		p.print(10);
		
	}

}
