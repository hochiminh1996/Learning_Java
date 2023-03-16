package Aula_03_Scanner;

import java.util.Locale;
import java.util.Scanner;

public class Main {
//	utilizando a Scanner para entrada de dados
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		String msg;//
		int numero;
		double fracao;

		Scanner sc = new Scanner(System.in);
//		Declara um objeto do tipo scanner p/ entra de dados

		System.out.println("Digite uma frase/nome : ");// MSG
		msg = sc.next();// A string msg vai se utilizar do objeto scanner para pegar dados digitados

		System.out.println("Digite um número inteiro : ");
		numero = sc.nextInt();

		System.out.println("Digite um valor real : ");
		fracao = sc.nextDouble();

		sc.close();// encerrado o obj com o recurso de captura de dados scanner
		System.out.printf("Valor digitado : %s\nNúmero Inteiro: %d\nNúmero Fracionado : %.2f", msg, numero, fracao);
		
		
		/*
		 Pegando apenas um caractere
		 
		 char y;
		 
		 y = sc.next().charAt(0);
		 
		 
		 */
	}

}
