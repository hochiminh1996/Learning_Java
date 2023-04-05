package Aula_15_Strings;

public class Aula_01_Strings {
	public static void main(String[] args) {
		String nome = "Felippe Marques       ";
		String paises = "Brasil Rússia India China";
		
		
		// transforma em minúsculo
		String s01 = nome.toLowerCase();
		
		String s02 = nome.toUpperCase();
		// transforma em maiusculo
		
		String s03 = nome.trim();
		//remove os espaçços em branco
		
		String s04 = nome.substring(0,7);
		//pega um valor, na string, de acordo com as posições (inicio,fim)
		
		String s05  = nome.replace(" ", "-");
		//substituindo valores encontrados
		
		int s06 = nome.indexOf("Fe");
		//pega a posição do valor desejado
		
		String[] vect = paises.split(" ");
		//split vai cortar uma string e transforma-lá em um vetor. Onde cada posição será
		//definida a partir do space. Ou seja, teremos um elemento a cada espaço
		
		
		
		System.out.println("Origin : -"+nome+"-");
		System.out.println("Lower:"+s01+"-");
		System.out.println("Upper:"+s02+"-");
		System.out.println("trim:"+s03+"-");
		System.out.println("Recuperando String:"+s04);
		System.out.println(s05);
		System.out.println(s06);
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		
//		Seção string
		
	
		
		
		
	}
}
