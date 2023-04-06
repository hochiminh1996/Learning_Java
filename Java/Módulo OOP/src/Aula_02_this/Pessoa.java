package Aula_02_this;

public class Pessoa {
	public String nome;
	public int idade;
	public double altura;
	
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
//	A palavra this está referenciando o atributo da classe, não o parÂmetro.
	
	public String toString() {
		return String.format("Nome : %s\nIdade : %d\nAltura : %.2f", this.nome, this.idade
				, this.altura);
	}
//	Observe que estamos buscando os dados no atributo da classe (ou objeto)
}
