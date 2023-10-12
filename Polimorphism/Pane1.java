package Polimorphism;
class Plane{
	public void fly() {
		System.out.println("all fly");
	}
	public void takeOff() {
		System.out.println("all takeoff");
	}
	public void land() {
		System.out.println("all land");
	}
}
class cargoPlane extends Plane{
	public void fly() {
		System.out.println("cargo fly");
	}
}
class passenPlane extends Plane{
	public void fly() {
		System.out.println("Passen fly");
	}
}
class airport{
	public void call(Plane plane) {
		plane.fly();
		plane.land();
		plane.takeOff();
	}
}
public class Pane1 {

	public static void main(String[] args) {
		cargoPlane cp = new cargoPlane();
		passenPlane pp = new passenPlane();
		airport a= new airport();
		a.call(cp);
		a.call(pp);

	}

}
