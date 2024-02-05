import java.util.*;
public class EmployeeJoinedBefore2020 {

	public static void main(String[] args) {
		Map<String,Integer> employeeB2020 = new HashMap<>();
		employeeB2020.put("Princy",2017);
		employeeB2020.put("Princy3",2011);
		employeeB2020.put("Princy2",2020);
		employeeB2020.put("Princy5",2021);
		employeeB2020.put("Princy8",2018);
		
		employeeB2020.entrySet().stream().filter((entry)-> entry.getValue()<2020).map((entry)->entry.getKey()).forEach(
				(entry)->System.out.println(entry));
		
	}

}
