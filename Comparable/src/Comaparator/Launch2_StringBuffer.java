package Comaparator;
import java.util.*;

class MyComparator1 implements Comparator{
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s1.compareTo(s2);
	}

}
public class Launch2_StringBuffer {

	public static void main(String[] args) {
		TreeSet ts= new TreeSet(new MyComparator1());
		ts.add(new StringBuffer("S"));
		ts.add(new StringBuffer("J"));
		ts.add(new StringBuffer("T"));
		ts.add(new StringBuffer("R"));
		
		System.out.println(ts);
		
		

	}

}
