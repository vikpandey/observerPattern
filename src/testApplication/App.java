package testApplication;

import domain.Employee;
import observer.HrDepartment;
import observer.IObserver;
import observer.PayrollDepartment;
import subjects.EmployeeManagementSystem;


public class App {

	public static void main(String[] args) {
		
		IObserver payroll = new PayrollDepartment("payroll");
		IObserver hr = new HrDepartment("hr");
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		
		ems.registerObserver(payroll);
		ems.registerObserver(hr);
		
		Employee vikas = new Employee("vikas", "Engineering", true);
		ems.hireNewEmployee(vikas);
		ems.modifyEmployee(100, "sakiv");
	}

}
