package Arrays;

import java.util.Scanner;

public class ThreeDJaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int marks [][][]=new int [2][][];
		marks [0]=new int[2][];
		marks [0][0]=new int[3];
		marks [0][1]=new int[2];
		marks [1]=new int[3][];
		marks [1][0]=new int[2];
		marks [1][1]=new int[3];
		marks [1][2]=new int[4];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				for (int k=0;k<marks[i][j].length;k++) {
					System.out.println("Kindly enter marks of college "+(i+1)+
							" class "+(j+1)+" Student "+(k+1));
					marks[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("Number sheets are as follows");
		for (int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				for (int k=0;k<marks[i][j].length;k++) {
					System.out.print(marks[i][j][k]+ " ");
				}
				System.out.println();
			}
		}		
	}

}
