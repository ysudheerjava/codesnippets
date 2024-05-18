package controlflow;

public class SwitchExample
{
 public static void main(String []ar)
 {
  char cvar='w';
  
  switch(cvar)
  {
  case 'x':
	  System.out.println("Some color");
	  break;
   case 'r' :
     System.out.println("RED");
     break;
   case 'g' :
     System.out.println("GREEN");
     break;
   case 'b' :
     System.out.println("BLUE");
     break;
   default :
     System.out.println("Choice is out of range");
  }
  System.out.println("Thankyou, end of the program");
 }
}

