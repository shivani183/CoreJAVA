package HashMap;

import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

class Students{
	String name;
	int age;
	String city;
	public Students(String name, int age, String city) {
		this.name = name;
		this.age= age;
		this.city= city;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return name+" "+age +" "+city;
	}
	
}
public class Launch3 {

	public static void main(String[] args) {
		Students st1= new Students("shivani", 25,"rbts");
		Students st2= new Students("avi", 30,"Mirzapur");
		Students st3= new Students("rashi", 18,"Teliyaganj");
		
		HashMap hm = new HashMap();
		hm.put(111, st1);
		hm.put(222, st2);
		hm.put(333, st3);
		
		Set c=hm.entrySet();
		
		Iterator it=c.iterator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the unique code?");
		Integer i=scan.nextInt();
		boolean flag=true;
		while(it.hasNext()) 
		{
			Map.Entry me = (Entry)it.next();
			Integer k = (Integer) me.getKey();
			//System.out.println("Key : "+me.getKey()+" Values : "+me.getValue());
		    if(i==k)
		    {
		    	System.out.println("Values are : "+ me.getValue());
		    	System.exit(0);
		    }
		    else {
		    	System.out.println("Invalid unique code");
		    	break;
		    }
		}
//		if(flag==true) {
//	    	System.out.println("Invalid unique code");
//	    }
		
		
		
		
		

	}

}
