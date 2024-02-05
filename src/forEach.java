
import java.util.*;
public class forEach {

	public static void main(String[] args) {
	 
	 
	 
	Map<String,Integer> mp = new HashMap<>();
	
	mp.put("Princy", 4);
	mp.put("Piyush", 1);
	mp.put("Durgesh", 20);
	mp.put("Raj",19 );
	
	mp.forEach((name,id)->{
		if(id<15)
		{
			System.out.println(name+id);
			
		}
	}
			);
	
	
	
	
	
	
	
	
	
	}

}
