package Wrapper_class;

public class Ex_XXXValue {

	public static void main(String[] args) {
		Integer num=new Integer(20);
		System.out.println(num.intValue());
		System.out.println(num.longValue());
		System.out.println(num.shortValue());
		System.out.println(num.byteValue());
		Character c = new Character('e');
		System.out.println(c.charValue());
		Boolean b = new Boolean("ask");
		System.out.println(b.booleanValue());
	}

}
