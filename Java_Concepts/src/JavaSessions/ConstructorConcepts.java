package JavaSessions;

public class ConstructorConcepts 
{
	String name;
	int age;
	public ConstructorConcepts(String name,int age){
		
		// THIS KEYWORD IS USE TO INITSLISE CLASS VARIABLES IN THE CONSTRUCTOR
		
		this.age = age;
		this.name = name;
		 
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
	public static void main(String args[])
	{
		ConstructorConcepts obj = new ConstructorConcepts("Nikhil",30);
		
	}

}
