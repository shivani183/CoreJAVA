package Iteration;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(23);
		al.add(45);
		al.add(90);
		al.add(78);
		System.out.println(al);
		
		Iterator itr=al.iterator();
		
		for(int a=0;a<al.size();a++) {
			System.out.print(al.get(a)+ " ");
		}
		System.out.println("Using For:Each");
		
		//In for Each
		for(Object o:al) {
			System.out.print(o+ " ");
		}System.out.println("using while loop");
		
		// While loop
		while(itr.hasNext()) {
			//Object o = itr.next();
			Integer i =(Integer)itr.next();
			System.out.print(i+ " ");
		}System.out.println("Reversing the objs");
		
		// for reversing data
		ListIterator ll =al.listIterator(al.size());
		while(ll.hasPrevious()) {
			Object o = ll.previous();
			System.out.print(o+ " ");
		}System.out.println();
		
		System.out.println("wiht tree set eg");
		TreeSet ts = new TreeSet();
		ts.add(90);
		ts.add(60);
		ts.add(90);
		ts.add(20);
		ts.add(70);
		ts.add(20);
		System.out.println(ts);
//		for(Object ob:ts) {
//			System.out.println(ob);
//		}
		Iterator it1=ts.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		LinkedList ss= new LinkedList();
		ss.addAll(ts);
		ss.add(90);
		System.out.println(ss);
		ListIterator li = ss.listIterator(ss.size());
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}
		
		
		

	}

}
