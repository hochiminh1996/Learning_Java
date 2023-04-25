package Aula_16_matriz_ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Matriz:");
		int n = sc.nextInt();
		
		
		int[][] matriz = new int[n][n];
		//matriz : arranjo bidimensional
		
		List<Integer> listaNegativo = new ArrayList<>();
		List<Integer> diagonal = new ArrayList<>();
		
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.printf("[%d][%d]:",i+1, j+1);
				matriz[i][j] = sc.nextInt();
				
				//verificando N's <0
				if(matriz[i][j]<0) {
					listaNegativo.add(matriz[i][j]);
				}
				
				//capturando diagonal principal
				if(i == j) {
					diagonal.add(matriz[i][j]);
				}
				
			}
		}
		
		System.out.printf("\nMatriz -> %d x %d\n",n,n);
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.printf(matriz[i][j] + "    ");
			}
			System.out.println();
		}
		
		if(listaNegativo.size()>0) {
			System.out.println("Quantidade de negativos :"+listaNegativo.size() + "\n");
			System.out.printf("Números negativos digitados: ");		

			for (Integer negativeNumber : listaNegativo) {
				System.out.printf("%d ", negativeNumber);
			}
			System.out.println();
		}else {
			System.out.println("Não há valores negativos na matriz");
		}
		
		
		System.out.println("\nDiagonal principal : ");
		for(Integer diag:diagonal) {
			System.out.printf("%d ",diag);
		}
		
		
		sc.close();
		//atualizando
		
		
	}

}
