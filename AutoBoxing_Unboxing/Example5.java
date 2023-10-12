package AutoBoxing_Unboxing;

public class Example5 {

	public static void main(String[] args) {
		Integer o= new Integer(121);
		Integer d=121;  //literals
		System.out.println(o==d);
		Integer o1= new Integer(121);
		Integer d1=o1;  //refrence is used
		System.out.println(o1==d1);

	}

}
