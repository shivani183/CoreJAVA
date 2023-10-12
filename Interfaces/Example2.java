package Interfaces;

interface IA {
	void name();
	void classn();
}
class BImpl implements IA{
	public void name() {
		System.out.println("shivani");
	}
	public void classn() {
		System.out.println("singh");		
	}
}
//class C extends BImpl{
//	public void classn() {
//		System.out.println("singh");
//	}
//}

public class Example2 {

	public static void main(String[] args) {
		//IA y =new IA();
		IA x=new BImpl();
		x.name();

	}

}
