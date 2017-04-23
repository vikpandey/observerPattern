package observer;

import domain.Employee;

public class PayrollDepartment implements IObserver {
	
	private String departmentName;
	
	public PayrollDepartment(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@Override
	public void call(Employee employee, String msg) {
		System.out.println("payroll department notified...");
		System.out.println(msg + " " + employee.getName());
		
	}
	
	public String toString() {
		return this.departmentName;
	}

}
