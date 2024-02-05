
public class Occurenceof1to2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "We are playing cricket. You are learning java";
		String s2 = "are";
		
		int count=0;
	
		int result = s1.indexOf(s2,0);
		while(result!=-1)
		{
			count++;
			result=s1.indexOf(s2,result+1);
			
		}
		System.out.println(count);
		
	}

}
