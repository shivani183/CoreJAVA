package AssignmrntForJAvaCourse;

class SortingDuplicates{
	String name="srinivasha";
	
	char[] ar= name.toCharArray();
	char[] ar2= new char [ar.length];
	
	void duplicates2() {
	for(int i=0;i<ar.length;i++) {
		int j;
		for(j=(1+i);j<ar.length;j++) {
			if(ar[i]==ar[j]) {
				ar2[i]=ar[j];
				break;
			}		
		}
	}
	
	for(int i =0;i<ar2.length;i++) {
		System.out.print(ar2[i]+" ");
	}
	}
	
}

public class Assign_02 {

	public static void main(String[] args) {
		SortingDuplicates s = new SortingDuplicates();
		System.out.println(s.name);
		s.duplicates2();
	}

}
