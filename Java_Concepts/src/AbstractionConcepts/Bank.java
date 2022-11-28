package AbstractionConcepts;

public abstract class Bank 
{
	int amt = 100;
	final int rate = 10;
	static int loanrate = 5;
	// PARTIAL ABSTRACTION 
	// HIDING THE IMPLEMETATION LOGIC--is Called Abstraction.
	// ABSTRACT CLASS HAVE ABSTRACT METHODS AND NON-ABSTRACT METHODS
	// WE CAN NOT CREATE OBJECT OF ABSTRACT CLASS
	
	public abstract void loan(); // abstract method no method body
	
	public void credit(){
	
		System.out.println("Bank----Credit");
	}
	
	public void debit(){
		
		System.out.println("Bank----Debit");
		
	}
	
	
	
}
