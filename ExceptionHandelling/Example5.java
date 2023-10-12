package ExceptionHandelling;
//if exception handled in same method then also want to propagate-"throw"
import java.util.Scanner;

class Abc{
	public void div()throws ArithmeticException {
		Scanner s= new Scanner(System.in);
		try {
		System.out.println("enter a num1");
		int a=s.nextInt();
		System.out.println("enter a num2");
		int b=s.nextInt();
		int z=a/b;
		System.out.println(z);
	}
		catch(ArithmeticException e) {
			System.out.println("error handled in div");
			throw e;
		}
		finally {
		System.out.println("terminated");}
	}
}
public class Example5 {

	public static void main(String[] args) {
		try {
		Abc ab= new Abc();
		ab.div();
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println("error handled in main");
		}
	}

}
