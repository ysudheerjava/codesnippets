package controlflow;

/* WhileExample.java */
import java.util.*;
public class WhileExample
{
 public static void main(String []ar)
 {
  Scanner sc = new Scanner(System.in);
  int a;
  System.out.print("Enter number : ");
  a=sc.nextInt();
  int sum=0;
  while(a>0)
  {
   sum=sum+a;
   System.out.print("Enter number : ");
   a=sc.nextInt();
  }
  System.out.println("Sum : "+sum);
  System.out.println("Thankyou");
 }
}

