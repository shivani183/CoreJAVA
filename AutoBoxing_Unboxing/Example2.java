package AutoBoxing_Unboxing;

public class Example2 {
	static Integer i1= 10; //Autoboxing
	static int i2=i1;      //Autounboxing
	
	public void sum(Integer i3) {
		int i4=i3;
		System.out.println(i4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 ex= new Example2();
		ex.sum(i2);

	}

}
