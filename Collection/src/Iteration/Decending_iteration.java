package Iteration;
import java.util.*;
public class Decending_iteration {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.add(304);
		ll.add(344);
		ll.add(404);
		ll.add(342);
		ll.add(134);
		ll.add(341);
		System.out.println(ll);
		
		Iterator itr =ll.descendingIterator();
		
		 while(itr.hasNext()) {
			 Integer i = (Integer)itr.next();
			 System.out.print(i+ " ");
		 }
		 TreeSet al = new TreeSet();
		 al.addAll(ll);
		 Iterator it =al.descendingIterator();
		 while (it.hasNext()) {
			 System.out.println(it.next());
		 }

	}

}
