package Arrays;

import java.util.Scanner;

public class OneDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a =new int[5];
		Scanner scan =new Scanner(System.in);
		for (int i=0; i<5;i++) {
			System.out.println("Add marks of student" +(i+1));
	        a[i]=scan.nextInt();}
	        
		 
		 
		 for (int i=0; i<5; i++) {
		 System.out.print(a[i]+ " ");
		 }
		

	}

}
