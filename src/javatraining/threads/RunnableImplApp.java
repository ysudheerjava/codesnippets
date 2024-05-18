package javatraining.threads;

public class RunnableImplApp {

	public static void main(String[] args) {
		System.out.println("Welcome"); 
		RunnableImpl ri = new RunnableImpl();
		Thread t = new Thread(ri);
		System.out.println("Thread starting");
		t.start();
		for(int c =0; c<10; c++) {
			System.out.println("Main Thread "+c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("End of main()");
		
	}

}
