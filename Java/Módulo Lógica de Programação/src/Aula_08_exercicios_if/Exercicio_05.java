package Aula_08_exercicios_if;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int cod, quant;
		double total=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------------");
		System.out.println("Código | Especificação | Preço");
		System.out.println("1      | Hot-Dog       | R$ 4.00");
		System.out.println("2      | X-Salada      | R$ 5.00");
		System.out.println("3      | X-Bacon       | R$ 2.00");
		System.out.println("4      | Refrigerante  | R$ 1.50");
		
		
		System.out.println("Qual produto?");
		cod = sc.nextInt();
		
		System.out.println("Quantidade?");

		quant = sc.nextInt();
		
		if(cod <1 || cod>5) {
			System.out.println("Opção inválida");
		}
		if (cod == 1) {
			total = 4.00 * quant;
		}else if(cod==2) {
			total = 4.50 * quant;
		}else if(cod==3) {
			total = 5.00 * quant;
		}else if(cod==4) {
			total = 2.00 * quant;
		}else if(cod == 5) {
			total = 1.50 * quant;
		}
		
		System.out.printf("Total : R$ %.2f",total);
		sc.close();
		
	}

}
