package Aula_12_for;

import java.util.Locale;
import java.util.Scanner;

public class Aula_02_for_uso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int n, soma=0,n1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas repetições?");
		n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			n1 = sc.nextInt();
			
			soma+=n1;
		}
		System.out.printf("Resultado : %d", soma);
		
		sc.close();
	}

}
