package InterviewPrograms;

class Bike{  
	  final void run(){System.out.println("running");}  
	} 
public class FinalMethodDemo extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bikeobj = new Bike();
		bikeobj.run();
	}
}