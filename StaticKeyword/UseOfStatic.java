package StaticKeyword;

class Demo{
	static int a;
	static int b;
	
	static void display() {
		a=10;
		b=20;
		System.out.println("static method");
		
	}
	static {
		int x=12;
		int y =13;
		System.out.println("static block");
		
	}
	int q;
	int w;

	void temp() {

		System.out.println("non static method");

	}
	Demo(){
		System.out.println("constructor");
	}
	{
		System.out.println("non static block");
		System.out.println(a);
		System.out.println(b);
	}
}
public class UseOfStatic {
	public static void main(String[] args) {
		Demo.display();
		Demo d = new Demo();
		d.temp();

	}
}
