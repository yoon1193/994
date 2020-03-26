package quiz;
class Complex{
	public double i=0;
	public double i1=0;
	public Complex() {}
	public Complex(double i) {
		this.i=i;
	}
	public Complex(double i, double i1) {
		this.i = i;
		this.i1 = i1;
	}
	public String print() {
		return i +"+"+i1+"i";
	}
	
}
public class classQuiz8 {

	public static void main(String[] args) {
		Complex c=new Complex(2.0);
		System.out.println(c.print());
		Complex c1=new Complex(1.5,2.5);
		System.out.println(c1.print());

	}

}
