package Abstract;

abstract class UpPerson{
	abstract public void read();
	public void write() {
		System.out.println("any one can write");
	}
}
class LowPerson extends UpPerson{
	public void read() {
		System.out.println("any one can read");
	}
}



public class AbstractExcercise {

	public static void main(String[] args) {
		//UpPerson up =new UpPerson();
		UpPerson up=new LowPerson();
		up.read();
		up.write();

	}

}
