package Interfaces;
interface school{
	void classes();
	void hall();
	void student();
	void teacher();
}
abstract class Section1 implements school{
	public void classes() {}
	public void hall() {}
	public void student() {}
	public void teacher() {}
}
class learn extends Section1{
	public void hall() {
		System.out.println("hello world");
	}
}
public class Example10 {

	public static void main(String[] args) {
		learn l = new learn();
		l.hall();

	}

}
