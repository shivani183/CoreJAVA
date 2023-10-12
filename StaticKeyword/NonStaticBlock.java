package StaticKeyword;

class Demo3{
	int a;
	int b;
	String x;
	static int count; //one memory will be allocated
	{
		count++;      //counts no. of objects
	}
	Demo3(){
		//count++;
	}
	Demo3(String x){
		this.x=x;
		//count++;
	}Demo3(int a){
		this.a=a;
		//count++;
	}
	
}

public class NonStaticBlock {

	public static void main(String[] args) {
		Demo3 d =new Demo3();
		Demo3 d1 =new Demo3("hi");
		Demo3 d2=new Demo3(12);
		System.out.println(Demo3.count);
		System.out.println(d1.x);
		System.out.println(d2.a);
	}

}
