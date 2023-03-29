package Aula_13_do_While;

import java.util.Scanner;

public class Aula_01_do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  Do While executa um código ao menos uma vez, 
		  já que o teste lógico é no final
		  
		 */
		
		String s = "";
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Deseja continuar?");
			s = sc.next();
			
		}while(!s.equals("não"));
		
		sc.close();
		
		
	}

}
