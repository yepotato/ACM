package Design.Duck.duck;

import Design.Duck.fly.FlyBehavior;
import Design.Duck.quack.QuackBeahvior;

public abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBeahvior quackBehvior;
	public Duck(){}
	public abstract void dispaly();
	public void performFly(){
		getFlyBehavior().fly();
	}
	public void performQuack(){
		getQuackBehvior().quack();
	}
	public void swim(){
		System.out.println("ALL Duck can swim!");
	}
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public QuackBeahvior getQuackBehvior() {
		return quackBehvior;
	}
	public void setQuackBehvior(QuackBeahvior quackBehvior) {
		this.quackBehvior = quackBehvior;
	}
}
