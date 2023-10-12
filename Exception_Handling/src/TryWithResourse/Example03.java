package TryWithResourse;
import java.io.*;
import java.util.Scanner;
public class Example03 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(BufferedReader bf = new BufferedReader(new FileReader("abc.txt"));Scanner scan= new Scanner(System.in)){
			
		}catch(Exception w) {
			
		}
		try(BufferedReader br = new BufferedReader(new FileReader("xwl.txt"))){
			try(BufferedReader br1 = new BufferedReader(new FileReader("xwl.txt"))){
				try(BufferedReader br2 = new BufferedReader(new FileReader("xwl.txt"))){
					
				}
			
		}

	}
		

}
	}
