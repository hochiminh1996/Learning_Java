package Aula_04_Scanner_Next_Line;

import java.util.Locale;
import java.util.Scanner;

/*
  Quando você utiliza um comando de leitura diferente do nextLine() e
  dá alguma quebra de linha (um enter), essa quebra de linha fica "pendente"
  E,  se tiver alguma  entrada de dados em seguida, o caractere de enter 
  ficará armazenado na variável seguite.
  
 Por exemplo, se o usuário inserir "10" seguido de uma tecla "Enter",
  o método nextInt() lerá o número "10", mas deixará o caractere de 
  nova linha (\n) pendente na entrada. Em seguida, se tentarmos ler 
  uma linha inteira com o método nextLine(), ele lerá a entrada pendente 
  do caractere de nova linha e retornará uma linha vazia, ignorando 
  qualquer entrada que o usuário possa ter digitado depois do número.

 Para resolver, basta digitar sc.nextLine() após qualquer método de entrada
 que não seja o nextLine, ou seja, o next, nextFloat ou NextIint
 
 */

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		String msg1, msg2;
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor");
		n = sc.nextInt();
		sc.nextLine(); // VAI CONSUMIR O "enter" que ficou no buffer do nextInt

		System.out.printf("Frase A :");
		msg1 = sc.nextLine();

		System.out.printf("Frase B :");
		msg2 = sc.nextLine();

		/*
		 * nextLine : possibilita que vocÊ digite uma frase com espaço, sem que o espaço
		 * seja jogado na variável da próxima linha
		 */

		sc.close();

		System.out.printf("Frase A : %s\nFrase B : %s\nNúmero Digitado : %d", msg1, msg2,n);

	}
}
