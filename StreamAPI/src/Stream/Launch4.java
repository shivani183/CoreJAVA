package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Launch4 {

	public static void main(String[] args) {
		ArrayList<String> la= new ArrayList<String>();
		la.add("shivni");
		la.add("sita");
		la.add("ram");
		la.add("lakhan");
		la.add("shyam");
		la.add("romi");
		
		
		System.out.println(la);
		
		List<String> li=la.stream().sorted().collect(Collectors.toList());
		System.out.println(li);
		
		List<String> li1=la.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(li1);
		

	}

}
