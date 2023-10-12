package Inheritance;
class Parentt{
	int a,b;	
	Parentt(){
		this(80, 90);
		a=10;
		b=20;
		System.out.println("parent constructor");
	}
	Parentt(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("parent para constructor");
	}		
	void display() {

		System.out.println("parent method");
	}
}
class Childd extends Parentt{
	int x,y;
	Childd(){
		a=23;
		b=34;
		System.out.println("child constructor");		
	}
	Childd(int x,int y){
		super(11,22);
		this.x=x;
		this.y=y;
		System.out.println("child para constructor");
	}
	void temp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
	
}
public class ConstructorInheritance {

	public static void main(String[] args) {
		//Childd c = new Childd();
		//c.display();
		Childd c1 = new Childd(40,50);
		c1.temp();
		Childd d= null;
		c1.x=12;
		//c1.temp();
		


	}

}
