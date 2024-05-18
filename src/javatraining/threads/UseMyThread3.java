package javatraining.threads;
// UseMyThread3.java
public class UseMyThread3
{
 public static void main(String []ar)
 {
  MyThread3 ch1 = new MyThread3("child1",500);
  MyThread3 ch2 = new MyThread3("child2",800);
  try
  {
   ch1.t.join();
   ch2.t.join();
  }
  catch(Exception e)
  {
   e.printStackTrace();
  }
  System.out.println("End of main thread");
 }
}
