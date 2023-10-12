package Comaparator;
import java.util.*;
class Employee implements Comparable {
	String name;
	int eid;
	Employee(String name, int eid){
		this.name=name;
		this.eid=eid;
	}
	public String toString() {
		return name +" ===> "+eid;
	}
	@Override
	public int compareTo(Object o) {
		int i1=this.eid;
		Employee em1=(Employee)o;
		int i2=em1.eid;
		if(i1<i2) 
			return -1;
		if(i1>i2) 
			return 1;
		else
			return 0;
	}
}
class CComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee em1=(Employee)o1;
		Employee em2= (Employee)o2;
		String n1=em1.name;
		String n2=em2.name;
		return n1.compareTo(n2);
	}
	
}
public class Launch4_UserDefined {

	public static void main(String[] args) {
		Employee e1= new Employee("nitin", 12);
		Employee e2= new Employee("lakshy", 19);
		Employee e3= new Employee("arya", 45);
		Employee e4= new Employee("aarti", 60);
		
		TreeSet ts= new TreeSet();
		ts.add(e1);
		ts.add(e4);
		ts.add(e2);
		ts.add(e3);
		
		System.out.println(ts);
		
		TreeSet ts1= new TreeSet(new CComparator());
		ts1.add(e1);
		ts1.add(e4);
		ts1.add(e2);
		ts1.add(e3);
		
		System.out.println(ts1);
		

	}

}
