package Aula_07_Exercicio;

public class Product {
	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}

	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("PriceTag:\n");
		sb.append("Nome : " + getName() + " | Preço : R$" + getPrice() + "\n");

		return sb.toString();
	}
}
