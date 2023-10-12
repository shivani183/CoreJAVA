package LambdaExp;
@FunctionalInterface
interface School{
	void add(int a, int b);
	
}
public class Example02 {

	public static void main(String[] args) {
		School s=(a,b)->{
			int r=a+b;
			System.out.println(r);
			
		};
		s.add(12, 14);

	}

}
