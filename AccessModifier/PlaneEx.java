package AccessModifier;

class Plane{
	public void fly() {
		System.out.println("Every plane flies.");
	}
	public void land() {
		System.out.println("plane also lands");
	}
	public void takeoff() {
		System.out.println("plane takes off as required");
	}
}
class CargoPlane extends Plane{
	public void fly() {
		System.out.println("Cargo plane fly very low");
	}
	public void carryGoods() {
		System.out.println("it carry goods");
	}
}
class PassengerPlane extends Plane{
	public void fly() {
		System.out.println("passenger plane fly in medium height");
	}
	public void carryPassenger() {
		System.out.println("It carry passenger");
	}
}

public class PlaneEx {

	public static void main(String[] args) {
		Plane s= new Plane();
		CargoPlane p = new CargoPlane();
		s.fly();
		s.land();
		s.takeoff();
		//s.carryGoods();
		p.fly();
		p.land();
		p.takeoff();
		p.carryGoods();
		


	}

}
