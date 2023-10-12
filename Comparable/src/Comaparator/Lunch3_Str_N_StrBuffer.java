package Comaparator;
import java.util.*;
//import java.lang.*;
class MComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		int i1=s1.length();
		int i2=s2.length();
		if(i1<i2) {
			return -1;
		}
		else if(i1>i2) {
			return 1;
		}
		else
		    return s1.compareTo(s2);
	}

}

public class Lunch3_Str_N_StrBuffer {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new MComparator());	
		ts.add("A");
		ts.add("AA");
		ts.add(new StringBuffer("XX"));
		ts.add(new StringBuffer("ABCD"));
		ts.add("FGHJL");
		
		System.out.println(ts);

	}

}
