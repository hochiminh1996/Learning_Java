package Aula_01_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
//	Existe uma ISO que padroniza a questão de dada é hora : iso 8601
	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//criando um objeto que definite um formato de data especifico
		
		LocalDate data_format = LocalDate.parse("30/04/2023", fmt1);
		//Aqui passamos uma string com a data no modo PT-BR e passamos tb o formato que queremos que aparece.
		//Se não for inserido o formato definido em fmt1, haverá um erro. Já que o valor da string estará fora do padrão
		
		System.out.println(data_format);
		
		LocalDate d01 = LocalDate.now();
		// pegando a data atual

		LocalDateTime d02 = LocalDateTime.now();
		// pegando a data/hora + segundos

		Instant d03 = Instant.now();
		// retorna a data do GMT ou UTC global;
		
		LocalDate d04 = LocalDate.parse("2023-04-30");
		//gerando um objeto data a partir de uma string
		
		
		Instant d05 = Instant.parse("2023-04-30T22:13:26Z");
		// 2023-04-30T22:13:26Z -> data/hora (minutos/segundos) -> Z é o horario de
		// Londres

		Instant d06 = Instant.parse("2023-04-30T22:13:26-03:00");
		// -03:00 está especificando o GMT. Nesse caso, ele vai pegar a data passada e
		// converter p/ o de Londres.
		

		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
	}

}
