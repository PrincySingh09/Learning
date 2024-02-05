import java.util.*;
import java.util.stream.Collectors;

public class NewCommonList {

	public static void main(String[] args) {
		List<Integer> listOne =  new ArrayList<>();
		List<Integer> listTwo =  new ArrayList<>();
		
		listOne.add(1);
		listOne.add(2);
		listOne.add(3);
		listOne.add(4);
		listOne.add(5);
		
		listTwo.add(2);
		listTwo.add(4);
		listTwo.add(6);
		
		List<Integer> commonElements = listOne.stream().filter(i->   listTwo.contains(i)).collect(Collectors.toList());
		
		System.out.println(commonElements);
		
		/*
		 List<Integer> commonElements = listOne.stream().filter(i->listTwo.contains(i)).collect(Collectors.toList());
		 System.out.println("List of common elements:"+commonElements);
	
	*/
	}

}
