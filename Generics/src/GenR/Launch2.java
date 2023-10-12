package GenR;
class Fan<A extends Number>{
	A fun;
	public void show() {
		System.out.println("name : "+ fun.getClass().getName());
	}
	public A getfun() {
		return fun;
	}
	Fan(A fun){
		this.fun=fun;
	}
}
public class Launch2 {

	public static void main(String[] args) {
		Fan<Integer> f= new Fan<Integer>(10);
		f.show();
		System.out.println(f.getfun());
		//Fan<String> f2= new Fan<String>("name");

	}

}
