package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados :");
		Aluno student = new Aluno(
				sc.next(),
				sc.nextDouble(),
				sc.nextDouble(),
				sc.nextDouble()
				);
		
		if(student.finalGrade()>=60) {
			System.out.println("Aprovado :" +student.toString());
		}else {
			System.out.println("Reprovou por "+student.pontoFaltante() + " pontos");
		}
		
		
		
		sc.close();
		
		
		
		
		
	}

}
