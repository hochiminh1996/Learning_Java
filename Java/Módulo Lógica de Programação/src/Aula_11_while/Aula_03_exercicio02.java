package Aula_11_while;

import java.util.Locale;
import java.util.Scanner;

public class Aula_03_exercicio02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double x=0,y=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite o X:");
			x = sc.nextDouble();
			
			System.out.println("Digite o Y:");
			y = sc.nextDouble();
			
			if(x == 0 || y == 0) {
				System.out.printf("Origem: X = %.2f Y = %.2f\nEncerrando...\n",x,y);

				break;
			}else {
				if(x>0 && y>0) {
					System.out.printf("Primeiro Quadrante: X = %.2f Y = %.2f\n\n",x,y);
				}else if(x<0 && y>0) {
					System.out.printf("Segundo Quadrante: X = %.2f Y = %.2f\n\n",x,y);
				}else if(x<0 && y<0) {
					System.out.printf("Terceiro Quadrante: X = %.2f Y = %.2f\n\n",x,y);
				}else if(x>0 && y<0) {
					System.out.printf("Quarto Quadrante: X = %.2f Y = %.2f\n\n",x,y);
				}
				
			}	
		}
		sc.close();

		
		
	}
}
