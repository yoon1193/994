package quiz;
class Car{
	private String color;
	public static int numofCars;
	public static int numofRedCars;

	public Car() {}
	public Car(String color) {
		this.color = color;
		numofCars++;
		if(color.equals("red")||color.equals("RED")) {
			numofRedCars++;
		}
	}
	public static int getNumOfCars() {
		return numofCars;
	}
	public static int getNumOfRedCars() {
		return numofRedCars;
	}
}
public class classQuiz5 {

	public static void main(String[] args) {
		Car c1=new Car("red");
		Car c2=new Car("blue");
		Car c3=new Car("RED");
		System.out.printf("자동차 수 : %d, 빨간색 차 수 : %d",Car.getNumOfCars(),Car.getNumOfRedCars());

		
	}

}
