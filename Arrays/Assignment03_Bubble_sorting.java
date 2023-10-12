package Arrays;

public class Assignment03_Bubble_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar []= {12,34,145,21,4};
		System.out.print(" Unsorted Array-- ");
		for(int k:ar) {
			System.out.print(k+" ");}
		
		System.out.println();
		System.out.println();

		
		for(int i=0;i<ar.length;i++) {
			for(int j=1;j<ar.length-i;j++) {
				if(ar[j]<ar[j-1]) {
					int x=ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=x;
				}
			}
		}
		System.out.print("Sorted Array -- ");
		for(int i:ar) {
			System.out.print(i+" ");
		}

	}

}
