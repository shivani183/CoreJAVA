package GetingDetail;

import ConstrRelation.Course;

import ConstrRelation.Student;

public class GetDetail {
	public static void main(String[] args) {
		Course c= new Course("A12","java");
		Course c1= new Course("B11", "python");
		Course c2= new Course("C22", "javascript");
		Course[] course= new Course[3];
		course[0]=c;
		course[1]=c1;
		course[2]=c2;
		
		Student s= new Student("shiv", "g1", course);
		Student s1= new Student("ishi", "g2", course);
		Student s2= new Student("nishi", "g3", course);
		s.getDetails();
		s1.getDetails();
		s2.getDetails();
		
		
	}

}
