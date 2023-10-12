package Getter_relation;

import Setter_relation.Setter_course01;
import Setter_relation.Setter_student;

public class Get_Details {
	public static void main(String[] args) {
		
		Setter_course01 c1= new Setter_course01();
		c1.setCourse_id(90);
		c1.setCourse_name("java");
		Setter_course01 c2= new Setter_course01();
		c2.setCourse_id(92);
		c2.setCourse_name("python");

		Setter_course01[] c= new Setter_course01[2];
		c[0]=c1;
		c[1]=c2;
		
		Setter_student s1= new Setter_student();
		
		s1.setStudent_id(12);
		s1.setStudent_name("nishu");
		
		

	}

}
