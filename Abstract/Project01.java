package Abstract;

import java.util.Scanner;
abstract class Shapes{
	double area;
	final double pi=3.14;
	abstract public void input();
	abstract public void compute();
	public void restult() {
		System.out.println( "The area is "+ area);
	}
}

class Rectangle extends Shapes{
	double length;
	double breadth;
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter length of retangle");
		length= scan.nextDouble();
		System.out.println("please enter breadth of retangle");
		breadth= scan.nextDouble();
	}
	public void compute() {
		area=length*breadth;
	}
	
}class Square extends Shapes{
	double length;
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter length of square");
		length= scan.nextDouble();

	}
	public void compute() {
		area=length*length;
	}
}
class Circle extends Shapes{
	double radius;
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter radius of circle");
		radius= scan.nextDouble();

	}
	public void compute() {
		area=pi*radius*radius;
	}
}
class Hshape{
	public void show(Shapes s) {
		s.input();
		s.compute();
		s.restult();
	}
}
public class Project01 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Square a = new Square();
		Circle c =new Circle();
		Hshape h= new Hshape();
		h.show(a);
		h.show(c);
		h.show(r);

	}

}
