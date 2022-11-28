package InterviewPrograms;

public class SumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a java program to find all pairs of elements 
		 * in an integer array whose sum is equal to a given number.
		 * 
		 */
		
		int a[] = { 4, 6, 5, -10, 8, 5, 20 };
		int length = a.length;
		int sum = 0;
		
		for(int i=0;i<=length-1;i++)
		{
			sum =0;
			for(int j=i+1;j<=length-1;j++)
			{
				sum = a[i]+a[j];
				
				if(sum == 10)
				{
					//System.out.println("Pair first No is"+a[i]"+"a[j]");
					//System.out.println("Pair first No is"+a[j]);
				}
			}
		}
		
	}

}
