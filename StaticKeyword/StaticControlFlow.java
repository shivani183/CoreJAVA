package StaticKeyword;

public class StaticControlFlow {
	
	static int a;
	static int b;
	
	static {
		System.out.println("static block");
		a=10;
		b=12;
		
	}
	static void display(){
		System.out.println("static method");
		System.out.println(a);
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		display();
		System.out.println("main method");

	}

}
