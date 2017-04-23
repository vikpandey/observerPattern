package observer;

import domain.Employee;

public class HrDepartment implements IObserver {
	
	private String departmentName;
	
	public HrDepartment(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@Override
	public void call(Employee employee, String msg) {
		System.out.println("hr department notified...");
		System.out.println(msg + " "+ employee.getName());
		
	}

	public String toString() {
		return this.departmentName;
	}

}
