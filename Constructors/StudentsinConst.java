package Constructors;


class Studentinfo{
	
	private int sid;
	private String name;
	private String city;
	
	//void setData(int sid, String name, String city) {
	Studentinfo(int sid, String name, String city) {
		this.sid=sid;
		this.name=name;
		this.city=city;		
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
public class StudentsinConst {

	public static void main(String[] args) {
		Studentinfo s= new Studentinfo(3,"avi","delhi");
		
		//s.setData(3, "shiva", "pune");
		System.out.println(s.getCity());
		System.out.println(s.getName());
		System.out.println(s.getSid());

	}

}
