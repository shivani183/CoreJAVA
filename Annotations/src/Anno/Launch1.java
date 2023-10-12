package Anno;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@interface Animal{
	String tail() default("one");
	int horn() default(2);	
}
//@Animal(tail="one",horn=2)
@Animal
class Lion{
	int leg;
	String eat;
	
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public String getEat() {
		return eat;
	}
	public void setEat(String eat) {
		this.eat = eat;
	}	
}
public class Launch1 {
	public static void main(String[] args) {
		Lion l = new Lion();
		l.setEat("meat");
		l.setLeg(4);
		System.out.println(l.getEat());
		System.out.println(l.getLeg());
		
	    Class cl=l.getClass();
	    Annotation an=cl.getAnnotation(Animal.class);
	    Animal ani=(Animal)an;
	    System.out.println(ani.tail());
	    System.out.println(ani.horn());

	}

}
