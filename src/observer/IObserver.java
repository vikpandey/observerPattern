package observer;

import domain.Employee;

public interface IObserver {
	
	public void call(Employee employee, String msg);

}
