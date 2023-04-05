package Aula_11_while;

import java.util.Locale;
import java.util.Scanner;

public class Aula_05_exercicio06 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		int x = 0, y = 0;

		
		Scanner sc = new Scanner(System.in);


		while (true) {

			System.out.println("Digite um valor A:");
			x = sc.nextInt();

			System.out.println("Digite um valor B:");
			y = sc.nextInt();

			if (x == y) {
				System.out.println("Valores iguais");
			} else if (x > y) {
				System.out.println("Decrescente");
			} else if(x<y) {
				System.out.println("Crescente");
			}
		}

	}

}
