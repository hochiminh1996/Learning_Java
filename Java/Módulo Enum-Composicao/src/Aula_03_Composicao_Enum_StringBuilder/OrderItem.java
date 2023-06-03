package Aula_03_Composicao_Enum_StringBuilder;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;

	public OrderItem() {

	}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
		this.price = product.getPrice();
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
		return getProduct().getPrice() * getQuantity();
	}

}
