package Aula_07_Exercicio;

public class ImportedProduct extends Product {
	private Double customFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}

	public Double totalPrice() {
		return super.getPrice() + getCustomFee();
	}

	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("PriceTag:\n");
		sb.append("Nome: " + getName() + " | Preço: R$" + totalPrice() + " | (Taxa: R$" + getCustomFee() + ")\n");

		return sb.toString();
	}

}
