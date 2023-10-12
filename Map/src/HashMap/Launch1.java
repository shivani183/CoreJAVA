package HashMap;
import java.util.*;
public class Launch1 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(10, "sachin");
		hm.put(6, "virat");
		hm.put(20, "Messi");
		hm.put(13, "Dhoni");
		
		//System.out.println(hm.get(10));
		Object o =hm.get(20);
		System.out.println(o);
		
		//System.out.println(hm.keySet());
		Set s1 = hm.keySet();
		System.out.println(s1);
    
		//System.out.println(hm.entrySet());
		Set s2 = hm.entrySet();
		Iterator it1=s2.iterator();
		while(it1.hasNext()) {
		    System.out.println(it1.next());}
		
		//System.out.println(hm.values());
		Collection c = hm.values();
		Iterator itr = c.iterator();
		while(itr.hasNext()) {
		     System.out.println(itr.next());
		}
		
		
		LinkedHashMap lhm= new LinkedHashMap();
		lhm.put(1, "nimish");
		lhm.put(60, "rohan");
		lhm.put(32, "tony");
		lhm.put(12, "moni");
		System.out.println(lhm.values());
		System.out.println(lhm.entrySet());

	}

}
