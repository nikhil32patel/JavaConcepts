package InterviewPrograms;


//Java program to demonstrate encapsulation
class Encapsulate {
	
	// private variables declared
	// these can only be accessed by
	// public methods of class
	private String stdName;
	private int stdRoll;
	private int stdAge;
	public String publicname;

	
	// get method for age to access
	// private variable geekAge
	public int getAge() { return stdAge; }

	// get method for name to access
	// private variable geekName
	public String getName() { return stdName; }

	// get method for roll to access
	// private variable geekRoll
	public int getRoll() { return stdRoll; }

	// set method for age to access
	// private variable geekage
	public void setAge(int newAge) { stdAge = newAge; }

	// set method for name to access
	// private variable geekName
	public void setName(String newName)
	{
		stdName = newName;
	}

	// set method for roll to access
	// private variable geekRoll
	public void setRoll(int newRoll) { stdRoll = newRoll; }
}
public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulate obj = new Encapsulate();

		// setting values of the variables
		obj.setName("Harsh");
		obj.setAge(19);
		obj.setRoll(51);
		
			
		// Displaying values of the variables
		System.out.println("Geek's name: " + obj.getName());
		System.out.println("Geek's age: " + obj.getAge());
		System.out.println("Geek's roll: " + obj.getRoll());

		// Direct access of geekRoll is not possible
		// due to encapsulation
		//System.out.println("Geek's roll: " +obj.geekName);
	}

}
