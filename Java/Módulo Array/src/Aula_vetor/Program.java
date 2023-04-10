package Aula_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	/*
	 * Em programação, um vetor é uma estrutura de dados que contém uma sequência de
	 * elementos do mesmo tipo de dados, que são armazenados em posições
	 * consecutivas na memória. Cada elemento é acessado por meio de um índice
	 * numérico que representa sua posição no vetor.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double media = 0;

		System.out.println("Quantas pessoas?");
		int n = sc.nextInt();

//		sintaxe de definição do array
		double[] vet = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite a %d º altura:", i + 1);
			vet[i] = sc.nextDouble();

			media += vet[i];
		}

		System.out.printf("\nMédia de altura : %.2f\n", media / n);
		System.out.println("Alturas digitadas : ");
		for (int i = 0; i < vet.length; i++) {
			System.err.printf("Altura %d -> %.2f\n", i+1, vet[i]);
		}

		sc.close();

	}

}
