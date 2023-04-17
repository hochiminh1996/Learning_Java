package Aula_05_vetor_ex4;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
		 * seguida, mostre na tela todos os números pares, e também a quantidade de
		 * números pares
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números?");

		int n = sc.nextInt();

		int[] num = new int[n];
		
		for(int i=0;i<num.length;i++) {
			System.out.printf("%d ->",i+1);
			num[i] = sc.nextInt();
		}
		
		System.out.println("\nNúmeros pares :");
		int quant=0;
		for(int i=0;i<num.length;i++) {
			if(num[i] % 2 ==0) {
				System.out.printf("%d ",num[i]);
				quant++;
			}
		}
		
		System.out.println("\nQuantidade de pares : "+quant);
		sc.close();
		
	}

}
