package entities;

import exception.DomainException;

public class Account {
	private Number number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {

	}

	public Account(String holder, Number number, Double balance, Double withdrawLimit) {
		this.holder = holder;
		this.number = number;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
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

	public void balance(Double balance) {
		this.balance += balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void withdraw(Double amount) throws DomainException {

		if (getBalance() > 0 && amount <= withdrawLimit && amount <= getBalance() &&  amount>0) {
			// saldo maior que 0 && valor de saque <= limite && valor de saque <= saldo em
			// conta && valor de saque tem que ser maior que zero
			balance -= amount;
			System.out.println("Saque de R$" + amount + " feito com sucesso\n");
		} else {
			if (getBalance() < amount) {
				throw new DomainException("Saldo insuficiente...");
			} else if (amount >= withdrawLimit) {
				throw new DomainException("Limite insuficiente...");
			}else if(amount <0) {
				throw new DomainException("Valor inválido...");

			}
		}

	}

	public void deposit(Double amount) throws DomainException {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposito de R$" + amount + " feito com sucesso\nSaldo atual: R$" + getBalance() + "\n");
		} else {
			throw new DomainException("Valor inválido");
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Proprietário: " + getHolder() + "\nNúmero: " + getNumber() + "\nSaldo: " + getBalance() + "\n");
		sb.append("Limite: " + getWithdrawLimit() + "\n");
		return sb.toString();
	}
}
