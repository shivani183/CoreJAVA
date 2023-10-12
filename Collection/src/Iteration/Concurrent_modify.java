package Iteration;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;


public class Concurrent_modify {

	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		Set sh = new LinkedHashSet();
		
		List al= new ArrayList();
		al.add(23);
		al.add(123);
		al.add(223);
		al.add(235);
		al.add(230);
		// sorting the collections class concept
		
		Collections.sort(al);
		System.out.println(Collections.binarySearch(al, 230));
		System.out.println(Collections.frequency(al, 2399));
		System.out.println(al);
		
		for(int a = 0;a<al.size();a++) {
//			System.out.println(al.get(a));
//			al.add(200);
		}
		
		Iterator it =al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			//al.add(45);
		}
		System.out.println("**************************");
		CopyOnWriteArrayList cal = new CopyOnWriteArrayList();
		cal.add(23);
		cal.add(33);
		cal.add(213);
		cal.add(331);
		cal.add(203);
		cal.add(330);
		System.out.println(cal);
		
		Iterator itr = cal.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			cal.add(123);
		}
	// using parent type loose coupling
		Deque sl= new LinkedList();
		Queue l= new LinkedList();
		Deque ll= new ArrayDeque();
		ll.add(al);
		//System.out.println(ll.poll());
		
		

	}

}
