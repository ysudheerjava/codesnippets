package javatraining.threads;

public class MyThread extends Thread{
	
	public void run() {
		
		for(int c =0; c<10; c++) {
			System.out.println(c);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("End of main");
	}

}
