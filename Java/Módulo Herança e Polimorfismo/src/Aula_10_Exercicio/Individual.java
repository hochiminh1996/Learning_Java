package Aula_10_Exercicio;

public class Individual extends Taxpayer {
	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		Double tax = 0.0;

		if (super.getAnualIncome() > 0 && super.getAnualIncome() < 20000) {
			tax = super.getAnualIncome() * 0.15 - getHealthExpenditures() * 0.5;
		} else if (super.getAnualIncome() >= 20000) {
			tax = super.getAnualIncome() * 0.25 - getHealthExpenditures() * 0.5;
		}

		if (tax < 0) {
			tax = 0.0;
		}

		return tax;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Informações:[Pessoa Física]\n");
		sb.append("Nome: " + super.getName() + "\n");
		sb.append("Renda anual: " + super.getAnualIncome() + "\n");
		sb.append("Imposto: " + String.format("%.2f", tax()) + "\n");

		return sb.toString();
	}
}
