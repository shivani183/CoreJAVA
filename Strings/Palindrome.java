package Strings;

public class Palindrome {

	public static void main(String[] args) {
		
		String sr= "nitin";
		String s = "";
		for(int i=sr.length()-1;i>=0;i--) {
			s= s+sr.charAt(i);
		}
		if(sr.equals(s)) {
			System.out.println("yes it is palindrome");
		}
		else
			System.out.println("not palindrome");
		

	}



}
