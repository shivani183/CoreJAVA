package new1;
class ABP{
	public static void m1() {
		for(int i=0;i<6;i++) {
			System.out.println("Child Thread");
		}
	}
}


public class Launch_1 {
	
//	public void a2(int s) {
//		System.out.println(s*s);
//		System.out.println("method refrence");
//	}

	public static void main(String[] args)throws Exception {
		Runnable r= ABP::m1;
		Thread t = new Thread(r);
		t.start();
		
		for(int a=0;a<5;a++) {
			System.out.println("Parent thread");
			Thread.sleep(1000);
		}
		System.out.println("hi");

		
		

	}

}
