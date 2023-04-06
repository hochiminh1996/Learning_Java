package Aula_18_OOP_static;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio :");
		double raio = sc.nextDouble();
		
		
		Calculator c = new Calculator();
		
		System.out.println(String.format("Raio : %.2f", c.circumference(raio)));
		System.out.println(String.format("Volume : %.2f", c.volume(raio)));
		System.out.println("PI : "+c.PI);
		sc.close();
		
	}

}
