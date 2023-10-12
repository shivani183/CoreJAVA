package Inheritance;

class Parent{// it is extending object class
	int a;
	int b;
	void display(){
		System.out.println("hi");
	}
	
}
class Child extends Parent{
	void temp() {
		System.out.println("child");
	}
}
class Gchild extends Parent{
	
}
class GGchild extends Child{
	
}



public class SingleInheritance {

	public static void main(String[] args) {
		Child a =new Child();
		a.display();
		GGchild s = new GGchild();
		s.temp();
	}

}
