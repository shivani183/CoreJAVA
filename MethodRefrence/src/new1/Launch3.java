package new1;
import java.util.*;
import java.util.function.Consumer;
class MyConsumer implements Consumer<String>{
	@Override
	public void accept(String t) {
		System.out.println("Accept is called");
		System.out.println(t);
	}
}
public class Launch3 {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList();
		al.add("sachin");
		al.add("Dhoni");
		al.add("kohli");
		al.add("pathan");
		
		// Traditional way
		Consumer<String> con=new MyConsumer();
		al.forEach(con);
		System.out.println();
		
		//Using method reference
	    al.forEach(System.out::println);
	    System.out.println();
	    
	    //Using lambda expression
	    al.forEach(t->System.out.println(t));
	    
		

	}

}
