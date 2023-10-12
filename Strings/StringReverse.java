package Strings;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "shivani";
		String b ="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);			
		}
		//System.out.println(b);
		
		String x= "Avinash Singh";
		String y="";
		String [] z= x.split(" ");
		for(int i=z.length-1;i>=0;i--) {
			y=y+z[i]+" ";
		}

		
//		for(String temp:z) {
//			for(int i=temp.length()-1;i>=0;i--) {
//				y=y+temp.charAt(i);			
//			}
//			y=y+" ";
//		}
		//System.out.println(x);
		System.out.println(y);
		
		
	}

}
