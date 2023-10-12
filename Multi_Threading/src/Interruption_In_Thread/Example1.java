package Interruption_In_Thread;
class MyThread extends Thread{
	public void run() {
		try {
			for(int s=1;s<5;s++) {
				System.out.println("child thread");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Got an interruption");
		}
	}
}
public class Example1 {

	public static void main(String[] args) throws InterruptedException  {
		MyThread mt = new MyThread();
		mt.start();
		mt.interrupt();
		for(int s=1;s<5;s++) {
			System.out.println("parent thread");}
		

	}

}
