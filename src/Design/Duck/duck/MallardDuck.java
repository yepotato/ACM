package Design.Duck.duck;

import Design.Duck.fly.FlyWithWings;
import Design.Duck.quack.Quack;

public class MallardDuck extends Duck {
	 public MallardDuck() {
		 setFlyBehavior(new FlyWithWings());
		 setQuackBehvior(new Quack());
	}
	@Override
	public void dispaly() {
		System.out.println("Mallard Duck");
	}
	
}
