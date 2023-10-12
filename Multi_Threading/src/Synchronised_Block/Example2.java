package Synchronised_Block;
class Dsp1{
	public void work(String name) {
		;;;
		synchronized(Dsp.class) {
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

class MyThread1 extends Thread{
	Dsp1 d;
	String name;
	MyThread1(Dsp1 d, String name){
		this.d=d;
		this.name = name;
	}
	public void run() {
		d.work(name);
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dsp1 d= new Dsp1();
		Dsp1 d1= new Dsp1();
		MyThread1 t = new MyThread1(d,"sami");
		MyThread1 t1 = new MyThread1(d1, "romi");
		t.start();
		t1.start();

	}

}
