package Join;
class MiThread extends Thread{
	static Thread mt;
	public void run() {
	// main Thread will wait for child Thread to complete	
		for(int s=0;s<5;s++) {
			System.out.println("child  Thread");
		}
	}
}
public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		MiThread.mt = Thread.currentThread();
		MiThread t = new MiThread();
		t.start();
		//t.join();
		
		for(int s=0;s<5;s++) {
			System.out.println("Main Thread");
			Thread.sleep(3000);
		}

	}

}
