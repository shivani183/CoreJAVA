package Stream;

import java.util.stream.Stream;

public class Launch6 {

	public static void main(String[] args) {
		Stream<Integer>s1=Stream.of(1,1,2,233,21,354,56765);
		s1.forEach(System.out::println);
		
		System.out.println();

		Double[] d= {12.3,23.3,33.6,98.788};
		Stream<Double> s2= Stream.of(d);
		s2.forEach(System.out::println);
	}

}
