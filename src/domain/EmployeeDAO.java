package domain;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	Employee emp1 = new Employee("vikas", "engineering", true);
	Employee emp2 = new Employee("Holzcer", "engineering", true);
	Employee emp3 = new Employee("sakiv", "sales", true);
	Employee emp4 = new Employee("anitha", "finance", true);
	Employee emp5 = new Employee("avi", "hr", false);
	
	List<Employee> list;
	
	public List<Employee> generateEmployee() {
		
		list = new ArrayList<>();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		return list;
	}

}
