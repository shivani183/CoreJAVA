package Gen_comp;
import java.util.*;

public class Launch1 {
	public static void main(String[] agrs) {
		ArrayList<String> al = new ArrayList();
		al.add("only S");
		//al.add(12);
		
		ArrayList al1 = new ArrayList<String>();
		al1.add("only S");
		al1.add(12);
		
		m1(al);
		System.out.println(al);
		
	}
	public static void m1(ArrayList al) {
		al.add("shivani");
		al.add(10);
		al.add(12.3);
	}

}
