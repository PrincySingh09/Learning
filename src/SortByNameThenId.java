import java.util.*;

import java.util.Collections;
class Employee{
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	int id;
	String name;
}
public class SortByNameThenId {

	public static void main(String[] args) {
	List<Employee> employeeB2020 = new ArrayList<>();
	
	 
	 
	 
	employeeB2020.add(new Employee(4,"Princy Singh"));
	employeeB2020.add(new Employee(1,"Princy Singh"));
	employeeB2020.add(new Employee(3,"Khushi "));
	employeeB2020.add(new Employee(8,"Piyush"));
	employeeB2020.add(new Employee(10,"Durgesh"));	

	Collections.sort(employeeB2020,new EmployeeComparator());
	
     
	employeeB2020.forEach((employee)->{
		System.out.println(employee.getId() + employee.getName());
	}
	);
	
	} 
    
	

}
class EmployeeComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		 int result = e1.getName().compareTo(e2.getName());
		 if(result != 0)
		 {
			 return result ;
		 }
		 return e2.getId()- e1.getId();
		}
}
