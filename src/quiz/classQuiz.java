package quiz;
class Mydate{
	private int day;
	private int month;
	private int year;
	boolean valid=true;
	public Mydate() {}
	public Mydate(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public boolean isValid() {
		int num[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		if(month>12||month<1) {
			valid=false;
		}
		if(day>num[month-1]) {
			valid=false;
		}
		if(valid==true) {
			System.out.println("유효한 날짜 입니다.");
		}
		if(valid==false) {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
		return valid;
	}
	public void setDay(int d) {
		this.day=d;
	}
	public int getDay() {
		return this.day;
	}
	public void setMonth(int m) {
		this.month=m;
	}
	public int getMonth() {
		return this.month;
	}
	public void setYear(int y) {
		this.year=y;
	}
	public int getYear() {
		return this.year;
	}
}
public class classQuiz {

	public static void main(String[] args) {
		Mydate date1=new Mydate(30,2,2000);
		date1.isValid();
		Mydate date2=new Mydate(2,10,2006);
		date2.isValid();
		
	}

}
