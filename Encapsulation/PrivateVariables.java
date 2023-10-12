package Encapsulation;

class Students{
	private int age;
	private String name;
	private String city;
	private boolean married;
	
	void setAge(int x){
		age=x;
	}
	int getAge(){
		return age;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	void setCity(String a){
		city=a;
	}
	String getCity(){
		return city;
	}
	void setMarried(boolean married) 
	{
		this.married=married;
	}
	boolean isMarried() {
		return married;
	}	
}
public class PrivateVariables {
	public static void main(String[] args) {
		Students s1=new Students();
		//s1.age=12;
		s1.setName("shivani");
		s1.setAge(12);
		String r=s1.getName();
		s1.setCity("lucknow");
		s1.setMarried(true);
		
		System.out.println(s1.getCity());
		System.out.println(r);
		System.out.println(s1.getAge());
		System.out.println(s1.isMarried());
	}

}
