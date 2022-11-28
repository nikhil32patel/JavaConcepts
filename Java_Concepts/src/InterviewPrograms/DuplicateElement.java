package InterviewPrograms;

import jdk.nashorn.internal.runtime.FindProperty;

public class DuplicateElement {

	public static void main(String[] args) 
	{
		int a[] = {1,1,3,3};
		findDuplicateFromIntArray(a);
	}
	public static void findDuplicateFromIntArray(int s[])
	{
		int count = 0;
		int len = s.length;
		
		for(int i =0;i<=len-1;i++)
		{
			for(int j=i+1;j<=len-1;j++)
			{
				if(s[i]==s[j])
				{
					count = count+1;
					System.out.println("Duplicate Array ele :"+s[i]);
				}
			}
		}
	}
}
