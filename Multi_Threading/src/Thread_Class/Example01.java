package Thread_Class;
class Mythread extends Thread{
	public void run() {
		for(int c=1;c<10;c++) {
			System.out.println("hi i'am inside rum method");}
	}
}
public class Example01 {

	public static void main(String[] args) {
		Mythread mt = new Mythread();
		mt.start();
		for(int c=1;c<10;c++) {
			System.out.println("Hello i'am inside main method");}

	}

}
