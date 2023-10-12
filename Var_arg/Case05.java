package Var_arg;
class Demo3{
	public void que(int...x) {
		System.out.println("by default into var arg");
	}
	public void que(int y) {
		System.out.println("only one argument");
	}
}

public class Case05 {

	public static void main(String[] args) {
		Demo3 d= new Demo3();
		d.que();
		d.que(12);
		d.que(35,32);
	}

}
