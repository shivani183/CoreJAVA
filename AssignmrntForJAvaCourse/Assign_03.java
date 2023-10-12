package AssignmrntForJAvaCourse;

class PalindromeAssign{
	String x= "2552";
	char[] as=x.toCharArray();
	boolean w=true;	
	void checkPalindrome() {
		int j;
		loop:for(int i=0;i<as.length;i++) {
			
			for(j=(as.length-1)-i;j>=0;) {
				if(as[i]==as[j]) {
					
					break;}	
				else
					{System.out.println("not palindrome");
					w=false;
					break loop;}				
			}
		}if(w==true) {
			System.out.println("palindrome");
		}		
		  for(int i=0;i<as.length;i++) { 
			  System.out.print(as[i]+" "); }
		  System.out.println(); 
		  System.out.println(as.length);		 
		}
}

public class Assign_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeAssign d =new PalindromeAssign();
		d.checkPalindrome();

	}

}
