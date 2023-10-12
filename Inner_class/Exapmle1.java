package Inner_class;
class A{
	public void dspl() {
		System.out.println("in display");
	}
	class B{
		public void config() {
			System.out.println("in config");
		}
	}
}
public class Exapmle1 {

	public static void main(String[] args) {
		A obj = new A();
		obj.dspl();
		//A.B obj1 =new A.B();
		A.B obj2= obj.new B();
		obj2.config();
		
	}

}
