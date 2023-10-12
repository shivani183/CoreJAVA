package Arrays;

import java.util.Scanner;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan =new Scanner(System.in);
		int [][] ar= new int[3][];
		ar[0]= new int[2];
		ar[1]= new int[3];
		ar[2]= new int[4];
				
		for (int i=0; i<ar.length;i++) {
			for (int j=0;j<ar[i].length;j++) {
				System.out.println("Please enter class " + (i+1)+ " and student " +(j+1));
			    ar[i][j]=scan.nextInt();
			    }
		
			}
		System.out.println("Two D arrays are");
		for(int i=0;i<ar.length;i++) {
			for(int j =0;j<ar[i].length;j++) {
				System.out.print(ar[i][j] +" ");
			}
			System.out.println();
		}
	}

}
