package Thread_Class;
class MiThread implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class Example7 {

	public static void main(String[] args) {
		MiThread m= new MiThread();
		Thread t = new Thread(m);
		t.start();
		System.out.println(Thread.currentThread().getName());

	}

}
