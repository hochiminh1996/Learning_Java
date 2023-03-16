package Aula_06_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int numFuncionario;
		double horas, recebeHora;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número do funcionário:");
		numFuncionario = sc.nextInt();
		
		System.out.println("Horas trabalhada:");
		horas = sc.nextDouble();
		
		System.out.println("Valor recebido por hora");
		recebeHora = sc.nextDouble();
		
		
		sc.close();
		
		System.out.printf("Número do funcionário : %d\nSalário : %.2f", numFuncionario,
				horas * recebeHora);
		
		
		
		

	}

}
