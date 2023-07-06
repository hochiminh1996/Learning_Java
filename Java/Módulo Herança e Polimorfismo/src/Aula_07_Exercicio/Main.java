package Aula_07_Exercicio;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Product prod = null;

		Scanner sc = new Scanner(System.in);
		ArrayList<Product> lista = new ArrayList<>();


		System.out.println("Qual é a quantidade produtos?");
		int quant = sc.nextInt();

		for (int i = 0; i < quant; i++) {
			sc.nextLine();

			System.out.printf("Produto #%d\n", i + 1);
			System.out.print("Tipo do Produto [I, C, U]:");
			char op = sc.next().charAt(0);

			System.out.print("Nome: ");
			String nome = sc.next();

			System.out.print("Preço: ");
			Double price = sc.nextDouble();

			if (op == 'i') {
				System.out.print("Taxa de importação:");
				Double tax = sc.nextDouble();

				prod = new ImportedProduct(nome, price, tax);

			} else if (op == 'u') {
				System.out.print("Data[DD/MM/YYYY]: ");
				sc.nextLine();
				String d = sc.nextLine();
				
				prod = new UsedProduct(nome, price, d);
			} else if (op == 'c') {
				prod = new Product(nome, price);
			}

			lista.add(prod);
			System.out.println();

		}
		sc.close();
		
		
		System.out.println("Lista:");
		for(Product p:lista) {
			System.out.println(p.priceTag());
		}

	}

}
