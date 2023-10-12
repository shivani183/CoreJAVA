package Arrays;

public class Assignment04_MergeSort {
	public static void merge(int[] l_arr,int[] r_arr, int[] arr,int l_size, int r_size){
	      
	      int i=0,l=0,r = 0;

	      while(l<l_size && r<r_size){
	          
	          if(l_arr[l]<r_arr[r]){
	              arr[i++] = l_arr[l++];
	          }
	          else{
	              arr[i++] = r_arr[r++];
	          }
	      }
	      while(l<l_size){
	          arr[i++] = l_arr[l++];
	      }
	      while(r<r_size){
	        arr[i++] = r_arr[r++];
	      }
	  }
	public static void mergeSort(int [] arr, int len){
	      if (len < 2)
	      {return;
	      }
	      
	      int mid = len / 2;
	      int [] l_arr = new int[mid];
	      int [] r_arr = new int[len-mid];
	      
	      int k = 0;
	      for(int i = 0;i<len;++i){
	          if(i<mid){
	              l_arr[i] = arr[i];
	          }
	          else{
	              r_arr[k] = arr[i];              
	              k = k+1;
	          }
	      }
	      mergeSort(l_arr,mid);
	      mergeSort(r_arr,len-mid);

	      merge(l_arr,r_arr,arr,mid,len-mid);
	  }

	public static void main(String[] args) {

		int [] array = {12,1,10,50,5,15,45};
		
        mergeSort(array,array.length);
        
        for(int i =0; i< array.length;++i){
            System.out.print(array[i]+ " ");
        }
		 
		 

	}

}
