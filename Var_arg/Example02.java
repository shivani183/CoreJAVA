package Var_arg;
class Demo2{
	public void ask2(int...y) {
		int total=0;
		for(int i = 0;i<y.length;i++) {
		  	total+=y[i];}
//		for(int ele:y) {
//		  	total+=ele;}
		System.out.println("sum is "+total);
	}
}
public class Example02 {

	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		d2.ask2();
		d2.ask2(12);
		d2.ask2(13,24);
		d2.ask2(14,445);

	}

}
