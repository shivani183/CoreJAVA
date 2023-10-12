package ExceptionHandelling;

import java.util.Scanner;

class Alpha{
	public void add() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a num1");
		int a=s.nextInt();
		System.out.println("enter a num2");
		int b=s.nextInt();
		int z=a/b;
		System.out.println(z);
		
		
	}
}
class Beta{
	public void exp() {
		Alpha a = new Alpha();
		a.add();
		}
}
public class Example2 {

	public static void main(String[] args) {
		try {
		Beta b = new Beta();
		b.exp();}
		catch(ArithmeticException ae) {
			System.out.println("enter non zero num");
		}

	}

}
