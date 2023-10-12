package ExceptionHandelling;
//finally is dominating
class Demo{
	int dsp() {
		try {
		System.out.println("hi");
		return 10;}
		finally {
		System.out.println("bye");
		}
	}
}
public class Example6_Return_Finally {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.dsp();

	}

}
