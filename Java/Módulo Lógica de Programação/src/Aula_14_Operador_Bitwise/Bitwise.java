package Aula_14_Operador_Bitwise;

public class Bitwise {

	public static void main(String[] args) {
		// Os operadores bitwise comparam digito por digito. É uma "versão
		// dos operadores lógicos,só que para bit a bit
		
		
		/*
		 & => Só é verdadeiro se todos forem verdadeiro.
		 | => Só é verdeideiro se ao menos um for verdeiro
		 ^: (xor => ou exclusivo). Só é verdadeiro se apenas um for verdeiro
		 . E, diferente do  |, se tiver V | V, ele retorna false
		  
		  
		  A:(89) 0101 1001
		  B:(60) 0011 1100
		  
		  Vamos comparar digito por digito em A e B. Começando por &, da direita para a esquerda
		  A & B
		  0001 1000 (24)
		  
		  A | B
		  0111 1101 (125)
		  
		  A ^ B
		  0110 0100 (101)
		  
		  
		 */
		
		int n1 = 89;//passamos um valor decimal, mas o computador irá ler binário e fará a comparação digito por digito
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
	}

}
