package Aula_05_funcoes_matematicas;

import java.util.Locale;
import java.util.Scanner;

/* Funções matemáticas
 * 
 * Math.pow(base,expoete); potência
 * Math.abs(variavel); //retorna o valor absoluto
 * Math.sqrt(variavel); retorna a raiz quadrada
 * */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		int n1, n2, n3;
		double n4;

//		objecto de entrada

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para obter a raiz  quadrada");
		n1 = sc.nextInt();

		System.out.println("Digite a base");
		n2 = sc.nextInt();

		System.out.println("Digite o expoente");
		n3 = sc.nextInt();

		System.out.println("Digite um número negativo");
		n4 = sc.nextDouble();

		sc.close();// fechando o objeto que pega valores de entrada

		System.out.printf("Raiz quadrada de %d = %.2f\n", n1, Math.sqrt(n1));
		System.out.printf("Raiz de %d ^ %d = %.0f\n", n2, n3, Math.pow(n2, n3));
		System.out.printf("Valor absolute de %.2f = %.2f\n", n4, Math.abs(n4));
		
		
		int valor = 25;
		System.out.println(Math.sqrt(valor));
		
		
		
	}

}
