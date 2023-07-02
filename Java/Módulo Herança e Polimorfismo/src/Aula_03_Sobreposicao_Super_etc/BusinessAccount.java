package Aula_03_Sobreposicao_Super_etc;

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
	
	
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount + 2);
		//estamos chamando o método da superclasse e retirando +2 de taxa.
		// no final será valor - 2(taxa da classe filha) - 5(taxa da classe mãe)
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Tipo de conta: Comercial\n");
		sb.append("Nome: " + getHolder() + "\n");
		sb.append("Número: " + getNumber() + "\n");
		sb.append("Saldo: " + getBalance()+"\n");

		return sb.toString();
	}

}
