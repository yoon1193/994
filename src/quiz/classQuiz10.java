package quiz;
class Dice{
	public int face;
	public Dice() {}
	public int roll() {
		this.face = (int) (Math.random() * 6) +1;
		return this.face;
	}
}
public class classQuiz10 {

	public static void main(String[] args) {
		Dice d1=new Dice();
		System.out.println("쥬사위 숫자="+d1.roll());

	}

}
