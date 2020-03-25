package quiz;
class Printer{
	private int numOfpapers=0;

	public Printer() {}
	public Printer(int numOfpapers) {
		this.numOfpapers = numOfpapers;
	}
	public String getNumOfPapers() {
		if(numOfpapers>0) {
			return "현재 "+numOfpapers+" 장 남아있습니다.";
		}
		return "용지가 없습니다";
	}
	public void print(int amount) {
		if(amount>numOfpapers) {
			System.out.println("모두 출력할려면 "+(amount-numOfpapers)+"장 부족합니다.");
			System.out.println(numOfpapers+"장 만 출력합니다.");
			numOfpapers=0;
		}else if(amount<=numOfpapers) {
		numOfpapers=numOfpapers-amount;
		System.out.println(amount+"장 출력했습니다");
		System.out.println("현재 "+numOfpapers+"장 남았습니다.");
		
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
