package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList <String> ar1 = new ArrayList<String>();
		ar1.add("Java");
		ar1.add("Paython");
		ar1.add("Ruby");
		ar1.add("Javascript");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("Dev ops");
		
		
		// IN PUT
		/*
		 * ar1.addAll(ar2);
		 * 
		 * System.out.println(ar1); ar1.addAll(2,ar1); System.out.println(ar1);
		 */
		
		//Out Put
		/*
		 *[Java, Paython, Ruby, Javascript, Testing, Dev ops]
		  [Java, Paython, Java, Paython, Ruby, Javascript, Testing, Dev ops, Ruby, Javascript, Testing, Dev ops] 
		 * 
		 */
		
		
		ArrayList<String> clonear = (ArrayList<String>)ar1.clone();
		System.out.println(clonear);
		
		System.out.println(ar1.contains("Paython"));
		System.out.println(ar1.contains("c++"));
		
		System.out.println(ar1.indexOf("Ruby")>0);
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("N1","B1","N1","D1","C1","N1"));
		System.out.println(list1);
		int i= list1.lastIndexOf("N1");
		System.out.println(i);
		
		list1.remove(1);
		System.out.println(list1);
		
		list1.remove("N1");
		System.out.println(list1);
		
		//Famous Interview Question remove even numbers and print just 
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(number ->number%2 == 0); // removes even numbers 
		System.out.println(numbers);
		
		ArrayList<String> namelist = new ArrayList<String>(Arrays.asList("N1","B1","N1","D1","C1","N1"));
		namelist.retainAll(Collections.singleton("N1"));
		System.out.println(namelist);
		
		ArrayList<Integer> mainlist = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ArrayList<Integer> sublist = new ArrayList<Integer>(mainlist.subList(1,5));
		System.out.println(sublist);
		
		
	}

}
