package Design.Duck.fly;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("cann't fly");
	}

}
