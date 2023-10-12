package Arrays;

import java.util.Scanner;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= new int [4];
		Scanner scan= new Scanner(System.in);
		
		for(int i=0;i<ar.length;i++) {
		    System.out.println("please enter array data "+ (i+1));
		    ar[i]=scan.nextInt();
		}
		System.out.println("please enter key");
	    int key=scan.nextInt();
		
		int low=0;
		int high=ar.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(ar[mid]==key) {
				System.out.println(key +" found at "+ mid);
				break;
			}
			else if(key<ar[mid]){
				high=mid-1;
				}
			else if(key>ar[mid]){
				low=mid+1;
				}			
		}
		if(low>high) {
			System.out.println("key not found");
		}

	}

}
