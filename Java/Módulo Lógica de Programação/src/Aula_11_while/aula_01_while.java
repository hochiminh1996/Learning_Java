package Aula_11_while;

public class aula_01_while {
	public static void main(String[] args) {

		int i = 0;

		/*
		  É uma estrutura de controle de fluxo que repete um bloco de compando enquanto
		  uma condição for verdadeira. Ela é usada quando não sabemos o número exato de
		  repetições.
		  
		  Passamos uma variável, o contador, junto a uma condição. Nesse caso, enquanto
		  a condição for verdadeira, ele irá percorrer o loop e suas mensagens. Quando
		  for false, ele encerra
		 */

		while (i < 10) {

			System.out.println(i);
			i++;
		}

	}
}
