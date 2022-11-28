package Collections;

import java.util.ArrayList;

public class VirtualCapacityArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WHEN WE CREATE ARRAY LIST OBJECT THEN BY DEFAULT VC (VIRTUAL CAPACITY) OF ARRAY LIST IS 10 --Alwayes remember
		// WHEN THERE IS NO DATA PRSENTS IN ARRY LIST THEN IT'S PC (PHASICAL CAPACITY) OF ARRAY LIST IS 0
		ArrayList<Object> ar = new ArrayList<Object>(20);
		System.out.println(ar.size()); // PC IS 0
		
		ar.add(100);//0
		
		System.out.println(ar.size()); // PC IS 1
		ar.add(200);//0
		ar.add(300);//0
		ar.add(400);//0
	}

}
