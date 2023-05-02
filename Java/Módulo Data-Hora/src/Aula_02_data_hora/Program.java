package Aula_02_data_hora;

import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) {
		LocalDate data_atual = LocalDate.now();
		LocalDateTime data_atual1 = LocalDateTime.now();
		
		LocalDate d04 = LocalDate.parse("2023-05-01");
		//passando uma string que retorna um obj data.
		
		LocalDateTime d05 = LocalDateTime.parse("2023-05-01T00:23:23");
		//Pegando data/hora/min/seg
		
		Instant d06 = Instant.parse("2023-05-01T00:23:23Z");
		//Z -> informando que é o horário de Londres.
		
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		System.out.println("D04 : "+ data_atual.format(fm1));//formatando data atual
		System.out.println("D05 : "+ data_atual1.format(fm2));//formatando data hora atual
		
		System.out.println("Data  passada : "+ d05.format(fm2));
		
		
		
		
		
		
	}
}
