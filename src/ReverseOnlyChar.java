
public class ReverseOnlyChar {

	public static void main(String[] args) {
		String s1 = "test123pair";
		int start = 0;
		int end = s1.length()-1;
		char[] charArray = s1.toCharArray();
		
		
		while (start<end)
		{
			if(Character.isLetter(charArray[start]) && Character.isLetter(charArray[end]))
			{
			   char temp = charArray[start];
			   charArray[start] = charArray[end];
			   charArray[end] = temp;
			   start ++;
			   end --;
			}
			else if (!Character.isLetter(charArray[start]))
			{
				start ++;
			}
			else if (!Character.isLetter(charArray[end]))
			{
				end--;
			}
		}
		
		String  s2 = new StringBuilder().append(charArray).toString();
		System.out.println(s2);

	}

}
