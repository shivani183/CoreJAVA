package AutoBoxing_Unboxing;

public class Example4 {

	public static void main(String[] args) {
		Integer i=10;
		Integer j=i;
		i++;
		System.out.println(i);
		System.out.println(j);
		System.out.println(i==j);
		System.out.println();
		Integer a= new Integer(100);
		Integer b=new Integer(100);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
	}

}
