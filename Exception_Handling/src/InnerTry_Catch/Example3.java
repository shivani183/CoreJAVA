package InnerTry_Catch;

import java.util.Scanner;
class InvalidException extends Exception{
	
	public InvalidException(String msg){	
		super(msg);
	}
}
class Atm{
	int userid=1234;
	int password = 3333;
	int uid;
	int pass;
	public void input() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the userid");
		uid=scan.nextInt();
		System.out.println("please enter the password");
		pass= scan.nextInt();
		
	}
	public void verify()throws InvalidException {
		if((userid==uid) && (password==pass)) {
			System.out.println("collect your cash");
		}
		else {
			InvalidException ie = new InvalidException("you have entered wrong credentials try again");
			System.out.println(ie.getMessage());
			//System.out.println("you have entered wrong credentials try again");
			throw ie;
		}
	}
}
class Bank{
	public void initiate() {
		Atm a = new Atm();
		
		try {
			a.input();
			a.verify();
		} catch (InvalidException e) {
			try {
				a.input();
				a.verify();
			} catch (InvalidException e1) {
				try {
					a.input();
					a.verify();
				} catch (InvalidException e2) {
					System.out.println("User's card blocked");
					System.exit(0);
				}
			}
		}
}
}

public class Example3 {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.initiate();
		

	}

}
