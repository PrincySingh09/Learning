import java.util.*;
import java.util.stream.Collectors;

class Employee1{
	public Employee1(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	String name;
	String department;
}

public class EmployeeDept {

	public static void main(String[] args) {
		  List<Employee1> employees = Arrays.asList(
	                new Employee1("John", "HR"),
	                new Employee1("Jane", "IT"),
	                new Employee1("Bob", "HR"),
	                new Employee1("Alice", "IT"),
	                new Employee1("Charlie", "IT"),
	                new Employee1("David", "Finance")
	        );
		 
		  Map<String,Long> mp = employees.stream().collect(Collectors.
				                   groupingBy(Employee1::getDepartment,Collectors.counting()));
		  
		  mp.forEach((department, count)->System.out.println(department+":"+count));

	}

}
