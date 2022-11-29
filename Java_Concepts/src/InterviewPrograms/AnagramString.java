package InterviewPrograms;

import java.util.Arrays;

public class AnagramString {


	static void isAnagram(String str1, String str2)
	{
		String s1 = str1.replaceAll("\\s", "");  
		String s2 = str2.replaceAll("\\s", "");
		
		boolean status = true;  
		
		if (s1.length() != s2.length()){  
			status = false;  
		} 
		else {
			
			char[] ArrayS1 = s1.toLowerCase().toCharArray();  
			char[] ArrayS2 = s2.toLowerCase().toCharArray();  
			
			//System.out.println("Before Sort of String 1:"+ArrayS1.toString());
			Arrays.sort(ArrayS1);
			//System.out.println("After Sort of String 1:"+ArrayS1.toString());
			
			//System.out.println("Before Sort of String 2:"+ArrayS2);
			Arrays.sort(ArrayS2);
			
			//System.out.println("After Sort of String 3:"+ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
			
		}

		if (status){  
			System.out.println(s1 + " and " + s2 + " strings are : ANAGRAMS");  
		} else {  
			System.out.println(s1 + " and " + s2 + " strings are : NOT ANAGRAM");  
		}  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isAnagram("keep", "Peek   ");
		isAnagram("list en", "silent");
		isAnagram("hii", "bye");
		isAnagram("ke", "le");
		isAnagram("Mother In Law", "Hitler Woman");
		isAnagram("ihi", "Hii");
	}
}
