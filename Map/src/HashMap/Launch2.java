package HashMap;

import java.util.*;
import java.util.Map.Entry;
import java.util.Set;

public class Launch2 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(10, "sachin");
		hm.put(6, "virat");
		hm.put(20, "Messi");
		hm.put(13, "Dhoni");
		
		//Using parent class entry and map.
		
		Set s=hm.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Map.Entry e=(Entry) it.next();
			System.out.println(e.getKey()+ " : "+ e.getValue());
		}
		System.out.println("*****************");
		Collection c=hm.values();
		Iterator it1=c.iterator();
		while(it1.hasNext()) {
			String data =(String)it1.next();
			System.out.println("Values : "+data);
		}
		System.out.println("*****************");
		Set s2=hm.keySet();
		Iterator it5= s2.iterator();
		while(it5.hasNext()) {
			Integer i =(Integer) it5.next();
			System.out.println("Keys : "+i);
		}
		

	}

}
