package Aula_03_vetor_ex2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * média dos elementos do vetor
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números?");
		int n = sc.nextInt();

		double[] num = new double[n];

		for (int i = 0; i < num.length; i++) {
			System.out.printf("%dº : ", i + 1);
			num[i] = sc.nextDouble();
		}

		System.out.println("\nValores Digitados:");
		double soma = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.printf("%.2f ", num[i]);
			soma += num[i];
		}

		System.out.println("\n\nSoma de valores :" + soma);

		System.out.println("Média dos valores :" + soma / num.length);

		sc.close();

	}

}
