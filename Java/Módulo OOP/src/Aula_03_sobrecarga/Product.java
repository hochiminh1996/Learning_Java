package Aula_03_sobrecarga;

/*
 * Resumindo : sobrecarga é disponibilizar + de uma versão de um msm 
 * método. A diferença estará no parâmetros passados nele.
 * */

public class Product {
	public String name;
	public double price;
	public int quantity;

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
		return "Nome_do_producto : " + this.name + " | " + "Preço : R$" + String.format("%.2f", this.price) + " | "
				+ "Quantidade : " + this.quantity + " | " + "Total : " + String.format("%.2f", TotalValueStock());
	}
}
