package Arrays;

public class ArrayWithfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {12,45,67,2,2,78,10};
		int [] c= {1,2,3,4};
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		    System.out.println(sum);
		
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}		
		}
		System.out.println(max);
		
		int min =a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}System.out.println(min);
		
		int []b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+ " ");

		}

	}

}
