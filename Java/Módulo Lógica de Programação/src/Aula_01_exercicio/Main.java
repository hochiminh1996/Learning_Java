package Aula_01_exercicio;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
//		separador de caracter via .
		
		String product1 = "Computer";
		String product2 = "Office Desk";
//		Duas string
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
//		Dois int e um char
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.23456;
		
		System.out.printf("Produtos:\nNome_Produto : %s\nPreço : %.2f\n\n"
				+ "Nome_Produto : %s\nPreço : %.2f\n\n", product1, price1, product2, price2);
		
		System.out.printf("Registro : %d anos, código %s e gênero %s\n\n", age, code, gender);
		
		System.out.printf("Medir : %.8f\nMedir : %.3f\nMedir : %.2f", measure, measure, measure);
		
				
	}
}
