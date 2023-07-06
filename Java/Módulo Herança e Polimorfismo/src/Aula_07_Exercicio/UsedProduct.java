package Aula_07_Exercicio;


public class UsedProduct extends Product {
	private String manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, String manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("PriceTag:\n");
		sb.append("Nome: " + getName() + " (Usado) | " + " Preço: " + super.getPrice() + " | "
				+ "(Produto Manufaturado " + getManufactureDate() + ")\n");
		return sb.toString();
	}

}
