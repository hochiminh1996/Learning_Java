package Aula_07_vetor_ex6;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
		 * seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
		 * elementos correspondentes de A e B. Imprima o vetor C gerado.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores vai ter cada vetor?");
		int n = sc.nextInt();

		double[] vetA = new double[n];
		double[] vetB = new double[n];
		double[] vetC = new double[n];

		System.out.println("Digite os valores do vetor A:");

		for (int i = 0; i < vetA.length; i++) {
			System.out.printf("%dº:", i + 1);
			vetA[i] = sc.nextDouble();
		}

		System.out.println("\nDigite os valores do vetor B:");

		for (int i = 0; i < vetB.length; i++) {
			System.out.printf("%dº:", i + 1);
			vetB[i] = sc.nextDouble();
		}

		System.out.println();

		System.out.println("VETOR A:");
		for (int i = 0; i < vetA.length; i++) {
			System.out.printf("%.2f ", vetA[i]);
		}

		System.out.println();

		System.out.println("\nVETOR B:");
		for (int i = 0; i < vetB.length; i++) {
			System.out.printf("%.2f ", vetB[i]);
		}
		
		
//		soma dos vetores a + b
		
		for (int i = 0; i < vetC.length; i++) {
			vetC[i] = vetA[i] + vetB[i];
		}
		
		System.out.println("\n\nSOMA DOS VETORES A + B:");
		for (int i = 0; i < vetC.length; i++) {
			System.out.printf("%.2f ", vetC[i]);
		}
		
		
		sc.close();
	}

}
