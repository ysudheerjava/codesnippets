package javatraining.operators;
public class AssignmentOperatorsDemo {
  
	public static void main(String[] args) {
    
    // create variables
    int a = 4;
    int b;

    // assign value using =
    b = a;
    System.out.println("b using = : " + b); //b is 4

    // assign value using =+  
    b += a;  //b = b+a;
    System.out.println("b using +=: " + b);  // b is 8
    
    // assign value using =-  
    b -= a;// b = b - a;
    System.out.println("b using +=: " + b);  // b is 4
    
    //assign value using =*
    b *=a; // b = b* a;
    System.out.println("b using *= " + b); // b is 16
    
  //assign value using =/
    b /= a; // b = b / a;
    System.out.println("b using /= " + b); //4
    
  //assign value using =%
    b %= a; // b = b % a;
    System.out.println("b using /= " + b); //0
    
    
    
    
    
    
    
    
  }
}
