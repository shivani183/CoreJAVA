package GarbageCollector;
import java.util.*;
class Student{
	String name;
	int age;
	String city;
	@Override
	
	public String toString() {
		return name+" "+age+ " "+city;
	}
	@Override
	public void finalize(){
		System.out.println("GC has collected the object.");
	}
}
public class Launch1 {

	public static void main(String[] args) {
		Student s= new Student();
		HashMap hm = new HashMap();// it will dominate GC
		//hm.put(s, "name");
		WeakHashMap whm = new WeakHashMap(); // GC will dominates WeakHM
		whm.put(s, "name");
		s=null;
		System.gc();
		System.out.println("end the program");

	}

}
