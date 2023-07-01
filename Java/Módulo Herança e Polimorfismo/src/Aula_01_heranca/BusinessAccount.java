package Aula_01_heranca;

public class BusinessAccount extends Account {

	private double loan_limit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loan_limit) {
		super(number, holder, balance);
		this.loan_limit = loan_limit;
	}

	public double getLoan_limit() {
		return loan_limit;
	}

	public void setLoan_limit(double loan_limit) {
		this.loan_limit = loan_limit;
	}

	public void loan(Double amount) {// empréstimo
		if (amount <= loan_limit) {
			balance+=amount - 10;
		}else {
			System.out.println("Limite indisponível");
		}
	}

}
