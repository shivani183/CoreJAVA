package Thread_Class;
class EThread extends Thread{
	public void run() {
		for(int x=0;x<5;x++)
		 {System.out.println("child class");}
		//Thread.yield();
	}
}
public class Yield_exp {

	public static void main(String[] args) {
		EThread et = new EThread();
		et.start();
		for(int x=0;x<5;x++)
		 {System.out.println("parent class");}

	}

}
