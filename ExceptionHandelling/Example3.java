package ExceptionHandelling;

import java.util.Scanner;

class Alpha1{
	//if not handelling providing info
	public void add() throws ArithmeticException {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a num1");
		int a=s.nextInt();
		System.out.println("enter a num2");
		int b=s.nextInt();
		int z=a/b;
		System.out.println(z);
		
		
	}
}
class Beta1{
	//if not handelling providing info
	public void exp()throws ArithmeticException {
		Alpha1 a = new Alpha1();
		a.add();
		}
}
public class Example3 {

	public static void main(String[] args)
	//have info now handelling
	{
		try {
		Beta1 b = new Beta1();
		b.exp();}
		catch(ArithmeticException ae) {
			System.out.println("enter non zero num");
		}
	}
}	
