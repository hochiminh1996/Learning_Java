package Aula_01_vetor_de_objeto;

public class Product {
	private String nome;
	private double preco;
	
	public Product() {
		
	}
	
//	sobrecarga de construtores
	public Product(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	
	public String toString() {
		return "Nome do produto : "+ getNome()
				+ "\n"+
				String.format("Preço : %.2f", getPreco());
	}
	
	
	
}
