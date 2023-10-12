package Stream;

import java.util.ArrayList;

public class Launch5 {

	public static void main(String[] args) {
		ArrayList<Integer> la= new ArrayList<Integer>();
		la.add(321);
		la.add(12);
		la.add(32);
		la.add(121);
		la.add(320);
		la.add(122);

		System.out.println(la);
		
		//Into integer array
		Integer[]obj1=la.stream().toArray(Integer[]::new);
		for(Integer o:obj1)
			System.out.println(o);
		
		//Into object array
		Object[]obj=la.stream().toArray();
		for(Object o:obj)
			System.out.println(o);
	}

}
