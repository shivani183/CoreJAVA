package Polimorphism;

class Parents{
	public void cry() {
		System.out.println("parent cry");
	}
}
class Child1 extends Parents{
	public void cry() {
		System.out.println("child1 cry");
	}
}
class Child2 extends Parents{
	public void cry() {
		System.out.println("child2 cry");
	}
	public void sleep() {
		System.out.println("child2 sleeps");
	}
}

public class Parent1 {

	public static void main(String[] args) {
		Parents c1= new Child1();
		Parents c2= new Child2();
		c1.cry();
		c2.cry();
		Parents p;
		p=c1;	
		p.cry();
		//((Child2) p).sleep();
		p=c2;
		p.cry();
		((Child2) p).sleep(); // for specilised method type casting is imortant.
		
	}

}
