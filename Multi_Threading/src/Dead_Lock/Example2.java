package Dead_Lock;
class MyThread1 extends Thread{}
public class Example2 {
	public static void main(String... agrs) throws IllegalThreadStateException{
		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		MyThread1 t=new MyThread1();
	    System.out.println(t.isDaemon());
	    t.setDaemon(true);
	    t.start();
	    System.out.println(t.isDaemon());
}

	

}
