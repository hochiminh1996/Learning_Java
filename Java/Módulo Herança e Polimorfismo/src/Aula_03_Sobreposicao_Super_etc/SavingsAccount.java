package Aula_03_Sobreposicao_Super_etc;

public class SavingsAccount extends Account {
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);// passando os parâmetros desse classe p/ o construtor mãe (Account)
		this.interestRate = interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void updateBalance() {
		// balance é o atributo protected da classe Account
		balance += balance * interestRate;// pega o balance e calcula com base na taxa de juros.
		// 1000 = 1000 + 1000 * 5%(0,05) = 1050
	}

	@Override // sobreposição ou sobrescrita do nosso método
	public void withdraw(Double amount) {
		// implementando um método da superclasse, porém com modificações.
		// Afinal, conta poupança n paga taxa, apenas os outros tipos

		balance -= amount;
	}
	// Se você n colocar o @Override vai funcionar. No entanto, se você colocar o
	// nome incorreto do método
	// ele não vai acusar erro e vc não vai sobrescrever o método da classe mãe
	// (superclasse)

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Tipo de conta: Poupança\n");
		sb.append("Nome: " + getHolder() + "\n");
		sb.append("Número: " + getNumber() + "\n");
		sb.append("Saldo: " + getBalance()+"\n");

		return sb.toString();
	}
}
