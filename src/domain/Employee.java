package domain;

public class Employee {
	
	private int id;
	private String name;
	private String department;
	private boolean working;
	
	private static int COUNTER;
	
	public Employee(String name, String department, boolean working) {
		this.name = name;
		this.department = department;
		this.working = working;
		
		this.id = ++COUNTER;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}
	
	public String toString() {
		return this.name;
	}
	

}
