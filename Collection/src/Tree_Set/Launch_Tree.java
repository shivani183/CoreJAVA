package Tree_Set;

import java.util.TreeSet;

public class Launch_Tree {

	public static void main(String[] args) {
		TreeSet pq = new TreeSet();
		pq.add(1200);
		pq.add(2300);
		pq.add(9000);
		pq.add(120);
		pq.add(56);
		pq.add(121);
		pq.add(232);
		pq.add(903);
		pq.add(124);
		pq.add(565);
		System.out.println(pq);
		System.out.println(pq.lower(232));
		System.out.println(pq.higher(232));
		System.out.println(pq.ceiling(232));
		System.out.println(pq.floor(232));

	}

}
