package Aula_08_exercicios_if;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double n1, n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota 01:");
		n1 = sc.nextDouble();
		
		System.out.println("Nota 02:");
		n2 = sc.nextDouble();
		
		if((n1 + n2) /2 >=60) {
			System.out.printf("Média : %.2f\nSituação : Aprovado", (n1 + n2) /2);
		}else {
			System.out.printf("Média : %.2f\nSituação : Reprovado", (n1 + n2) /2);
		}
		
		
		sc.close();
	}

}
