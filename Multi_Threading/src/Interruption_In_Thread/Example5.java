package Interruption_In_Thread;
class Display{
	public void wish(String name) {
	//public synchronized void wish(String name) {	
		for(int x=0;x<5;x++) {
			System.out.println("Player name is: "+name);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			}
		}
		
		System.out.println(name);
	}
}

class WeThread extends Thread{
	Display d;
	String name;
	WeThread(Display d, String name){
		this.d=d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}
public class Example5 {

	public static void main(String[] args) {
		Display d= new Display();
		WeThread w1 = new WeThread(d,"Dhoni");
		WeThread w2 = new WeThread(d,"virat");
		w1.start();
		w2.start();
		System.out.println("main end");

	}

}
