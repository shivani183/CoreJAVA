package Thread_Class;
class Ssleep extends Thread{
	public void run() {
		for (int i=1;i<=5 ;i++ ){
            System.out.println("child Thread");
            try{
                  Thread.sleep(2000);
            }
            catch (InterruptedException e){
} }
	}
}
public class Sleep_exp2 {

	public static void main(String[] args) {
		Ssleep s = new Ssleep();
		s.start();
		for(int x=0;x<5;x++) {
			System.out.println("parent class");
		}

	}

}
