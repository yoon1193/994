package quiz;
class GolfClub{
	public int a;
	public String name="";
	
	public GolfClub() {
		this.a=7;
		this.name="���̾�";
	}
	public GolfClub(int a) {
		this.a=a;
		this.name="���̾�";
	}
	public GolfClub(String name) {
		this.name=name;
		this.a=0;
	}
	public void print() {
		if(a>0) {
			System.out.println(a+"�� "+name+"�Դϴ�");
		}else {
			System.out.println(name+"�Դϴ�");
		}
		
	}
}
public class clssQuiz9 {

	public static void main(String[] args) {
		GolfClub g1=new GolfClub();
		g1.print();
		GolfClub g2=new GolfClub(8);
		g2.print();
		GolfClub g3=new GolfClub("Peter");
		g3.print();

	}

}
