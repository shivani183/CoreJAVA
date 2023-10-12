package Comaparator;

import java.util.*;

class MyComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
//		Integer i1= (Integer) o1;
//		Integer i2= (Integer) o2;
		String i1=o1.toString();
		String i2=o2.toString();
		
		System.out.println("calling this method");
		return i1.compareTo(i2);
//		if(i1<i2)
//			return +1;
//		else if(i1>i2)
//			return -1;
//		else
//			return 0;		
	}

}
public class Launch1_String_Integer {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator());
		
		//ts.add(12); ts.add(13); ts.add(45); ts.add(9);
		ts.add("shivani");
		ts.add("Avinash");
		ts.add("Human");
		 
		System.out.println(ts);
		

	}

}
