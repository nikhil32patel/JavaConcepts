package AbstractionConcepts;

public class TestBank {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HdfcBank hb = new HdfcBank();
		
		hb.credit(); // INHERITED METHODS
		hb.debit(); // INHERITED METHODS
		hb.loan(); // OVERRIDE METHOD
		hb.funds(); // OWN CLASS MEHOD NON OVERRIEDN METHOD
		
		Bank b = new HdfcBank();
		b.loan();
		b.credit();
		b.debit();
		
	}

}
