package Constructors;

class Studentinfo1{
	
	private int sid;
	private String name;
	private String city;
	private int age;

	
	//void setData(int sid, String name, String city) {
	Studentinfo1(int sid, String name, String city) {
		super();  //will call parent constructor
		this.sid=sid;
		this.name=name;
		this.city=city;		
	}	
	Studentinfo1(){
		this("avib",12); 
		//this(); it will call the same constructor where it is persent.
		System.out.println("Goodmorning");
	}
	Studentinfo1(int age){
		this();
		System.out.println("heloo world");
	}
	Studentinfo1(String name, int age){
		this.name=name;
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public int getSid() {
		return sid;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Studentinfo1 s= new Studentinfo1(3,"avi","delhi");
		Studentinfo1 s1 =new Studentinfo1(12);
		Studentinfo1 s2 =new Studentinfo1("shivani",22);
		Studentinfo1 s3=new Studentinfo1();
		
		
		System.out.println(s2.getAge());
		System.out.println();
		
		//s.setData(3, "shiva", "pune");
		System.out.println(s.getCity());
		
		System.out.println(s.getName());
		System.out.println(s.getSid());
		System.out.println();
		System.out.println(s1.getCity());
		System.out.println(s1.getName());
		System.out.println(s1.getSid());
		System.out.println(s1.getAge());
		System.out.println();
		System.out.println(s2.getCity());
		System.out.println(s2.getName());
		System.out.println(s3.getSid());

	}

}
