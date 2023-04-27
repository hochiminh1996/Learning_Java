package Aula_17_matriz_ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// Acessando valores de uma matriz:

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Linha:");
		int l = sc.nextInt();

		System.out.printf("Coluna:");
		int c = sc.nextInt();

		int[][] matriz = new int[l][c];// nossa matriz
		System.out.println();

		List<Integer> lista = new ArrayList<>();
		// irá armazenar numa lista todos os valores digitados

//		dados de entrada
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < c; j++) {
				System.out.printf("[%d %d]:", i, j);

				matriz[i][j] = sc.nextInt();
				lista.add(matriz[i][j]);
			}
		}

//		visualizando matriz
		System.out.println("\nVisualizando a matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < c; j++) {
				System.out.printf("%d        ", matriz[i][j]);
			}
			System.out.println();
		}

//		pesquisando valores
		System.out.print("\nPesquise um número na matriz:");
		int n = sc.nextInt();

		System.out.println();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < c; j++) {
				if (n == matriz[i][j]) {
					System.out.printf("Posições do %d: [%d %d] \n", n, i, j);
				}
			}
		}

		// Caso o valor não seja localizado dentro da matriz, que tem todos os dados no
		// arraylist
		if (lista.indexOf(n) == -1) {
			System.out.printf("Valor %d não localizado", n);
		}

		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < c; j++) {
				if (matriz[i][j] == n) {
					// Pega o valor da direita : coluna + 1 < coluna
					if (j + 1 < c) {
						System.out.printf("Valor à direita : %d\n", matriz[i][j + 1]);
					}

					// Pega o valor da esquerda : coluna - 1 < coluna
					if (j - 1 >= 0) {
						System.out.printf("Valor à esquerda : %d\n", matriz[i][j - 1]);

					}

					// valores inferiores linha + 1 < valor total de linhas da matriz
					if (i + 1 < matriz.length) {
						System.out.printf("Valor inferior : %d\n", matriz[i + 1][j]);
					}

					// valores superiores : linha - 1 >=0
					if (i - 1 >= 0) {
						System.out.printf("Valor do topo : %d\n", matriz[i - 1][j]);
					}

				}
			}
		}
		
//		diagnonal principal
		System.out.println("\nDiagnonal principal : \n");
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<c;j++) {
				if(i == j) {
					System.out.printf("%d  ", matriz[i][j]);
				}
			}
		}
		
		
		

		sc.close();

	}
}
