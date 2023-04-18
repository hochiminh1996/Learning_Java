package Aula_12_boxing_unboxing;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		  É o processo de conversão de um objeto tipo valor para um objeto tipo
		  referência compatível
		 */
		//Exemplo de boxing
		int x = 20;
		
		Object obj = x;
		
		//Teremos um objeto que irá apontar para o valor 20 dentro do heap
		System.out.println(obj);
		
//		Exemplo de unboxing
		
		int y = (int) obj;
		//feito o casting para converter de objet para inteiro
		
		
		System.out.println(y);
		
	}

}
