import org.jrue.duckbehavior.FlyWithRocket;
import org.jrue.duckbehavior.FlyWithWings;
import org.jrue.ducks.Duck;
import org.jrue.ducks.RubberDucky;


public class Main {

	public static void main(String[] args) {
		Duck duck = new RubberDucky();
		duck.doFly();
		duck.doQuack();
		duck.setFlyBehavior(new FlyWithRocket());
		duck.doFly();
		duck.setFlyBehavior(new FlyWithWings());
		duck.doFly();
	}	
}
