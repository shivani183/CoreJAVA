package Arrays;

public class Assignment06_SubsetArray {
	
	void subsetArray(int []ar1,int []ar2, int a,int b) {
		boolean flag=true;
		int j=0;		
		for(int i=0;i<b;i++) {
			for(j=0;j<a;j++) {
				if(ar2[i]==ar1[j]) {
					break;}
				}if(j==a) {
					flag=false;
					System.out.println("No ar2 is not a subset of ar1.");
					break;}
		}
		if(flag==true)
		    System.out.println("Yes! ar2 is subset of ar1.");
	}
	
	

	public static void main(String[] args) {
		
		int []ar1= {10,70,40,23,65,34};
		int[] ar2= {34,23,23,10,40};		
		int a= ar1.length;
		int b =ar2.length;
		
		Assignment06_SubsetArray obj =new Assignment06_SubsetArray();
		obj.subsetArray(ar1, ar2, a, b);
		
		

		
	}

}


