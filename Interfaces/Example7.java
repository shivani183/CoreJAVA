package Interfaces;
interface A4{
	
}
interface B4{
	
}
interface C4 extends A4,B4{
	int no1=120;     //instance variable
}
public class Example7 implements C4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//no1=12;    compile time error
		int no1=123;   //local variable
		System.out.println(no1); //C4 not required because class is implementing
		System.out.println(C4.no1);

	}

}
