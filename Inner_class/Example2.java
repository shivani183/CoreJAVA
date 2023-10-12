package Inner_class;
abstract class A1{
	abstract public void dspl();
}
//class B1 extends A1{
//	public void dspl() {
//		System.out.println("into dspl");
//	}
//}

public class Example2 {

	public static void main(String[] args) {
		A1 as= new A1() { // anonymous inner class
			public void dspl() {
				System.out.println("inside inner class");
			}
		};
		as.dspl();
	}
}
