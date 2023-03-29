package Aula_13_do_While;

import java.util.Locale;
import java.util.Scanner;

public class Aula_02_do_while_ex {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String msg = "";
		double fat = 0, celcius=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			
			System.out.println("Digite o valor em Celcius:");
			celcius = sc.nextDouble();
			
			fat = celcius * 1.8 + 32;
			
			System.out.printf("Conversão : \nCelcius (%.2fºC) => Fahrenheit (%.2fºF)\n", celcius, fat);
			
			System.out.println("\nDeseja continuar?");
			msg = sc.next();			
		} while (!msg.equals("Não"));
		
		System.out.println("Encerrando...");
		sc.close();
	}
}
