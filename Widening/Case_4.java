
package Widening;
class Demo119{
	public void add(Long l) {
		System.out.println("widening");
	}
	public void add(int...x) {
		System.out.println("var arg");
	}
}


public class Case_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo119 d= new Demo119();
		d.add(12);

	}

}
