package JavaSessions;

public class B extends A{

	public B() 
	{
		// 
		super(10); // SUPER KEYWORD IS USE TO CALL PARENT CLASS CONSTRCTOR
		//super(10); // TWO SUPER KEYWORD NOT ALLOW BECAUSE IT IS FIRST STATEMENT OF ANY CONSTRUCTOR
		System.out.println("Child class costructor");
	}
	
	public static void main(String args[])
	{
		
		B obj = new B();
		
	}
}
