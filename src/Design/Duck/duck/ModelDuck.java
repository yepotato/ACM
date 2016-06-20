package Design.Duck.duck;

import Design.Duck.fly.FlyNoWay;
import Design.Duck.quack.Quack;

public class ModelDuck extends Duck{
	public ModelDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehvior(new Quack());
	}

	@Override
	public void dispaly() {
	System.out.println("model duck");
	}

}
