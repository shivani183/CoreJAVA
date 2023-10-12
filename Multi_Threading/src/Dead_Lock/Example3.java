package Dead_Lock;
class School extends Thread{
	public void run() {
		for(int a=0;a<5;a++) {
			System.out.println("in child thread");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException w) {
				
			}
		}
	}
}
public class Example3 {

	public static void main(String[] args) {
		School s = new School();
		s.setDaemon(true);//stmt-1
        s.start();
        System.out.println("end of main thread");

	}

}
