package quiz;
class Triangle{
	public double base;
	public double height;
	public Triangle() {}
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	public void setBase(double base) {
		if(base<0) {
			this.base=0;
		}else {
			this.base=base;
		}
	}
	public double getBase() {
		return this.base;
	}
	public void setHeight(double height) {
		if(height<0) {
			this.height=0;
		}else {
			this.height=height;
		}
	}
	public double getHeight() {
		return this.height;
	}
	public double findArea() {
		return base*height/2;
	}
	public boolean isSameArea(Triangle t) {
		double t1Area=this.findArea();
		double tArea=t.findArea();
		if(t1Area==tArea) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class classQuiz3 {
	public static void main(String[] args) {
		Triangle t1=new Triangle(10.0,5.0);
		Triangle t2=new Triangle(5.0,10.0);
		Triangle t3=new Triangle(8.0,8.0);
		System.out.println(t1.findArea());
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));

	}

}
