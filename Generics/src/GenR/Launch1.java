package GenR;
class Gen<SR>{
	SR obj;
	
	Gen(SR obj) {
		 this.obj=obj;
	}
	public void show() {
		System.out.println("Name of obj : "+ obj.getClass().getName());
	}
	public SR getObject() {
		return obj;
	}	
}
public class Launch1 {
	public static void main(String[] args) {
		Gen<Integer> g1=new Gen<Integer>(10);
		g1.show();
		System.out.println(g1.getObject());
		
		Gen<Double> g2=new Gen<Double>(400.3);
		g2.show();
		System.out.println(g2.getObject());
		
		Gen<String> g3=new Gen<String>("Dhoni");
		g3.show();
		System.out.println(g3.getObject());
		

	}

}
