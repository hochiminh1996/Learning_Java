package Entities;

public class Funcionario {
	public String nome;
	public double salario;
	public double imposto;

	public Funcionario(String nome, double salario, double imposto) {
		this.nome = nome;
		this.salario = salario;
		this.imposto = imposto;
	}

	public double aumentarSal() {
		return this.salario - this.imposto;
	}

	public void salLiquido(double increment) {
		this.salario += (this.salario * increment / 100);
	}

	public String toString() {
		return "Nome : " + this.nome + "| Salário : "+aumentarSal();
	}
}
