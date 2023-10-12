package Immutable_userdefined_class;

public class Example01 {
	int i;
	Example01(int i){
		this.i=i;
	}
	public Example01 modify(int i) {
		if(this.i==i) {
			return this;
		}
		else
			return new Example01(i);
	}

	public static void main(String[] args) {
		Example01 e1=new Example01(10);
		Example01 e2 =e1.modify(10);
		Example01 e3 = new Example01(100);
		Example01 e4 = e3.modify(100);
		System.out.println(e1==e2);
		System.out.println(e1==e3);
		System.out.println(e2==e3);
		System.out.println(e3==e4);
	}

}
