package Aula_10_Exercicio;

public class Company extends Taxpayer {
	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		if (getNumberOfEmployees() > 0 && getNumberOfEmployees() < 10) {
			return super.getAnualIncome() * 0.16;
		} else if (getNumberOfEmployees() >= 10) {
			return super.getAnualIncome() * 0.14;
		} else {
			return 0.00;
		}

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Informações:[Pessoa Jurídica]\n");
		sb.append("Nome da Empresa: " + super.getName() + "\n");
		sb.append("Renda anual: " + super.getAnualIncome() + "\n");
		sb.append("Número de Funcionários: "+getNumberOfEmployees()+"\n");
		sb.append("Imposto: " + String.format("%.2f", tax()) + "\n");

		
		return sb.toString();
	}

}
