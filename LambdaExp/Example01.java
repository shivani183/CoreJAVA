package LambdaExp;
interface Alpha{
	void dsp();
		
	
}
public class Example01 {

	public static void main(String[] args) {
		Alpha a=()->System.out.println("hi");
		a.dsp();
	}

}
