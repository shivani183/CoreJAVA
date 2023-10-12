package Vector;
import java.util.*;
public class Launch {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(90);
		v.add(34);
		v.add(56);
		v.add(90);
		v.add(34);
		v.add(56);
		System.out.println(v);
		
		Enumeration em =v.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}

		
	}

}
