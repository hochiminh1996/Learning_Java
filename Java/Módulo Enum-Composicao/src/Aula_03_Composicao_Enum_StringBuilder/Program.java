package Aula_03_Composicao_Enum_StringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Aula_01_enumeracao.OrderStatus;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");// formato de data

		
		Scanner sc = new Scanner(System.in);
		// entrada de dados

		System.out.print("Nome do cliente: ");
		String name = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Data de nascimento: ");
		String data = sc.nextLine();

		System.out.print("Status do pedido: ");
		String status = sc.nextLine();
		
		System.out.println();

		System.out.print("Quantos items terá o pedido?");
		int n = sc.nextInt();

		Client client = new Client(name, email, sdf1.parse(data));
		// Criando um client. Observe que estamos utilizando a data com base no
		// padrão simpledateformat

		Order or = new Order(new Date(), OrderStatus.valueOf(status));
		// criando um pedido e o stutus do enum

		// Quantidade de produtos
		for (int i = 1; i <= n; i++) {
			sc.nextLine();

			System.out.printf("Nome do produto #%d:", i);//nome
			String name_product = sc.nextLine();

			System.out.printf("Preço do produto (R$) : ");//preco
			Double price = sc.nextDouble();

			System.out.printf("Quantidade do produto: ");//quantidade
			int quant = sc.nextInt();

			Product product = new Product(name_product, price);// instanciando um produto com os valores digitados

			OrderItem or_item = new OrderItem(quant, product);
			// Instanciado um item do pedido

			or.addOrderItem(or_item);// Adicionando os items ao pedido
			System.out.println();

		}
		System.out.println(client);// EXIBINDO VIA STRINGBUILDER

		System.out.println(or);// EXIBINDO VIA STRINGBUILDER
		sc.close();

	}
}
