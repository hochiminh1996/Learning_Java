package Aula_01_enumeracao;

import java.util.Date;

// ENUM é uma classe que representa um conjunto fixo de valores constantes.
public class Program {
	public static void main(String[] args) {
		
		Order order = new Order(100, new Date(), OrderStatus.SHIPPED);
		
		
		System.out.println(order);
	}
}
