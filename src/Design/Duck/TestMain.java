package Design.Duck;

import Design.Duck.duck.Duck;
import Design.Duck.duck.MallardDuck;
import Design.Duck.duck.ModelDuck;
import Design.Duck.fly.FlyRocketPowered;

public class TestMain {
	public static void main(String[] args){
		Duck duck = new MallardDuck();
		duck.dispaly();
		duck.performFly();
		duck.performQuack();
		Duck model = new ModelDuck();
		model.dispaly();
		
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.performQuack();
	}

}
