package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Launch3 {

	public static void main(String[] args) {
		ArrayList<Integer> la= new ArrayList();
		la.add(321);
		la.add(12);
		la.add(32);
		la.add(121);
		la.add(320);
		la.add(122);
		
		
		System.out.println(la);
		
		List<Integer> li=la.stream().sorted().collect(Collectors.toList());
		System.out.println(li);
		
		List<Integer> li1=la.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(li1);
        
        Integer minvalue=la.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(minvalue);
        
        Integer maxvalue=la.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(maxvalue);
	
	}

}
