package Aula_03_Composicao_Enum_StringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import Aula_01_enumeracao.OrderStatus;

//classe pedido
public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private OrderStatus status;

	// composição com outra classe via um arraylist
	private ArrayList<OrderItem> itens_pedidos = new ArrayList<>();
	private Client client;// associação

	public Order() {// construtor vazio}

	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void addOrderItem(OrderItem orderItem) {
		itens_pedidos.add(orderItem);
	}

	public void removeOrderItem(OrderItem orderItem) {
		itens_pedidos.remove(orderItem);
	}

	public ArrayList<OrderItem> itemList() {
		return itens_pedidos;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public Double total() {
		double total = 0;

		for (OrderItem o : itens_pedidos) {
			total += o.subTotal();
		}

		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(getClient());// está chamando o toString do objeto cliente

		sb.append("\nPedido: \n");
		sb.append("Data do pedido: " + sdf.format(getMoment()) + "\n");
		sb.append("Status: " + getStatus() + "\n");

		sb.append("Lista de pedidos: \n");
		int cont = 1;
		for (OrderItem orderI : itens_pedidos) {
			sb.append("\nProduto #" + cont + "\n");

			sb.append(orderI.toString());// percorrendo o arraylist e pegando todos os items. Veja o StringBuilder da
											// classe orderItems

			cont++;

		}
		sb.append("\nTotal: " + total());
		return sb.toString();
	}

}
