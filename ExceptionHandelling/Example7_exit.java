package ExceptionHandelling;
//here system is dominating
class Demo11{
	void dsp() {
		try {
		System.out.println("hi");
		System.exit(0);
		 }
		finally {
		System.out.println("bye");
		}
	}
}
public class Example7_exit {
	public static void main(String[] args) {
		Demo11 d = new Demo11();
		d.dsp();

	}
}
