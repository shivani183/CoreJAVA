package Gen_comp;
import java.util.*;
public class Launch2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList<String>();
		ArrayList al2 = new ArrayList<Integer>();
		ArrayList al3 = new ArrayList<Boolean>();
		
		//All the above line of code are same
		
		ArrayList<String> ll1 = new ArrayList<String>();
		ArrayList<String> ll2 = new ArrayList<>();
		ArrayList<String> ll3 = new ArrayList();
		
		//All three line of codes are same
	}
	//Can't have same type of collection while method overloading
	//Beacuse compiler will remove generic and it will check the syntax
	
	public void m1(ArrayList<String> s) {}
	//public void m1(ArrayList<Boolean> s) {}

}
