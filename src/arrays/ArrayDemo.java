package arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		//Declaration and definition of int Array of size 5
		
		int var1 =10;
		int var2 =20;
		int var3 =40;
		int var4=40;
		int var5 = 50;
		
		int intArray[] = new int[5];
		
		intArray[0]=10;
		intArray[1]=20;
		intArray[2]=34;
		intArray[3]=87;
		intArray[4]=87;
	
		
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		System.out.println("No. of elements in array: "+intArray.length);
		
		for(int i =0; i<intArray.length; i++) 
			System.out.println(intArray[i]);
			
		
		
		
		
	
		
		
		
		
		
	}

}
