package Aula_08_exercicios_if;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double n1,n2,n3, maior, menor;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("N1:");
		n1 = sc.nextDouble();
		
		System.out.println("N2:");
		n2 = sc.nextDouble();
		
		System.out.println("N3:");
		n3 = sc.nextDouble();

		if(n1 >= n2 && n1 >= n3) {
			maior = n1;
			//quando n1 for o maior número
			
			if(n2 >= n3) {
				menor = n3;
			}else {
				menor = n2;
			}
			
		}else if(n2 >= n1 && n2 >= n3) {
			maior = n2;
			
			if(n1 >=n3) {
				menor = n3;
			}else {
				menor = n1;
			}
		}else {
			maior = n3;
			
			if(n2 >= n1) {
				menor = n1;
			}else {
				menor = n2;
			}
		}
		
		System.out.printf("Maior número : %.2f\nMenor número : %.2f", maior,menor);
		
		sc.close();
	}

}
