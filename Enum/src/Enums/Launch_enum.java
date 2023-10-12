package Enums;

enum Days{
	SUN, MON, TUE, WED, THUR, FRI, SAT;
	
	Days() {
		//System.out.println("here's the constructor");
	}
}

public class Launch_enum {

	public static void main(String[] args) {
		Days d=Days.SUN;
		System.out.println(d);
		
		int num=Days.FRI.ordinal();
		System.out.println(num);
		
		Days[] di=Days.values();
		for(Days x:di) {
			System.out.println(x.ordinal() + " : " +x.name());
		}

	}

}
