package LinkedList;

import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(12);
		ll.addLast(15);
		ll.add("name");
		ll.add(2, 'A');
		System.out.println(ll);
		LinkedList ll1 = new LinkedList();
		ll1.addFirst("java");
		ll1.addFirst(ll1);
		ll1.addAll(0, ll);
		ll1.add(2,3);
		System.out.println(ll1);
		System.out.println(ll1.getFirst());
		System.out.println(ll1.isEmpty());
		System.out.println(ll1.peek());
		System.out.println(ll1);
		System.out.println(ll1.peekLast());
		System.out.println(ll1);
		System.out.println(ll1.pollLast());
		System.out.println(ll1);
		System.out.println(ll1.offerFirst(100));
		System.out.println(ll1.offerLast(1100));
		System.out.println(ll1);
	}

}
