
import java.util.*;
import java.util.stream.Collectors;
class Numbers 
{
	int a ;
	int b ;
	int c ;
	
	public  int add(int parameterOne , int parameterTwo)
	{
		return parameterOne+parameterTwo;
	}
	
	public int add ( int parameterOne , int parameterTwo , int parameterThree)
	{
		return parameterOne + parameterTwo + parameterThree;
	}
	
	public int add(String parameterOne , String parameterTwo)
	{
		return parameterOne.compareTo(parameterTwo);
	}
}
public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Numbers n1 = new Numbers();
		
		int  result = n1.add("Princy", " Singh");
		
		int result1 = n1.add(2, 3);
		int result3 = n1.add(2, 4,5);
		
		
		String k = "princy";
		String l = "princy";
		
		int result5 = l.compareTo(k);
		System.out.println(result5);
	
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        
       List<Integer> l2 =   l1.stream().filter(i->i%2==0).collect(Collectors.toList());
       System.out.println(l2);
       
		

	}

}
