package Widening;
class Demo9{
	public void add(long l) {
		System.out.println("widening");
	}
	public void add(Integer i) {
		System.out.println("autoboxing");
	}
	public void add(int...x) {
		System.out.println("var arg");
	}
}
public class Case_1 {

	public static void main(String[] args) {
		Demo9 d= new Demo9();
		d.add(12);
	}

}
