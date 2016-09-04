package threadbook.char1.t3;

import org.junit.Test;
public class TestMyThread {
	public static void main(String[] args) {
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		a.start();
		b.start();
		c.start();
		
	}
	
	@Test
	public void TestShareThread(){
		ShareThread thread = new ShareThread();
		Thread a = new Thread(thread,"A");
		Thread b = new Thread(thread,"B");
		Thread c = new Thread(thread,"C");
		Thread d = new Thread(thread,"D");
		a.start();
		b.start();
		c.start();
		d.start();
	}

}
