package new1;
@FunctionalInterface
interface Face{
	public void m1(int x);
}
class Help{	
	public void m2(int x) {
		System.out.println(x*x);
		System.out.println("method refence");
	}
}
public class Launch2 {

	public static void main(String[] args) {
		Face f= new Help()::m2;
		f.m1(10);
		
//		Face f2= s->System.out.println("By Lambda exp");
//		f2.m1(1);

	}

}
