package Collections;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo 
{
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		//Create Empty linked list to store strings
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("America");
		ll.add("India");
		ll.add("Japan");
		
		//DISPLAY THE ELEMENTS IN THE LINKED LIST
		System.out.println("List ="+ ll);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String element;
		int position,choice=0;
		
		//MENU
		while(choice <4)
		{
			System.out.println("\n LINKEDLIST OPERATION");
			
			System.out.println("1 ADD AN ELEMENT");
			System.out.println("2 REMOVE AN ELEMENT");
			System.out.println("3 CHANGE AN ELEMENT");
			System.out.println("4 EXIT");
			
			System.out.print("Your Choice : ");
			choice = Integer.parseInt(br.readLine());
			
			//PERFORM A TASK DEPENDING ON USER CHOICE
			switch(choice)
			{
				case 1: 
					
					System.out.print("Enter Element: ");
					element = br.readLine();
					System.out.println(" AT WHAT POSITION ?");
					position = Integer.parseInt(br.readLine());
					ll.add(position - 1, element);
					
					break;
					
				case 2:
					
					System.out.print("Enter Position:");
					position = Integer.parseInt(br.readLine());
					ll.remove(position - 1);
					
					break;
					
				case 3:
					
					System.out.print("Enter Position:");
					position = Integer.parseInt(br.readLine());
					System.out.print("Enter New Element:");
					element = br.readLine();
					ll.set(position - 1,element);
					
					break;
					
				default:
						
						return;
					
			}// SWITCH END
			
			// USE ITERATOR TO RETRIEVE THE ELEMENTS
			Iterator it = ll.iterator();
			while(it.hasNext())
			System.out.print(it.next());
		}
	}
}
