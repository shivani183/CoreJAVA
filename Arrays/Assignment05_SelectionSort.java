package Arrays;


public class Assignment05_SelectionSort {	
	void selectionSort(int arr[])
	 {
	     int n = arr.length;
	     for (int i = 0; i < n-1; i++)
	     {
	         for (int j = i+1; j < n; j++) {
	             if (arr[j] < arr[i]) {
	                 int temp = arr[i];
	                 arr[i]=arr[j];
	                 arr[j]=temp;}
	                 
	             }
	     }
	 }

	public static void main(String[] args) {
		
	     Assignment05_SelectionSort ob = new Assignment05_SelectionSort();
	     
	     int arr[] = {64,25,12,22,11};
	     
	     ob.selectionSort(arr);
	     
	     System.out.print("Sorted array is -- ");
	     
	     for (int i=0; i<arr.length; ++i)
	         System.out.print(arr[i]+" ");
	     System.out.println();
	}

}
