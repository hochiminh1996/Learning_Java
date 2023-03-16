package Aula_08_exercicios_if;

import java.util.Locale;
import java.util.Scanner;

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

public class Exercicio_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor:");
		n = sc.nextDouble();

		if (n < 0 || n > 100) {
			System.out.printf("%.2f fora do intervalo", n);
		}else
		if (n >= 0 && n <= 25) {
			System.out.printf("%.2f => [0,25]", n);
		} else if (n <= 50) {
			System.out.printf("%.2f => [25,50]", n);
		} else if (n <= 75) {
			System.out.printf("%.2f => [50,75]", n);
		} else if (n <= 100) {
			System.out.printf("%.2f => [75,100]", n);
		}
		sc.close();

	}

}
