package Interfaces;

interface IExample{
	void dspl();
	void sys();
	
}
class Show implements IExample{
	public void dspl() {
		System.out.print("some");
		
	}public void sys() {
		System.out.println("thing");
	}
}


public class Example01 {

	public static void main(String[] args) {
		IExample ex = new Show();
		ex.dspl();
		ex.sys();

	}

}
