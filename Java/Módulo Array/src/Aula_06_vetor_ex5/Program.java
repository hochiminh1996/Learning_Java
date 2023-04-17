package Aula_06_vetor_ex5;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida, mostrar na tela o maior número do vetor (supor não haver empates).
		 * Mostrar também a posição do maior elemento, considerando a primeira posição
		 * como 0 (zero).
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números?");
		int n = sc.nextInt();
		
		
		double[] vet = new double[n];
		
		for(int i=0;i<vet.length;i++) {
			System.out.printf("%d : ",i+1);
			vet[i] = sc.nextDouble();
		}
		
		double maior=0;
		double menor = vet[0];
		int po=0;
		for(int i=0;i<vet.length;i++) {
			if(vet[i] >= maior) {
				po = i;
				maior = vet[i];
			}
			
			if(vet[i]<=menor) {
				menor = vet[i];
			}
		}
		
		System.out.printf("\nMaior valor : %.2f\nPosição do Maior : %d"
				+ "\nMenor Valor : %.2f",maior,po, menor);
		sc.close();
	}

}
