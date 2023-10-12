package Thread_Class;
class MThread extends Thread{
	public void start() {
		super.start();
		// it will call start method of parent class
		System.out.println("in start method");
	}
	public void run() {
		System.out.println("in run method");
	}
}
public class Example4 {

	public static void main(String[] args) {
		MThread m = new MThread();
		System.out.println("in main method");
		m.start();

	}

}
