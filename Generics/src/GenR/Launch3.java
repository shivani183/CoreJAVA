package GenR;

import java.util.ArrayList;

public class Launch3 {

	public static void main(String[] args) {
		ArrayList<Number> al = new ArrayList<Number>();
		ArrayList<?> al1 = new ArrayList<Number>();
		ArrayList<?> al2 = new ArrayList<String>();
		ArrayList<? extends Number> al3 = new ArrayList<Number>();
		//ArrayList<? extends Number> al4 = new ArrayList<String>();
		ArrayList<? extends Runnable> al5 = new ArrayList<Thread>();
		//ArrayList<? extends Number, Runnable, Comparable> al6 = new ArrayList<Number>();
		//ArrayList<? extends Runnable, Number> al7 = new ArrayList<Number>();
		//ArrayList<?> al8 = new ArrayList<?>();
		//ArrayList<? super Number> al9 = new ArrayList<Integer>();
		ArrayList<? super Number> ala = new ArrayList<Number>();
		ArrayList<? super Number> alb = new ArrayList<Object>();



	}

}
