package quiz;
class Sklass{
	public static int i;
	Sklass(){
		i++;
	}
}
class Oklass{
	int i;
	Oklass(){
		i++;
	}
}

public class classQuiz7 {

	public static void main(String[] args) {
		new Sklass();
		new Sklass();
		Sklass s=new Sklass();
		new Oklass();
		new Oklass();
		Oklass o=new Oklass();
		System.out.println(s.i);
		System.out.println(o.i);

	}

}
