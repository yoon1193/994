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
			return "현재 "+numOfpapers+" 장 남아있습니다.";
		}
		return "용지가 없습니다";
	}
	public void print(int amount) {
		if (this.duplex) {
			if (amount > numOfpapers) {
				System.out.println("양면으로 모두 출력할려면 " + (amount - numOfpapers) + "장 부족합니다.");
				System.out.println(numOfpapers + "장 만 출력합니다.");
				numOfpapers = 0;
			} else if (amount <= numOfpapers) {
				numOfpapers = numOfpapers - amount;
				System.out.println("양면으로" + amount + "장 출력했습니다");
			}
		}
		else { 
			if (amount > numOfpapers) {
				System.out.println("단면으로 모두 출력할려면 " + (amount - numOfpapers) + "장 부족합니다.");
				System.out.println(numOfpapers + "장 만 출력합니다.");
				numOfpapers = 0;
			} else if (amount <= numOfpapers) {
				numOfpapers = numOfpapers - amount;
				System.out.println("단면으로" + amount + "장 출력했습니다");
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
