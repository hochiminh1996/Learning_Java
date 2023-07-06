package Aula_06_Exercicio;

public class OutsourcedEmployee extends Employee {
	private Double additicionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additicionalCharge) {
		super(name, hours, valuePerHour);
		this.additicionalCharge = additicionalCharge;
	}

	public Double getAdditicionalCharge() {
		return additicionalCharge;
	}

	public void setAdditicionalCharge(Double additicionalCharge) {
		this.additicionalCharge = additicionalCharge;
	}

	@Override
	public Double payment() {
		

		return super.payment() + getAdditicionalCharge() * 1.1;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("\nTipo: Funcionário Terceirizado\n");
		sb.append("Nome: " + super.getName() + "\n");
		sb.append("Horas Trabalhada: " + super.getHours() + "\n");
		sb.append("Valor Pago Por Hora: " + super.getValuePerHour() + "\n");
		sb.append("Valor Adicional: " + getAdditicionalCharge() + "\n");
		sb.append("Pagamento: " + payment());

		return sb.toString();
	}

}
