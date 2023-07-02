package Aula_03_Sobreposicao_Super_etc;

public class Account {
	private Integer number;
	private String holder;
	protected Double balance;

	public Account() {
	}// construct

	public Account(Integer number, String holder, Double balance) {
		this.balance = balance;
		this.holder = holder;
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(Double amount) {// sacar
		balance -= amount + 5.0;
		
		//Aqui está retirando o valor + 5 da taxa. Isso em uma conta padrão.
		//Em conta poupança, não há taxa
	
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Tipo de conta: Padrão\n");
		sb.append("Nome: "+getHolder()+"\n");
		sb.append("Número: "+getNumber()+"\n");
		sb.append("Saldo: "+getBalance()+"\n");
		
		return sb.toString();
	}

}
