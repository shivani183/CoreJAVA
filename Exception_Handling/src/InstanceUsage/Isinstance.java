package InstanceUsage;
import java.io.*;
class test{
}
public class Isinstance {

	public static void main(String[] args) throws Exception {
		test t = new test();
		
		System.out.println(Class.forName(args[0]).isInstance(t));
	
	}

}
