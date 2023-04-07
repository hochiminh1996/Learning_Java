package Aula_04_encapsulamento;

import java.util.Locale;
import java.util.Scanner;
/*
Encapsulamento : 
É um princípio que consiste em esconder detalhes de implementaçõa de uma classe, 
expondo apenas operações seguras e que mantenham os objetos em um estado consistente. 

Regra geral : um objeto não deve expor nenhum atributo(modificador de acesso).
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
		
	
		
		
		Product x1 = new Product(name, price);
		
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
