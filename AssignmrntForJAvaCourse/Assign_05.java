package AssignmrntForJAvaCourse;

class Anagram{
	String a="FuneraL";
	String b ="FunReal";
	String c="";
	String d="";
	char[] x=a.toCharArray();
	char[] y=b.toCharArray();
	char[] x1=new char[7];
	boolean a1=true;
	public void funWord() {
		
		for(int i=0;i<x.length;i++) {
			if((x[i]<=122) && (x[i]>=97) ) {
				x[i]=(char)(x[i]-32);  }}

		for(int i=0;i<x.length;i++) 
			System.out.print(x[i]+" ");
		System.out.println();
		
		for(int i=0;i<y.length;i++) {
			if((y[i]<=122) && (y[i]>=97) ) {
				y[i]=(char)(y[i]-32);  }}
	
		for(int i=0;i<y.length;i++) 
			System.out.print(y[i]+" ");
		System.out.println();	
	}
	
	public void sortWord() {
		for(int j=0;j<x.length;j++) {
			for(int i=1;i<x.length-j;i++) {
				if(x[i]<x[i-1]) {
					char a1=x[i];
				    x[i]=x[i-1];
				    x[i-1]=a1;  }}}

		for(int j=0;j<y.length;j++) {
			for(int i=1;i<y.length-j;i++) {
				if(y[i]<y[i-1]) {
					char a1=y[i];
				    y[i]=y[i-1];
				    y[i-1]=a1;  }}}

		for(int i=0;i<x.length;i++) 
			System.out.print(x[i]+" ");
		System.out.println();
		for(int i=0;i<y.length;i++) 
			System.out.print(y[i]+" ");
		System.out.println();
	}
	public void findAnagram() {
		for(int i=0;i<x.length;i++) {
				if(x[i]==y[i])
					continue;
				else 	{
					System.out.println("String is not Anagram");
					a1=false;
					break;}
			}
		if(a1==true) {
			System.out.println("String is a Anagram");
		}
	}
}
public class Assign_05 {

	public static void main(String[] args) {
		Anagram a= new Anagram();
		a.funWord();
		a.sortWord();
		a.findAnagram();
	}

}
