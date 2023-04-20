

public class Employees {
	private Integer id;
	private String name;
	private Double salary;

	public Employees() {

	}

	public Employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void increaseSalary(double porcentage) {
		salary += salary * porcentage / 100.00;
	}

	public String toString() {
		return getId() + ", " + getName() + ", " + String.format("%.2f", getSalary());
	}

}
