package Aula_06_Exercicio;

public class Employee {
	protected String name;
	protected Integer hours;
	protected Double valuePerHour;

	public Employee() {
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		this.hours = hours;
		this.name = name;
		this.valuePerHour = valuePerHour;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Integer getHours() {
		return hours;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public Double payment() {
		return getValuePerHour() * getHours();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("\nTipo: Funcionário Local\n");
		sb.append("Nome: " + getName() + "\n");
		sb.append("Horas Trabalhada: " + getHours() + "\n");
		sb.append("Valor Pago Por Hora: " + getValuePerHour() + "\n");
		sb.append("Pagamento: " + payment());

		return sb.toString();
	}

}
