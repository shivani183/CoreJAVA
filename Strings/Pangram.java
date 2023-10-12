package Strings;

public class Pangram {

	public static void main(String[] args) {

		String s1= "THE QUICK BROWN FOX JUMPS OVER LAYZ DOG";
		s1=s1.replace(" ", "");
		
		char [] c1= s1.toCharArray();
		
		int [] c2= new int [26];
		
		for(int ele:c1) {
			int index= ele-65;
			c2[index]++;			
		}
		boolean flag=true;
		for(int i=0;i<c2.length;i++) {
			if(c2[i]==0) {
				System.out.println("it's not a pangram");
				flag=false;
				break;
			}
				
		}
		if(flag==true)
			System.out.println("It's a pangram");
		
		
		
	}

}
