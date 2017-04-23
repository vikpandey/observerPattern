package subjects;

import java.util.ArrayList;
import java.util.List;

import domain.Employee;
import domain.EmployeeDAO;
import observer.IObserver;

public class EmployeeManagementSystem implements ISubject  {
	
	private Employee employee;
	private String msg;
	
	private EmployeeDAO employeeDAO;
	private List<Employee> employees;
	private List<IObserver> observers;
	
	public EmployeeManagementSystem() {
		this.observers = new ArrayList<>();
		employeeDAO = new EmployeeDAO();
		this.employees = employeeDAO.generateEmployee();
	}

	@Override
	public void registerObserver(IObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		
		for(IObserver department : observers) {
			department.call(employee, msg);
		}
		
	}
	
	public void hireNewEmployee(Employee emp) {
		employee = emp;
		msg = "New Hire :";
		employees.add(emp);
		notifyObservers();
	}
	
	public void modifyEmployee(int id, String newName) {
		
		boolean notify = false;
		
		for(Employee emp : employees) {
			if(emp.getId() == id) {
				System.out.println("old name :- " + employee.getName());
				System.out.println("new Name :- " + newName);
				emp.setName(newName);
				employee = emp;
				msg = "name modified...";
				notify = true;
			}
		}
		if(notify) {
			notifyObservers();
		}
	}

}
