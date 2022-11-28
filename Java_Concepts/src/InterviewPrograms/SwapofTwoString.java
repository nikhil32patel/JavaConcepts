package InterviewPrograms;

public class SwapofTwoString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Declare two strings 
        String a = "Nikhil"; 
        String b = "Bhanvadiya"; 
          
        // Print String before swapping 
        System.out.println("Strings before swap: a = " +  
                                       a + " and b = "+b); 
          
        //Append 2nd string to 1st 
        a = a + b; 
        
        System.out.println("After appending second string to first " + a); 
        
        //Store intial string a in string b 
        System.out.println("A length is "+ a.length());
        System.out.println("B length is "+ b.length());
        
        b = a.substring(0,a.length()-b.length()); 
        System.out.println("After appending second string to first " + b); 
        
        //Store initial string b in string a 
        a = a.substring(b.length()); 
          
        //Print String after swapping 
        System.out.println("Strings after swap: a = " +  
                                     a + " and b = " + b);
        /*
         * a= Nikhil 
         * b= Bhanvadiya
         * 
         * a= NikhilBhanvadiya
         * b= 
         * 
         */
	}

}
