package Arrays;

import java.util.Arrays;

public class onelinearray {
	public static void main(String[] args) {

	int[] a= {232,455,12,35,56,67};
	Arrays.sort(a);
	for(int x:a) {
		System.out.println(x);
	}
	
	int arr= Arrays.binarySearch(a, 12);
	System.out.println(arr);
	


   }
}