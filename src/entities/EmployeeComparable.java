package entities;

public class EmployeeComparable implements Comparable<EmployeeComparable> {

	private String name;
	private Double salary;
	
	public EmployeeComparable(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public int comparareTo(Employee other) {
		return name.compareTo(other.getName());
	}

	@Override
	public int compareTo(EmployeeComparable o) {
		
		return 0;
	}
	
}
