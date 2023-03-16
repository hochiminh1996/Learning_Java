package Aula_01_conceitos;
import java.util.Locale;

// nossa classe principal
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// Configurando para o separador de vírgula .
		
		//variáveis
		String nome = "Felippe";
		int idade = 25;
		double salario = 5200.00;
		
		
		System.out.printf("Nome : %s\nIdade : %d\nSalário : %.2f", nome, idade, salario);
		
		
		/*Marcadores: 
		 * %s = Sting
		 * %d = int
		 * %f = float
		 * %.2f = float com delimitação de casas decimais*/
		
	}

}


