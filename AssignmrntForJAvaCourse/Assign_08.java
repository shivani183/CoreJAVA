package AssignmrntForJAvaCourse;

import java.util.Scanner;

class name{
	String s;
	int len;
	int max = -1;
    char result = ' ';
	
	public void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a name- ");
		s=scan.nextLine();
		len=s.length();
		
	}
public void counting() {
	char[] numb= new char[122];
	for(int i=0;i<len;i++) {
		numb[s.charAt(i)]++;
	}
	for(int i=0;i<len;i++) {
		if(numb[s.charAt(i)]>max) {
			max=numb[s.charAt(i)];
			result=s.charAt(i);
		}
	}
	System.out.println("maximum occuring char- "+result);
}

}
public class Assign_08 {

	public static void main(String[] args) {
		name n= new name();
		n.input();
		n.counting();
	}
}

