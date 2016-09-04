package threadbook.char1;

public class MyThread extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println("this is MyThread....");
	}
}