package NewCons;
class Sample{
	private String s;
	Sample(String s){
		this.s=s;
		System.out.println("from constructor "+ s);
	}
}
@FunctionalInterface
interface Insta{
	public Sample get(String s);
}
public class Launch1 {

	public static void main(String[] args) {
		Insta i =s->new Sample(s);
		i.get("shiva");
	 
	    System.out.println();
		
		Insta i1= Sample::new;
		i1.get("refence");

	}

}
