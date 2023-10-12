package InstanceUsage;

import java.util.ArrayList;

//instanceof check relation with predefined class
class student{
	
}
class emp{
	
}
class man{
	
}
public class instanceOf {

	public static void main(String[] args) {
		student s1= new student();
		Object o1=new student();
		
		ArrayList al= new ArrayList();
		al.add(new student());
		al.add(new emp());
		al.add(new man());
		
		Object o=al.get(0);
		
//		if(o instanceof student )
//			student s = (student)o;
//		else if (o instanceof emp)
//			emp e= (emp)o;
//		else if (o instanceof man)
//			man m=(man)o;
			
		
//		System.out.println(s instanceof Object);
//		System.out.println(s instanceof student);
//		System.out.println(e instanceof Object);
//		System.out.println(s instanceof Object);
//		System.out.println(s instanceof Object);
//		System.out.println(s1 instanceof String);
		System.out.println(o1 instanceof String);
		
		
		

	}

}
