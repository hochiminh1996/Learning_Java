package Aula_06_Exercicios;

import java.util.Locale;
import java.util.Scanner;

// Calcular o raio
public class Exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		double raio, pi, area;

		pi = 3.14159;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do Raio:");
		raio = sc.nextDouble();

		area = pi * Math.pow(raio, 2);

		sc.close();
		
		
		System.out.printf("Área : %.4f", area);
	}

}
