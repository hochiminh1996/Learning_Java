package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto");
		
		Product x1 = new Product(
				sc.next(),
				sc.nextDouble(),
				sc.nextInt()
				);
//		passand os valores diretamente no construct;
		
		System.out.println("\n"+x1.toString());
		
		System.out.println("Adicionando no estoque :");
		x1.AddProducts(sc.nextInt());
		System.out.println("Atualizando : \n"+x1.toString());

		
		System.out.println("Removendo no estoque : ");
		x1.removeProducts(sc.nextInt());
		System.out.println("Atualizando : \n"+x1.toString());

		sc.close();
	}

}
