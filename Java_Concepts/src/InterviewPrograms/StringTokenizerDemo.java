package InterviewPrograms;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	static int cnt = 0;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//String s1 = "QA|Test|Automation|Interview";
		
		String s1 = "QA Test Automation Interview";
		
		StringTokenizer st = new StringTokenizer(s1," ");
		
		//String spart = s1.substring(8,18);
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
			cnt = cnt+1;
		}
		
		System.out.println(cnt);
		//System.out.println(spart);
		
	}
}
