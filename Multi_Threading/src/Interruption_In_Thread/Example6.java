package Interruption_In_Thread;
class Team{
	public synchronized void DspNumber() {
		for(int x=0;x<5;x++) {
			System.out.println(x);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {				
			}
		}
	}
	public synchronized void DspChar() {
		for(int x=0;x<5;x++) {
			System.out.println(x+" 0");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ie) {	
			}
		}
	}
}
class DiThread extends Thread{
	Team t;
	DiThread(Team t){
		this.t= t;		
	}
	public void run() {
		t.DspChar();
	}
}
class DiThread1 extends Thread{
	Team t;
	DiThread1(Team t){
		this.t= t;
		
	}
	public void run() {
		t.DspNumber();
	}
}
public class Example6 {

	public static void main(String[] args)throws InterruptedException {
		Team t= new Team();
		DiThread dt = new DiThread(t);
		DiThread1 dt1 = new DiThread1(t);
		dt1.start();
		dt.start();
		System.out.println("main mehtod");

	}

}
