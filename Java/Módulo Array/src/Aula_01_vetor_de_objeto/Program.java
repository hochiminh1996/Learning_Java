package Aula_01_vetor_de_objeto;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double media=0;

		System.out.println("Quantos produtos?");
		int n = sc.nextInt();

		Product[] produto = new Product[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();//consumindo o enter pendente
			System.out.printf("Nome do %d º produto :", i + 1);
			String nome_produto = sc.nextLine();
			

			System.out.printf("Digite o preço do produto :");
			double preco = sc.nextDouble();

			produto[i] = new Product(nome_produto, preco);
		}

		System.out.println("\n");
		for (int i = 0; i < produto.length; i++) {
			System.out.println(produto[i].toString());
			media += produto[i].getPreco();

		}
		System.err.println("\nMédia dos produtos : "+(media/n));

		sc.close();

	}

}
