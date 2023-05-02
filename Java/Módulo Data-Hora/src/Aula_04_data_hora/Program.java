package Aula_04_data_hora;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		// definindo uma data. Para pegar a data atual, apenas retire o parce e adiciona
		// .now();

		LocalDateTime d05 = LocalDateTime.parse("2023-05-01T22:12:20");
		// definindo uma data/hora.

		LocalDate pastWeekLocalDate = d04.minusDays(100);
		// Pegando a data em d04 menos 100 dias. Retorna uma data correspondente a - 100
		// dias : 2020-05-11.
		
		LocalDate pastWeekLocalDate2 = d04.minusDays(7);

		LocalDate nextWeekLocalDate = d04.plusDays(100);
		// Pegando a data em d04 e adicionando 100 dias. Retorna uma data correspondente
		// a + 100 dias : 2022-10-28.

		LocalDate nextYearsLocalDate = d04.plusYears(100);
		// Adicionando 100 anos com base no ano atual.

		LocalDateTime pastWeekDateTime = d05.plusDays(10);
		// Adicionando 10 dias, só que dessa vez considerando data/hora. Funciona com
		// Dias, anos, meses, horas...

		Duration t1 = Duration.between(LocalDateTime.now(), pastWeekDateTime);
		Duration t2 = Duration.between(pastWeekLocalDate2.atStartOfDay(), d04.atStartOfDay());
		
		// irá pegar a diferença entre duas datas/horas. Data atual e data passada.
		System.out.println(t1.toDays());// irá retornar a diferença de dias.
		System.out.println(t2.toDays());

					
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);
		System.out.println(nextYearsLocalDate);
		System.out.println(pastWeekDateTime);
	}

}
