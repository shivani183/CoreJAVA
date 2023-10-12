package InnerTry_Catch;

public class Example1 {

	public static void main(String[] args) {
		try {
			System.out.println("statement1");
			System.out.println("statement2");
			System.out.println("statement3");
			try {
				System.out.println("statement4");
				System.out.println(5/0);
				
				System.out.println("statement6");}
			catch(NullPointerException e) {
				System.out.println("7");
			}
			finally {
				System.out.println("statement8");
			}
			System.out.println("statement9");}
			
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("statement10");
		}
			finally {
			System.out.println("statement11");
		}
			System.out.println("statement12");
			
			
		

	

}
}