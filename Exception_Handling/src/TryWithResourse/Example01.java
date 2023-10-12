package TryWithResourse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Example01 {
	
	
	//to avoide headache of adding finally block to close resourse block present in the try block
	// we are using try with resourse at the end of try block automatically resourse will be closed wether normally or abnormal so no need of finally block
	//StringBuffer implements AutoClosable(responsible for closing) but string does not.
	//in try with resource catch block is not necessary(1.7V)
	
	public static void main(String[] args) {
		
		//implicilty it will make it as final so that no confusion should come across
		//try(final BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
		
		try(BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
			new BufferedReader(new FileReader("output.txt"));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
//		finally {
//			if(br!=null)
//				br.close();
//		}
		
		try(Scanner scan= new Scanner(System.in)){
			System.out.println("default");
		}
		catch(ArithmeticException e) {
			System.out.println("handled");
		}

	}

}
