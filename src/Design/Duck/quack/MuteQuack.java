package Design.Duck.quack;

public class MuteQuack implements QuackBeahvior {

	@Override
	public void quack() {
		System.out.println("MuteQuack");
	}

}
