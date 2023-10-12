package ConstrRelation;

public class Student {
	String sname;
	String sid;
	Course[] course;
	
	public Student(String sname, String sid, Course[] course) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.course = course;
	}
	public void getDetails() {
		System.out.println("Student details : ");
		System.out.println("Student name : "+ sname);
		System.out.println("Student id : "+ sid);
		System.out.println("Student course : ");
		for(Course i:course) {
			System.out.println(i.courseid);
			System.out.println(i.coursename);
			
		}System.out.println("Student details : ");
		System.out.println("Student name : "+ sname);
		System.out.println("Student id : "+ sid);
		System.out.println("Student course : ");
		for(Course i:course) {
			System.out.println(i.courseid);
			System.out.println(i.coursename);
			
		}System.out.println("Student details : ");
		System.out.println("Student name : "+ sname);
		System.out.println("Student id : "+ sid);
		System.out.println("Student course : ");
		for(Course i:course) {
			System.out.println(i.courseid);
			System.out.println(i.coursename);
		}
	}
	
	

}
