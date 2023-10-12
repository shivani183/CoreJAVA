package Inter_Thread_Communication;
class Comp{
	
}
class MyThread extends Thread{
	int total=0;
	public synchronized void run() {
		for(int a =0;a<20;a++) {
			total+=a;
		}
		
	}
}
public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		mt.start();
		//Thread.sleep(20000);
		System.out.println(mt.total);

	}

}
