package Join;
class MyThread extends Thread{
	static Thread mt;
// child thread will wait for Main thread to complete
	public void run() {
		
		try {
			mt.join();
		}
		catch(InterruptedException e){
			
		}
		for(int x=0;x<5;x++) {
			System.out.println("child Thread");
		}
	}
}
public class Example01 {

	public static void main(String[] args) throws InterruptedException {
		MyThread.mt=Thread.currentThread();
		MyThread t = new MyThread();
		t.start();
		for(int x=0;x<5;x++) {
			System.out.println("parent Thread");
		}

	}

}
