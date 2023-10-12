package Interfaces;

interface X1{
	int config=10;
}
interface Y1{
	int config = 20;
}
public class Example8 implements X1,Y1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Y1.config);
		System.out.println(X1.config);

	}

}
