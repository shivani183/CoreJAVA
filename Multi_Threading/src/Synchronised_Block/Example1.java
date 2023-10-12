package Synchronised_Block;
class Dsp{
	public void work(String name) {
		;;;
		synchronized(this) {
			for(int i=1;i<5;i++) {
				System.out.println(name+i);
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					
				}
			}
		}
	}
}

class MyThread extends Thread{
	Dsp d;
	String name;
	MyThread(Dsp d, String name){
		this.d=d;
		this.name = name;
	}
	public void run() {
		d.work(name);
	}
}
public class Example1 {

	public static void main(String[] args) {
		Dsp d= new Dsp();
		Dsp d1= new Dsp();
		MyThread t = new MyThread(d,"sami");
		MyThread t1 = new MyThread(d1, "romi");
		t.start();
		t1.start();
		

	}

}
