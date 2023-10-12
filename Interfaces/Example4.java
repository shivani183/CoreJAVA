package Interfaces;

interface X{
	public static final int number = 100;
	void fun();
}
interface Y extends X{
	
}
class F implements Y{
	public void fun() {
		System.out.println(number);
	}
}

public class Example4 {

	public static void main(String[] args) {
		X we = new F();
		System.out.println(we.number);

	}

}
