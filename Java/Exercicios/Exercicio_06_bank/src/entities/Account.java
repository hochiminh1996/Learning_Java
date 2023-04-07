package entities;

public class Account {
	private int numero;
	private String titular;
	private double saldo;

	public Account() {

	}

	public Account(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		depositar(depositoInicial);
	}
	
	public Account(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

//	public void setName(String titular) {
//		this.titular = titular;
//	}

	public String getName() {
		return titular;
	}

//	public void setNumero(int numero) {
//		this.numero = numero;
//	}

	public int getNumero() {
		return numero;
	}

	public void depositar(double saldo) {
		this.saldo += saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void retirar(double valor) {
		saldo -= valor + 5;
	}

	public String toString() {
		return "Número da Conta : "+getNumero() + "\nTitular : "+getName()
		+"\nSaldo : R$ "+getSaldo();
	}

}
