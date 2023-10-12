package Thread_Class;
class Boss implements Runnable{
	@Override
	public void run() {
		System.out.println("in run method");
	}
}
public class Example5 {

	public static void main(String[] args) {
		Boss b = new Boss();
		Thread t1 = new Thread(b);
		Thread t2 = new Thread();
		//t2.start();
		//t2.run();
		//t1.start();
	    //t1.run();
		b.run();
		System.out.println("in main method");

	}

}
