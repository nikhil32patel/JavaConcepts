package InterviewPrograms;

public class ReverseString {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// 1 METHOD
		String s = "Selenium Bhanvadiya";
		int len = s.length();
		String rev = "";
		
		for(int  i =len-1;i>=0;i--){
			System.out.println(i);
			rev =rev+s.charAt(i);
		}
		
		System.out.println(rev);

		// 2 METHOD USING STRING BUFFER CLASS
		StringBuffer ObjSB = new StringBuffer("Selenium");
		System.out.print(ObjSB.reverse());
		
		
		StringBuilder ObjSbuilder = new StringBuilder();
		ObjSbuilder.append("Selenium");
		ObjSbuilder.reverse();
		 
		System.out.println(ObjSbuilder);
		
	}

}
