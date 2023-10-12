package AssignmrntForJAvaCourse;

class SpecialChar
{
	boolean flag=true;
	String xx="@#$%@&*()!";
	char[] ab =xx.toCharArray();
	int[] bb = new int[xx.length()];
	
	public void checkSpecialChar() {
		for(int i=0;i<ab.length;i++) {
			if(ab[i]>=65 && ab[i]<=122 || ab[i]>=48 && ab[i]<=57 ) {
				int index=i;
				bb[index]++;				
			}
		}		
	}
	public void result() {
		for(int i:bb) {
			if(i==1) {
				System.out.println("String do not have all Special Char");
				flag=false;
				break;
			}
		}if(flag==true) {
			System.out.println("String has all Special Char");
		}
	}	
}
public class Assign_07 {

	public static void main(String[] args) {
		SpecialChar sc = new SpecialChar();
		sc.checkSpecialChar();
		sc.result();		
	}
}
