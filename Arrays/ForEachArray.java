package Arrays;

public class ForEachArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [][][]= {{{10,20}, {11,12,13},{1,3,4}},
				{{13,14},{15,18}},
				{{56,23,12,11},{34,45,6}}};
		for(int ar [][]:a) {
			for(int arr[]:ar) {
				for(int x:arr) {
					System.out.print(x +" ");
				}
				System.out.println();
				
			}
		}
		System.out.println(a.getClass().getName());
		


	}

}
