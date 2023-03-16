package Aula_02_Casting;

import java.util.Locale;


// calculo do trapézio
// casting é conversão de tipo de dado
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
//		Fórmula area = (b + B)/2 * h
		
		double area, b, B, h;
		
		b = 6;
		B = 8;
		h = 5;
		
		area = (b + B) / 2 * h;
		// fórmula
		
		System.out.printf("Área do trapézio : %.2f\n\n",area);
		
		
		int n1 = 5, n2 = 2;
		double media;
		
		media = (double) n1 / n2;
		//casting => permite uma divisão fracionada. Já que n1/n2 é um valor real
		
		System.out.println("Média : "+media);//vai retornar um inteiro
		
		
		
		
		
		
		

	}

}
