package AssignmrntForJAvaCourse;
class Pangram1{
	
	String wr="The five boxing wizards jump quickly";
	
	String r=wr.replace(" ", "");
	
	char[] ar= r.toCharArray();
	int[] x=new int[26];
	
	public void sort() {
		for(int j=0;j<ar.length;j++) {
			for(int i=1;i<ar.length-j;i++) {
				if(ar[i]<ar[i-1]) {
					char a1=ar[i];
					ar[i]=ar[i-1];
					ar[i-1]=a1;  }}}
	}
	public void toUpper() {
		for(int i=0;i<ar.length;i++) {
			if((ar[i]<=122) && (ar[i]>=97) ) {
				ar[i]=(char)(ar[i]-32);  }}
	}
	
	public void fillXWithOne() {
		for(int a:ar) {
			int index=a-65;
			x[index]++;
		}
	}
	public void checkPangram() {
		boolean flag=false;
		for(int i =0;i<x.length;i++) {
			if(x[i]==0) {
			System.out.println("It is not Pangram");
			flag=true;
			break;}
		}if(flag==false)
			System.out.println("It is a pangram");
	}
}

public class Assign_06 {

	public static void main(String[] args) {
		Pangram1 p= new Pangram1();
		p.sort();
		p.toUpper();
		p.fillXWithOne();
		p.checkPangram();

	}

}
