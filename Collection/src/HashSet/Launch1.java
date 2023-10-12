package HashSet;
import java.util.*;
public class Launch1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(112);
		hs.add(121);
		hs.add(132);
		hs.add(312);
		hs.add(124);
		hs.add(124);
		System.out.println(hs);
		System.out.println();
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(112);
		lhs.add(112);
		lhs.add(121);
		lhs.add(132);
		lhs.add(312);
		lhs.add(124);
		System.out.println(lhs);

	}

}
