package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
	
		ArrayList<String> studentlist = new ArrayList<String>();
		studentlist.add("Nikhil");
		studentlist.add("Disha");
		studentlist.add("Gaurav");
		studentlist.add("Niraj");
		
		// GET DATA USING TYPICAL FOR LOOP
		for(int i =0;i<studentlist.size();i++)
		{
			System.out.println("List of Students Using For loop:"+studentlist.get(i));
		}
		System.out.println("");
		
		// GET DATA USING FOR EACH LOOP
		for (String s: studentlist) {
			
			System.out.println("List of Students Using For Each loop:"+s);
		}
		System.out.println("");
		
		// JDK 8 we can use lambda: JAVA streams with lambda:
		studentlist.stream().forEach(elelm->System.out.println("List of Students Using For Each loop Lambda:"+elelm));
		System.out.println("");
		
		//Iterator : Iterator is interface which is used to iterate values form collection
		Iterator <String> it = studentlist.iterator();
		while(it.hasNext()) 
		{ 
			System.out.println("List of Students Using Iterator Interface:"+it.next()); 
			
		}
		
		// List with other collection
		ArrayList<Integer> numberlist = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		System.out.println(numberlist);
	}
}
