package Aula_03_Composicao_Enum_StringBuilder;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;// COMPOSIÇÃO -> 1 -> 1 OU 1 -> N.

//	Existe price nessa classe p/ armazenar o histórico do preço antigo. Afinal, os preços mudam com o tempo

	public OrderItem() {

	}

	public OrderItem(Double price, Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return getPrice() * getQuantity();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + getProduct().getName() + ", Quantidade: " + getQuantity() + ", subtotal: " + subTotal() + "\n");

		return sb.toString();
	}

}
