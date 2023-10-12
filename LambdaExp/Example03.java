package LambdaExp;

interface Page{
	void add(int a,int b);
	int sun(int x, int y);
	
}

/*
 * class Page implements Books{ public void add(int a,int b) {
 * System.out.println("name"); } public int sun(int x,int y) { return x; } }
 */
public class Example03 {

	public static void main(String[] args) {
		Page p = new Page(){
			
			public void add(int a, int b) {
				int r=a+b;
				System.out.println(r);
				//System.out.println("shivani");				
			}
	
			public int sun(int x, int y) {
				int s=x-y;
				//System.out.println("singh");	
				System.out.println(s);
				return 0;
			}
		};
		p.add(11,22);
		p.sun(100,99);

	}

}
