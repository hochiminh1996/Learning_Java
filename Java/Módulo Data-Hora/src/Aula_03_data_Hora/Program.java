package Aula_03_data_Hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2023-05-01");
		
		LocalDateTime d05 = LocalDateTime.parse("2023-05-01T22:12:20");
		
		Instant d06 = Instant.parse("2023-05-01T01:12:20Z");
		//A letra "Z" no final da string de data e hora representa o fuso horário UTC (Tempo Universal Coordenado), também conhecido como GMT
		
		ZoneId.getAvailableZoneIds();
		//retorna uma coleção com os nomes dos fusos horários customizados
		
		
		LocalDate conver = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		//Converte a data Universal p/ a data local.O ZoneId.SystemDefault() pega o fuso do computador.
		
		
		LocalDate conver1 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		//Converte a data Universal p/ o data de Portugal.Lembre-se : há uma lista de fusos no ZoneId

		
		LocalDateTime conver3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		// Convertendo a data/hora universal p/ local, com base no fuso do computador
		
		LocalDateTime conver4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		// Convertendo a data/hora universal p/ a data/hora de Portugal, com base no fuso do computador
		System.out.println(conver4);
		
		
		System.out.println(d05.getDayOfMonth());
		//Pegando o dia de uma data passada (numérico).
		
		System.out.println(d05.getMonthValue());
		//Pegando o mês de uma data (numérico)
		
		System.out.println(d05.getYear());
		//Pegando o ano de uma data.
		
		System.out.println(d05.getHour());
		//Pegando a hora
		
		System.out.println(d05.getMinute());
		//Pegando os minutos
		
		System.out.println(d05.getSecond());
		//Pegando os segundos
		
		
	}

}
