package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arraylist is default class available in java
		// And it is behave like a array
		
		// In collection ArrayList is Class
		ArrayList<Object> arlobj = new ArrayList<Object>();
		arlobj.add("100");//0
		arlobj.add("hii");//1
		arlobj.add("Test");//2
		arlobj.add(true);//3
		arlobj.add(12.33);//4
		
		System.out.println("Low Index :"+ 0);
		System.out.println("High Index :"+ arlobj.size());
		
		arlobj.add("bye");//5
		arlobj.add("go");//6
		arlobj.set(4, 12.44);
		
		
		ArrayList<Object> arlobjclone =  (ArrayList<Object>) arlobj.clone();
		
		
		
		System.out.println("High Index After adding elemetns :"+ arlobj.size());
		System.out.println(arlobj.toString());
	    System.out.println(arlobjclone.toString());
		// So ArrayList are daynamic in nature we can increase size of araylist
	}

}
