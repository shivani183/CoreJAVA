package Var_arg;
class Demo{
	public void ask(int... a) {
		System.out.println("VAr-arg method activated");
	}
}
public class Example01 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.ask();
		d.ask(12);
		d.ask(12,23);
		d.ask(14,14,15);
	}

}
