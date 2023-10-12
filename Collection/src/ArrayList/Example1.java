package ArrayList;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("shivani");
		al.add(12.3);
		System.out.println(al);
		al.add("shivani");
		al.add(2,66);
		System.out.println(al);
		ArrayList al3 = new ArrayList();
		al3.addAll(al);
		al3.add(2,45);
		System.out.println("=================================");
		System.out.println(al3);
		System.out.println(al3.lastIndexOf("shivani"));
		System.out.println(al3.indexOf("shivani"));
		System.out.println(al3.contains(66));
		

	}

}
