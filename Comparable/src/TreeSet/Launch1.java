package TreeSet;

import java.util.TreeSet;

public class Launch1 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("A");
		ts.add("w");
		ts.add("d");
		ts.add("z");
		//ts.add(12);
		//ts.add(null);
		System.out.println(ts);
		
		TreeSet ts1 = new TreeSet();
		
		ts1.add(new StringBuffer("A"));
		ts1.add(new StringBuffer("G"));
		ts1.add(new StringBuffer("H"));
		System.out.println(ts1);
		System.out.println(1);
		System.out.println("1");
		
				
	}

}
