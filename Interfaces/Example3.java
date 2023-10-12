package Interfaces;
interface IAa {
	void name();
	void classn();
}
abstract class BaImpl implements IAa{
	public void name() {
		System.out.println("shivani");
	}
	
}
class C extends BaImpl{
	public void classn() {
		System.out.println("singh");
	}
}

public class Example3 {

	public static void main(String[] args) {
		IAa at= new C();
		at.classn();
		at.name();
		String q="hey";
		System.out.println(q.intern());

	}

}
