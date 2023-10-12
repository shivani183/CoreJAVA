package Inter_Thread_Communication;
class SiThread extends Thread{
	int sum=0;
	public void run() {		
		;;;
		synchronized(this) {
			System.out.println("In child thread");
			for(int s=0;s<30;s++) {
				sum+=s;
			}
			System.out.println("Releaving child thread");
			notify();
		}
	}
}
public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		SiThread st= new SiThread();
		st.start();
		//Thread.sleep(2000);
		synchronized(st) {
			System.out.println("in parent thread");
			st.wait(2000);
			System.out.println("got notify");
			System.out.println(st.sum);
		}

	}

}
