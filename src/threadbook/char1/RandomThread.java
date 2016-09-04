package threadbook.char1;

public class RandomThread extends Thread {
	@Override
	public void run() {
		try{
			for(int i=0;i<10;i++){
				int time= (int)(Math.random()*1000);
				Thread.sleep(time);
				System.out.println("runing:"+Thread.currentThread().getName());
				
			}
			}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		
		
	}

}
