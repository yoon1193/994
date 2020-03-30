package quiz;
class Member{
	private String name;
	private String id;
	private String password;
	private int age;
	public Member() {}
	public Member(String name,String id,String password,int age) {
		this.name=name;
		this.id=id;
		this.password=password;
		this.age=age;
	}
	public void setName(String n) {
		this.name=n;
	}
	public String getName() {
		return this.name;
	}
	public void setId(String i) {
		this.id=i;
	}
	public String getId() {
		return this.id;
	}
	public void setPassword(String p) {
		this.password=p;
	}
	public String getPassword() {
		return this.password;
	}
	public void setAge(int a) {
		this.age=a;
	}
	public int getAge() {
		return this.age;
	}
	public void memberData() {
		System.out.println("이름: "+name);
		System.out.println("ID: "+id);
		System.out.println("Password: "+password);
		System.out.println("Age: "+age);
	}
}
public class classQuiz4 {

	public static void main(String[] args) {
		
		Member p=new Member("태양","taeyang","ty123",23);
		p.setName("똥");
		Member p1=new Member("금성","asdasd","asjdaklsjd123",123);
		p.memberData();
		p1.memberData();
		
		

	}

}
