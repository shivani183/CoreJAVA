package Arrays;

public class Assignment02_QuickSort {
	
	int divide(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
    void sorted(int arr[], int low, int high)
    {
        if (low < high)
        {
            int d = divide(arr, low, high);

            sorted(arr, low, d-1);
            sorted(arr, d+1, high);
        }
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int arr[] = {200,102,304,500,21,65,100};
        
        System.out.print("Unsorted array is -- ");

        
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println();
 
        Assignment02_QuickSort ob = new Assignment02_QuickSort();
        
        ob.sorted(arr, 0, arr.length-1);
 
        System.out.print("new sorted array is -- ");

        
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i]+" ");

        

	}

}
