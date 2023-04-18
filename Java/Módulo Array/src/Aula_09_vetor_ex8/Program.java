package Aula_09_vetor_ex8;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Fazer um programa para ler um vetor de N números inteiros. Em seguida,
		 * mostrar na tela a média aritmética somente dos números pares lidos, com uma
		 * casa decimal. Se nenhum número par for digitado, mostrar a mensagem
		 * "NENHUM NUMERO PAR"
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();

		int[] vet = new int[n];
		int media = 0, count = 0;

		for (int i = 0; i < vet.length; i++) {
			System.out.printf("%d - > ", i + 1);
			vet[i] = sc.nextInt();

			if (vet[i] % 2 == 0) {
				media += vet[i];
				count++;
			}
		}

		if (media > 0) {
			System.out.println("Média dos pares : " + media / count);
		} else {
			System.out.println("Não há valores pares [incluído o zero]");
		}
		sc.close();
	}

}
