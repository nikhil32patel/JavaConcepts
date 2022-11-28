package InterviewPrograms;

public class StringReverseStringBuilder {

	public static void main(String[] args) {

		String  input = "GreeksForGreeks";

		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1.reverse();
		System.out.println(input1);

		// Using string buffer
		String inputz = "GreeksForGreeks";

		StringBuffer sbr = new StringBuffer(inputz);
		sbr.reverse();
		System.out.println(sbr.toString());
		
		String s= "madam";
		String t = " ";
		for(int i = s.length()-1; i>=0; i--)
		{
			t = t + s.charAt(i);  // concated t and s i.e. space and letter
		}
		System.out.println(t);
	}

}
