package Widening;
class Demo109{
	public void add(Integer l) {
		System.out.println("Autoboxing");
	}
	public void add(int...x) {
		System.out.println("var arg");
	}
}


		
public class Case_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo109 d= new Demo109();
		d.add(12);

	}

}
