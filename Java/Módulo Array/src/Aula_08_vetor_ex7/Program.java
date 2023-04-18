package Aula_08_vetor_ex7;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Fazer um programa para ler um número inteiro N e depois um vetor de N números
		 * reais. Em seguida, mostrar na tela a média aritmética de todos elementos com
		 * três casas decimais. Depois mostrar todos os elementos do vetor que estejam
		 * abaixo da média, com uma casa decimal cada.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();

		double[] vet = new double[n];
		double media = 0;

		for (int i = 0; i < vet.length; i++) {
			System.out.printf("%d -> ", i + 1);
			vet[i] = sc.nextDouble();
			media += vet[i];
		}

		System.out.printf("\nMédia : %.2f\n", media / vet.length);

		System.out.println("Elementos abaixo da média\n");
		
		for(int i=0;i<vet.length;i++) {
			if(vet[i]<media/vet.length) {
				System.out.printf("%.2f -> %.2f\n",media/vet.length,vet[i]);
			}
		}
		
		sc.close();

	}

}
