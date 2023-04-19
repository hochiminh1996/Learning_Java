package Aula_14_lista;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		/*
		 *  
		 * Lista é uma estrutura de dados homogênea, ou do mesmo tipo. 
		 * Listas são ordenadas -> acessados através de sua posição Inicia vazia e seus elementos
		 * são alocados sob demanda. Ou seja, é diferente de um vetor, onde você precisa
		 * definir o tamanho dele Cada elemento ocupa um "nó" (ou nodo). 
		 * 
		 * Além disso, cada nodo aponta para o próximo elemento, isso é chamado de lista encadeada.
		 * 
		 * ->Desvantagens Acesso sequencial
		 * 
		 * ->Vantangens Tamanho variável Facilitade de inserção e deleção
		 * 
		 *
		 * Observe que as vantagens da lista, ou list, é justamente os pontos negativos de 
		 * um array
		 */

		List<String> l = new ArrayList<>();
		/*
		 * List é uma interface de implementação. 
		 * Integer é uma wrapper class que representa valores inteiros (int).
		 * Estamos usando um Wrapper class pq a interface list NÃO ACEITA 
		 * valores primitivos (int, double...), apenas classes equivalentes aos valores
		 * primitivos (Integer, Number, Double...)
		 * */
		
		l.add("Felippe");
		l.add("Pedor");
		l.add("África do Sul");
		l.add(2, "China");
		l.add("Bielorússia");
		l.add("Argentina");
		l.add("Rússia");
		//adicionando elementos
		
		l.remove("Felippe");
		//removendo elemento com base em valor
		
		l.remove(0);
		//removendo elemento com base no indice
		
		for(String nomes:l) {
			System.out.println(nomes);
		}
		System.out.println("---------------------------------------");
		System.out.println(l.size());
		//retorna o tamanho da lista
		
		l.removeIf(x -> x.charAt(0) == 'B');
		//remove elementos que comecem com B
		
		for(String nomes:l) {
			System.out.println(nomes);
		}
		
		//Localizando a posição de um elemento.
		
		System.out.println(l.indexOf("China"));
		
		
		
		String pais = l.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		//Localizando o 1º elemento que começa com uma letra especifica. Se não encontrar, retorne null.
		
		
		System.out.println(pais);
		
		
		
		
	}

}
