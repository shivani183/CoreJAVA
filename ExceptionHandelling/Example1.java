package ExceptionHandelling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to calc");
		int a = 0,b=0;
		int c;
		
		try 
		{
		System.out.println("enter first num to divide");
		a=scan.nextInt();
		}
		catch(InputMismatchException i1)
		{
			System.out.println("pls eter nums");		
		}
		System.out.println("enter second num to divide");
		try 
		{
		b=scan.nextInt();
		c=a/b;
		System.out.println(c);}
		catch(InputMismatchException i)
		{
			System.out.println("pls eter nums");		
		}
		catch(ArithmeticException a1)
		{
			System.out.println("enter non zero num");		
		}
		System.out.println("program end");

	}

}
