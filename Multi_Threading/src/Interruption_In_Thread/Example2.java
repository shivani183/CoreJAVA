package Interruption_In_Thread;
class MiThread extends Thread{
	public void run() {
		for(int w=0;w<5;w++) {
			System.out.println("child Thread");
		}
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
public class Example2 {

	public static void main(String[] args) throws InterruptedException{
		MiThread tt = new MiThread();
		tt.start();
		tt.interrupt();
		System.out.println("main Thread");

	}

}
