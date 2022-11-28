package InterviewPrograms;

public class PalindromeExample {

	/**
	 * @param args
	 */
	
	
	/*
	 * A palindromic number (also known as a numeral palindrome or a numeric palindrome) 
	 * is a number (such as 16461) that remains the same when its digits are reversed.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;    
		int n=515;//It is the number variable to be checked for palindrome  
        //11,121,414,515,616,
		temp=n;    
		while(n>0){    
			r=n%10;  //getting remainder  
			System.out.println("Reminder is"+r);
			sum=(sum*10)+r;    
			n=n/10;
			System.out.println("N After Devison"+n);
		}    
		if(temp==sum)    
			System.out.println(temp+" :Palindrome number");    
		else    
			System.out.println("not palindrome");  
		
		//int remainder = number % 10;  
		//reverse = reverse * 10 + remainder;  
		//number = number/10; 
	} 
}


