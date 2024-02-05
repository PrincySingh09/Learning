

import java.util.*;
public class StringReplaceWithSymbol {

	public static void main(String[] args) {
		Map<Character,Integer> mp = new HashMap<>();
		String s1 = "hello world";
		String s2 = "el";
		for(int i=0;i<s2.length();i++) {
			mp.put(s2.charAt(i),1);
		}
		
		for(int i=0;i<s1.length();i++) {
			if(mp.containsKey(s1.charAt(i)))
			{
				s1 = s1.replace(s1.charAt(i), '%');
			}
		}
		
	    System.out.println(s1);
	    
	   
	    
	   
		
	}

}



