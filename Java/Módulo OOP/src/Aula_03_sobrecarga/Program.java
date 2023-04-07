package Aula_03_sobrecarga;

import java.util.Locale;
import java.util.Scanner;
/*É um recurso que uma classe possui de oferecer mais de uma operação 
 * com o mesmo nome, porém com diferentes listas de parâmetros
 * Por exemplo, dois construtores que trabalham com parâmetros diferentes
 * 
 * 
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
