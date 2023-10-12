package Arrays;
import java.util.*;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any numb");
		
		int key = scan.nextInt();
		
		int [] ar= {10,30,21,34,45,10};
		boolean x= false;
		
		for(int i=0;i<ar.length;i++) {
			if(key==ar[i]) {
				System.out.println("key found at "+ i);
				x=true;
				break;
			}
		}
		if(x==false)
		   System.out.println("key not found");
		

		
		

	}

}
