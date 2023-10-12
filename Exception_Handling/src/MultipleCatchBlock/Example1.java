package MultipleCatchBlock;

import java.io.IOException;

public class Example1 {

	public static void main(String[] args) {
		try {
			System.out.println("heloo");
		}catch(ArrayIndexOutOfBoundsException |ArithmeticException e) {
			
		}
		//catch(Exception|NullPointerException e){} => CE: bcoz should'nt be parent child relation.
			
		

	}

}
