package Strings;

class Hey{
	String a,b;
	void dispaly() {
		a += "you ";
		b +=String.join("-","hi",a,"ji");
		System.out.println(b);
	}
}

public class ExerciseStringBuffer {

	public static void main(String[] args) {	
		
		StringBuffer sb = new StringBuffer ("sachin");		
		System.out.println(sb.length());		
		System.out.println(sb);
		Hey h =new Hey();
		//h.a="fit ";
		h.dispaly();
		


		
		

	
	}
}
