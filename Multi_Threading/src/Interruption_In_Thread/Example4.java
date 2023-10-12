package Interruption_In_Thread;

public class Example4 {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("CHLID THREAD");
			}
		}).start();
		System.out.println("PARENT THREAD");

	}

}
