package InnerTry_Catch;

public class Example2 {

	public static void main(String[] args) {
		try {
			System.out.println("statement1");
			System.out.println("statement2");
			System.out.println("statement3");
			try {
				System.out.println("statement4");
				System.out.println(5/0);
				
				System.out.println("statement6");}
			catch(NullPointerException eq) {
				System.out.println("7");
			}
			finally {
				System.out.println("statement8");
			}
			System.out.println("statement9");}
			
		catch(ArithmeticException e){
			try {
				System.out.println("10");
			}
			catch(ArrayIndexOutOfBoundsException ea){
				System.out.println("11");
			}
			finally {
				System.out.println("12");
			}
			
		}
		finally {
			try {
				System.out.println("statement13");
			}
			catch(ArithmeticException e) {
				System.out.println("14");
			}
			finally {
				System.out.println("15");
			}
			
		}
			

	}

}
