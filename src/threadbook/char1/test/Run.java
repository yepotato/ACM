package threadbook.char1.test;

import org.junit.Test;

import threadbook.char1.MyThread;

public class Run {

	public static void main(String[] args) {
		for (int i = 0; i <1; i++) {
			MyThread thread = new MyThread();
			thread.start();
			thread.start();
			System.out.println(i+"进程结束，it's over！");
		}
		
	}
	@Test
	public void test(){
		
	}

}
