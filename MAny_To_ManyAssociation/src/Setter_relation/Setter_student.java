package Setter_relation;


public class Setter_student {
	int student_id;
	String student_name;
	Setter_course01 course[];
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public Setter_course01[] getCourse() {
		return course;
	}
	public void setCourse(Setter_course01[] course) {
		this.course = course;
	}
	public void getAllDetails() {
		System.out.println("Student  details: ");
		System.out.println("Name of Student : " + student_name);
		System.out.println("Id od Student: " + student_id);
		System.out.println();
		System.out.println("Course details : ");
		for(Setter_course01 co:course) {
			System.out.println("Course name : "+co.course_id);
			System.out.println("Course id : "+co.course_id);
			System.out.println();
	
}
		}
}