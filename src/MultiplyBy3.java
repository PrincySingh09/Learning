import java.util.*;
import java.util.stream.Collectors;


public class MultiplyBy3 {

	public static void main(String[] args) {
		List<Integer> listOb = new ArrayList<>();
		for(int i=1;i<=100;i++) {
		listOb.add(i);	
		}
	List<Integer> finalList = listOb.stream().map( i -> i*3).collect(Collectors.toList());
	System.out.println("Numbers:"+finalList);
		
		}
}
