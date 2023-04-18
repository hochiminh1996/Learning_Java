package Aula_13_for_each;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Foreach é o nosso laço de repetição utilizado para percorrer vetores
		 * ou objetos
		 * */
		
		String[] paises = new String[] {"Brasil", "Rússia", "Índia", "China"};
		
		
		/*
		 * Estrutura:
		 * tipo apelido : vetor
		 * */
		for(String p:paises) {
			System.out.println(p);
		}
		
		
	}

}
