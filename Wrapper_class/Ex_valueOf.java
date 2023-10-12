package Wrapper_class;

public class Ex_valueOf {

	public static void main(String[] args) {
		
		Integer x = Integer.valueOf("10",2);
		Integer x1 = Integer.valueOf("12",8);
		Integer x2 = Integer.valueOf("1013",10);
		Integer x3 = Integer.valueOf("1013",16);
		Short s =Short.valueOf((short) 30);
		Integer i =Integer.valueOf(667);
		Double d = Double.valueOf(22.3);
		Double d1 = Double.valueOf("12.2");
		Boolean b = Boolean.valueOf("TRUE");
		Boolean b1 = Boolean.valueOf("hello");
		Character c =Character.valueOf('s');
		System.out.println(c);

		System.out.println(b);
		System.out.println(b1);
		System.out.println(s);
		System.out.println(i);
		System.out.println(x);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(d);
		System.out.println(d1);		
	}

}
