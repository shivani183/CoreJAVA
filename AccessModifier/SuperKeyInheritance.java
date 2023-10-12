package AccessModifier;
class Grand{
	int age =89;
}
class Parent extends Grand{
	int age= 39;
}
class Child extends Parent{
	int age =15;
	public void findAge() {
		
		System.out.println(age);
		
	}
}
public class SuperKeyInheritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.findAge();

	}

}
