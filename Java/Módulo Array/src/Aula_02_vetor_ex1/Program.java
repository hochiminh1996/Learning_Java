package Aula_02_vetor_ex1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois
		 * N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
		 * todos os números negativos lidos.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N:");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		//vetor de inteiros
		
		for(int i=0;i<num.length;i++) {
			System.out.printf("%d º:",i);
			num[i] = sc.nextInt();
		}
		
		System.err.println("\nNúmeros negativos:");
		for(int i=0;i<num.length;i++) {
			if(num[i]<0) {
				System.out.printf("%dº -> %d\n",i,num[i]);
			}
		}
		
		sc.close();
		
		
		
		
		
		
		
		
	}

}
