package javatraining.operators;

/*This program demonstrates the usage of Boolean operators
- Logical AND
- Logical OR
- Logical NOT*/

public class BooleanOperatorsDemo {

	public static void main(String[] args) {
 
		
		int a=5;
		int b= 10;
		int c =30;
		/*
		 * Logical AND && 
		 * Syntax: (expression1) && (expression2) 
		 * returns true only when both expressions are true
		 */
		boolean logicalANDResult = (b > a) && (c >b);
		System.out.println(logicalANDResult);

		/*
		 * Logical OR || 
		 * Syntax: (expression1) || (expression2)
		 *  returns true only when
		 * at atleast one of the expression is true
		 */

		boolean logicalORResult = (b > a) || (c >b);
		System.out.println(logicalORResult);

		/*
		 * Logical NOT - ! Syntax: !(expression1) returns true applied on a false
		 * expression, and returns false when applied on true expression
		 */

		boolean logicalNOT = !(b > a);
		System.out.println(logicalNOT);

	}

}
