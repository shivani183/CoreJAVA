package Thread_Class;
class MsThread implements Runnable{
	public void run() {
		System.out.println("in run");
	}
}
public class Example6 {

	public static void main(String[] args) {
		MsThread mt = new MsThread();
		System.out.println(Thread.currentThread().getName());
		Thread t = new Thread(mt);
		t.start();
		System.out.println(t.getName());
		Thread.currentThread().setName("Upper");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
		System.out.println("in main");

	}

}
