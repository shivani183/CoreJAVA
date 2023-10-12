package Stream;
import java.util.*;
import java.util.stream.*;
public class Launch_AL {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList();
		al.add(12);
		al.add(34);
	    al.add(57);
	    al.add(90);
	    al.add(33);
	    al.add(122);
	    
	    System.out.println(al);
	    ArrayList<Integer> nal= new ArrayList();
	    
	    for(Integer a1:al) 
	    	if(a1%2==0) 
	    		nal.add(a1);
	   
	    System.out.println(nal);
	    System.out.println();
	    
	    //FILTER= filtering the objects(removing of objs from list)
	    List<Integer> newL=al.stream().filter(i->i%2==0).collect(Collectors.toList());
	    System.out.println(newL);
	    newL.forEach(System.out :: println);
	    System.out.println("********************************");
	    
		
		//for multiplication with two
	    //MAP= taking one obj and giving diff obj(for every obj new obj has been created)
		List<Integer> Mal=nal.stream().map(o->o*2).collect(Collectors.toList());
		System.out.println(Mal);
		Mal.forEach(i->System.out.print(i+" "));
		Mal.forEach(System.out :: println);

	}

}
