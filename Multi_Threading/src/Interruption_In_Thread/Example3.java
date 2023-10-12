package Interruption_In_Thread;

public class Example3 {

	public static void main(String[] args) {
		Runnable r =()->{
			
				System.out.println("child thread");};
			
		
		Thread t= new Thread(r);
		t.start();
		System.out.println("Parent Thread");

	}

}
