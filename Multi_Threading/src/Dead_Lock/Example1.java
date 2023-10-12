package Dead_Lock;
class A{
	public synchronized void d1(B b) {
		System.out.println("Thread-1 start at d1");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			
		}
		System.out.println("Thread-1 catching last");
		b.last();		
	}
	public synchronized void last(){
		System.out.println("Inside A's last");
	}
}
class B{
	public synchronized void d2(A a) {
		System.out.println("Thread-2 start at d2");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			
		}
		System.out.println("Thread-2 catching last");
		a.last();		
	}
	public synchronized void last(){
		System.out.println("Inside B's last");
	}
}
public class Example1 extends Thread {
	A a = new A();
	B b = new B();
	public void m1() {
		this.start();
		a.d1(b);
	}
	public void run() {
		b.d2(a);
		//e.m1();
	}
	

	public static void main(String[] args) {
		Example1 e = new Example1();
		e.m1();

	}

}
