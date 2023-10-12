package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Launch2 {

	public static void main(String[] args) {
		ArrayList<String> al1= new ArrayList();
		al1.add("shivani");
		al1.add("hari");
		al1.add("laalaa");
		al1.add("neelaa");
		
		System.out.println(al1);
		//al1.forEach(System.out :: println);
		
		ArrayList<String> al2= new ArrayList();
		for(String name:al1) {
			al2.add(name.toUpperCase());
		}
		System.out.println(al2);
		
		
		List <String> newList= al1.stream().map(s->s.toUpperCase()).
				collect(Collectors.toList());
		newList.forEach(System.out::println);
		newList.forEach(i->System.out.print(i+" "));
		System.out.println();
		
		long l=newList.stream().filter(n->n.length()>5).count();
		System.out.println(l);
		
		List<String> si=newList.stream().filter(n->n.length()>5).collect(Collectors.toList());
		System.out.println(si);
		System.out.println(si.size());
		

	}

}
