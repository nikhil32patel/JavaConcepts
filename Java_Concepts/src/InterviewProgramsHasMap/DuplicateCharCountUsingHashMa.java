package InterviewProgramsHasMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharCountUsingHashMa {

	public void findIt(String str) {  
		Map<Character, Integer> baseMap = new HashMap<>();  
		char[] charArray = str.toCharArray();  
		//System.out.println(charArray.length);
		//System.out.println(charArray);
		//System.out.println(charArray[0]);
		//int sum=0;
		for (Character ch : charArray) {
			
			if (baseMap.containsKey(ch)) {  
				baseMap.put(ch, baseMap.get(ch) + 1);  
				//System.out.println(baseMap.get(ch));
			} else {  
				baseMap.put(ch, 1);  
				//System.out.println(baseMap.get(ch));  
			}  
		} 
		
		//System.out.println(sum);
		Set<Character> keys = baseMap.keySet();  
		for (Character ch : keys) {  
			if (baseMap.get(ch) > 1) {  
				System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
			}  
		}  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCharCountUsingHashMa dcf = new DuplicateCharCountUsingHashMa();  
	        dcf.findIt("India is my country");  

	}

}
