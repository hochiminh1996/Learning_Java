package Aula_01_enumeracao;

import java.util.Date;

public class Order {
	private Integer id;
	private Date moment;
	private OrderStatus status;

	public Order() {

	}

	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setDate(Date date) {
		this.moment = date;
	}

	public Date getDate() {
		return this.moment;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public OrderStatus getStatus() {
		return this.status;
	}

	@Override
	public String toString() {
		return "ID : "+getId() + "\n"+"Data : "+getDate() + "\n" + "Status : " + getStatus();
	}
}
