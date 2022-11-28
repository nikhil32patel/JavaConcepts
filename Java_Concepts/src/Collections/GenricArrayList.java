package Collections;

import java.util.ArrayList;

public class GenricArrayList {

	public static void main(String[] args) {
		
		ArrayList <String> marksheet = new ArrayList<String>();
		ArrayList <String> rollno = new ArrayList<String>();
		marksheet.add("100");
		rollno.add("100");

		System.out.println(marksheet.contains(rollno.get(0)));
		
		
	}

}
