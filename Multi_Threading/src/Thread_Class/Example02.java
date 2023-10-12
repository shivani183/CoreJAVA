package Thread_Class;
class MimeThread extends Thread{
	public void start() {
		System.out.println("hi start");
	}
	public void run() {
		System.out.println("in run");
	}
}
public class Example02 {

	public static void main(String[] args) {
		MimeThread mt = new MimeThread();
		mt.start();
		mt.run();
		System.out.println("in main method");

	}

}
