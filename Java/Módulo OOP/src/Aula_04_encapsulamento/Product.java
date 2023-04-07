package Aula_04_encapsulamento;

/*
 * Resumindo : sobrecarga é disponibilizar + de uma versão de um msm 
 * método. A diferença estará no parâmetros passados nele.
 * */

public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product() {
//		construtor vazio
	}
	
//	construtor com 3 parâmetros
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
//	Exemplo de sobrecarga de método. Temos dois construtores com parâmetros diferentes
	public Product(String nome, double price) {
		this.name = nome;
		this.price = price;
		quantity = 0;
		/*A linha acima é opcional. Já que em java qualquer número de obj e 
		 * array com zero.
		 * Usamos apenas quantity, sem o this, já q não é necessário.
		 * Tendo em vista que não temos esse parâmetro nesse construtor.
		 */
	}
	
//	Métodos get/set
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
	
	public int getQuantity() {
		return quantity;
	}
	

	public double TotalValueStock() {
		return price * quantity;
	}

	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}


	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome_do_producto : " + getName() + " | " + "Preço : R$" + String.format("%.2f", getPrice()) + " | "
				+ "Quantidade : " + getQuantity() + " | " + "Total : " + String.format("%.2f", TotalValueStock());
	}
}
