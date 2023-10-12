package Strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1="race";
		String s2="caRe";
		
		String l1= s1.toLowerCase();
		String l2= s2.toLowerCase();
		
		
		char [] c1= l1.toCharArray();
		char [] c2= l2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c2,c1)) {
			System.out.println("It is a Anagram");
		}else
			System.out.println("It is not a Anagram");
		

	}

}
