package threadbook.char1.test;

import org.junit.Test;

import threadbook.char1.MyThread;
import threadbook.char1.RandomThread;
import threadbook.char1.ZMyThread;

public class Run {

//	public static void main(String[] args) {
//		for (int i = 0; i <1; i++) {
//			MyThread thread = new MyThread();
//			thread.start();
//			System.out.println(i+"进程结束，it's over！");
//		}
//		
//	}
	@Test
	public void testRandomThread(){
			try{
				RandomThread thread = new RandomThread();
				thread.setName("myThread");
				thread.start();
				for(int i=0;i<10;i++){
					int time= (int)(Math.random()*1000);
					Thread.sleep(time);
					System.out.println("main:"+Thread.currentThread().getName());
					
				}
				}catch(InterruptedException e){
				e.printStackTrace();
			}
	}
	
	@Test
	public void TestZMyThread(){
			ZMyThread tl1=new  ZMyThread(1);
			ZMyThread tl2=new  ZMyThread(2);
			ZMyThread tl3=new  ZMyThread(3);
			ZMyThread tl4=new  ZMyThread(4);
			ZMyThread tl5=new  ZMyThread(5);
			ZMyThread tl6=new  ZMyThread(6);
			ZMyThread tl7=new  ZMyThread(7);
			ZMyThread tl8=new  ZMyThread(8);
			ZMyThread tl9=new  ZMyThread(9);
			ZMyThread tl10=new  ZMyThread(10);
			tl1.start();
			tl2.start();
			tl3.start();
			tl4.start();
			tl5.start();
			tl6.start();
			tl7.start();
			tl8.start();
			tl9.start();
			tl10.start();
	}

}
