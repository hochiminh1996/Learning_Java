package Application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
/*
 * Utilizando métodos e atributos estáticos. 
 * Observe que não estamos instanciando um objeto para efetuar o cálculo.
 * */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a cotação do dolar");
		double dolar = sc.nextDouble();
		
		System.out.println("Quando dólar você irá comprar?");
		double comprar = sc.nextDouble();
		
		System.out.println("Valor : R$ "+CurrencyConverter.converter(dolar, comprar));
		
		sc.close();
		
	}
}
