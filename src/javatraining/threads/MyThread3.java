package javatraining.threads;
public class MyThread3 implements Runnable
{
 Thread t;
 int st;
 public MyThread3(String n,int s)
 {
  t=new Thread(this,n);
  st=s;
  t.start();
 }
 public void run()
 {
  for(int c=0;c<10;c++)
  {
   try
   {
	    Thread.sleep(st);
	   }
	   catch(Exception e)
	   {
	    e.printStackTrace();
	   }
	   System.out.println(t.getName()+" : "+c);
	  }
	  System.out.println("End of : "+t.getName()+" thread");
	 }
	}
