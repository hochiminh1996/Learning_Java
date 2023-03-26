package Aula_11_while;

import java.util.Locale;
import java.util.Scanner;

public class Aula_02_while {
	/*
	  É uma estrutura de controle de fluxo que repete um bloco de compando enquanto
	  uma condição for verdadeira. Ela é usada quando não sabemos o número exato de
	  repetições.
	  
	  Passamos uma variável, o contador, junto a uma condição. Nesse caso, enquanto
	  a condição for verdadeira, ele irá percorrer o loop e suas mensagens. Quando
	  for false, ele encerra
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double n =0, soma=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
//			usaremos o while porque não sabemos a quantidade repetição
			System.out.println("Digite um número:");
			n = sc.nextDouble();
			
			soma+=n;//acumulador
			
			//se digitar zero, encerra e soma os valores
			if(n == 0 || n==0.00) {
				//encerra quando for digitado zero
				
				System.out.printf("Soma dos números digitados é : %.2f", soma);
				sc.close();
				
				break;
				
				
			}
		}
		
		
		

	}

}
