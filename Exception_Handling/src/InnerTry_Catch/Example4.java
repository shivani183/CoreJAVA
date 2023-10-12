package InnerTry_Catch;

import java.util.Scanner;
class UnderCostomerException extends Exception{
	UnderCostomerException(String m){
		super(m);
	}
}
class OverCostomerException extends Exception{
	OverCostomerException(String m){
		super(m);
	}
}
class RtoForm{
	int age;
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your age");
		age=scan.nextInt();		
	}
	public void verify()throws UnderCostomerException,OverCostomerException {
		if(age<18) {
			UnderCostomerException ce= new UnderCostomerException("invalid you are underage");
			System.out.println(ce.getMessage());
			throw ce;}
		else if(age>60)
		{   OverCostomerException ce= new OverCostomerException("invalid you are overage");
		    System.out.println(ce.getMessage());
		    throw ce;}	
		else
			System.out.println("Go ahead");			
	}	
}
class Rto{
	public void dsp() {
		RtoForm rf= new RtoForm();
		try {
			rf.input();
			rf.verify();
		} catch (UnderCostomerException e) {
			try {
				rf.input();
				rf.verify();
			} catch (UnderCostomerException e1) {
				System.out.println("Can't have an Dl you are too young");
				System.exit(0);
			}
			catch (OverCostomerException e1) {
				System.out.println("Can't have an Dl, you are too old");
				System.exit(0);
			}
		}
		catch (OverCostomerException e) {
			try {
				rf.input();
				rf.verify();
			} catch (UnderCostomerException e1) {
				System.out.println("Can't have an Dl you are too young");
				System.exit(0);
			}
			catch (OverCostomerException e1) {
				System.out.println("Can't have an Dl you are too old");
				System.exit(0);
			}
		}
		
	}	
}
public class Example4 extends RtoForm{
	public static void main(String[] args) {
		Rto r = new Rto();
		r.dsp();
		Example4 e = new Example4();
		
		
	}
}
