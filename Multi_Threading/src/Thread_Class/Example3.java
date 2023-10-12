package Thread_Class;

class School extends Thread{
	public void run() {
		System.out.println("into run method");
	}
	public void start() {
		System.out.println("into start method");
	}
}

public class Example3 {

	public static void main(String[] args) {
		School e1 = new School();
		System.out.println("into main method");
		e1.start();
		

	}

}
