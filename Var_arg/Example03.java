package Var_arg;
class xyz{
	public void ele(int[]...war) {
		for(int[] s:war)
			for(int a:s) {
				System.out.println(a);				
			}		
	}
}
public class Example03 {

	public static void main(String[] args) {
		xyz a1= new xyz();
		int a[]= {10,20,30};
		int b[]= {22,33};
		a1.ele(a,b);
	}

}
