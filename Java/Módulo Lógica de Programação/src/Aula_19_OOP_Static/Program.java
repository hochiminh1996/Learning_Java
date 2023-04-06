package Aula_19_OOP_Static;

import java.util.Locale;
import java.util.Scanner;

public class Program {

//	Resumo
	/*Um método estático é aquele que você não precisa instanciar para usar
	 Se você está trabalhando na main, e deseja criar alguns métodos
	 Necessariamente eles terão que ser static. Afinal, apenas um método
	 estático pode chamar outro.
	 
	 No caso de um Classe com métodos estaticos, temos a classe Math.
	 Se quiseremos calcular a raiz de um número, basta chamar o nome da classe
	 e adicionar o método que deseja usar : Math.sqtr();
	 
	 Observe que não foi necessário criar um objeto para usar um método estatíco
	 Apenas colocamos o seu nome e acionamos o método.
	 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio :");
		double raio = sc.nextDouble();
		
		
		
		System.out.println(String.format("Raio : %.2f", Calculator.circumference(raio)));
		System.out.println(String.format("Volume : %.2f", Calculator.volume(raio)));
		System.out.println("PI : "+Calculator.PI);
		sc.close();
		
	}

}
