package InterviewPrograms;

public class SwipeTwoNoWithoutTempV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 525;
		int y = 625;

		// Code to swap 'x' and 'y'
		x = x * y; // x now becomes 50
		y = x / y; // y becomes 10
		x = x / y; // x becomes 5

		System.out.println("After swaping:"
				+ " x = " + x + ", y = " + y);
	}

}
