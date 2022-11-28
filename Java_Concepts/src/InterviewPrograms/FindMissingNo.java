package InterviewPrograms;

public class FindMissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		/*
		 * write a program to find the single missing number in array.
           int a[] = {1,3,4,5,6,7};
		 * 
		 * 
		 */
		
		int a[] = {1,3,4,5,6,7};
		//int missingno = 0;
		int len = a.length;
		int count = 1;
		for(int i =0;i<=len-1;i++)
		{
			//count = a[i];
			if(a[i]!=count)
			{
				System.out.println("Missing No is:"+count);
			}
			else
			{
				
			}
		count++;	
		}
		
		
	}

}
