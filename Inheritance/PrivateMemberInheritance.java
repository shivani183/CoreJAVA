package Inheritance;

class Teacher{
	private int s;
	private int d;
	
	Teacher(){
		System.out.println("constructor");
	}
}
class Students3 extends Teacher{
	    // a constructor is created by jvm AND it has
		//super()is calling parents constructor
	void display() {			
	}	
	/*
	 * s=12; d=14;  // private member inheritance
	 */		
}

public class PrivateMemberInheritance {

	public static void main(String[] args) {
		Students3 s= new Students3 ();
		

	}

}
