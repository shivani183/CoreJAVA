package Widening;
class Demo19{
	public void add(long l) {
		System.out.println("widening");
	}
	public void add(int...x) {
		System.out.println("var arg");
	}
}

public class Case_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo19 d= new Demo19();
		d.add(12);

	}

}
