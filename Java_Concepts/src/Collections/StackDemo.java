package Collections;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class StackDemo 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Stack<Integer> st = new Stack<>();
				
				int choice = 0;
				int position,element;
				
				BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				
				while(choice < 4)
				{
					System.out.println("STACK OPERATIONS");
					
					System.out.println("1 PUSH AN ELEMENT");
					System.out.println("2 POP AN ELEMENT");
					System.out.println("3 SEARCH AN ELEMENT");
					System.out.println("4 EXIT");
					
					System.out.print("Your Choice : ");
					
					choice = Integer.parseInt(br.readLine());
					
					switch(choice)
					{
						case 1: 
							
							System.out.print("Enter Element ");
							element = Integer.parseInt(br.readLine());
							st.push(element);
							break;
							
						case 2:
							
							Integer obj = st.pop();
							System.out.println(" Popped Element " +obj);
							break;
							
						case 3:
							
							System.out.print("Which Element ");
							element = Integer.parseInt(br.readLine());
							position = st.search(element);
							
							if(position == -1)
							
								System.out.println("Element not found");
							
							else
							
								System.out.println(" Element Posiont : " + position);
							break;
							
							default:
								
								return;
							
					}// SWITCH END
					
					System.out.println("Stack contents: "+st);
					
				} // WHILE LOOP END
				
		 	
	}

}
