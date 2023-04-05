package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
		return "Nome_do_producto : "+this.name + " | "+"Preço : " + this.price + " | "  
				+ "Quantidade : "+this.quantity + " | " + "Total : "+TotalValueStock();
	}
}
