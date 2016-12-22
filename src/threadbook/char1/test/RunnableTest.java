package threadbook.char1.test;

import org.junit.Test;

import threadbook.char1.MyRunnable;

public class RunnableTest {
	@Test
	public void TestMyRunnable(){
		Runnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("运行结束.....");
	}

}
