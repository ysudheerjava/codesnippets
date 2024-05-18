package encapsulation;

public class ThisMan {
	
	int age; 
	String name;
	
	public ThisMan getThisMan(ThisMan thisMan) {
		thisMan.age=10;
		return this; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ThisMan thisMan;
		ThisMan thisMan = new ThisMan();
	//	System.out.println(thisMan.getThisMan().age);

	}

}
