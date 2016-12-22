package threadbook.char1;

public class ZMyThread extends Thread {
	private int i;
	public ZMyThread(int i){
		super();
		this.i=i;
	}
	@Override
	public void run() {
		System.out.println(i);
	}

}
