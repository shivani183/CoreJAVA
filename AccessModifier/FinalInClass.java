package AccessModifier;

//final class Access{
//	
//}
//class Access1 extends Access{ //final class can't be eccessed.
//	
//}

class Access{
	 int a=10;
	final void upper() {
		a=20;
		System.out.println(a);
	}
}
class Access1 extends Access{
	void upper(int x) {
		
	}
}
public class FinalInClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access s = new Access();
		s.upper();

	}

}
