package Aula_01_construct;

import java.util.Locale;
import java.util.Scanner;
/*
 * O construtor é importante porque evita a construção de um objeto
 * que não possui valores. Neste caso, ele impede uma criação com dados ausentes
 * */
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do produto:");
		String name = sc.next();
		
		System.out.println("Digite o preço do produto:");
		double price = sc.nextDouble();
		
		System.out.println("Digite a quantidade do produto:");
		int quant = sc.nextInt();
		
		
		Product x1 = new Product(name, price, quant);
		
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
