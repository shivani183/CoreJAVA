package Predicate;

import java.util.function.Predicate;

/*class MyPredicate implements Predicate<Integer>{
	@Override
	public boolean test(Integer t) {
		if(t>10)
			return true;
		else
			return false;		
	}
}*/
class Temp{
	public void m1(Predicate<Integer> p,int[] x) {
		for(int ele:x)
			if(p.test(ele))
				System.out.print(ele+" ");
	}
}
public class Launch01 {
	public static void main(String[] args) {
		Temp t= new Temp();
		
		//Predicate mp1 = new MyPredicate();
		int []arr= {12,34,1,32,78,56,33,99};
		
		Predicate<Integer> mp =i->i>50;
		//System.out.println(mp.test(1));
		
		Predicate<String>m=s->s=="some";
		//System.out.println(m.test("some"));
		
		Predicate<Integer> mp1= i->i%2==0;
		
		t.m1(mp1.and(mp),arr);
		System.out.println();
		
		t.m1(mp.or(mp1) ,arr);
		System.out.println();
		
		t.m1(mp1.negate(),arr);
		System.out.println();
		
		t.m1(Predicate.not(mp1), arr);
		
		
		
		

	}

}
