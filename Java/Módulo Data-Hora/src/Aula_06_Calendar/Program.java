package Aula_06_Calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// nosso padrão de data

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		// gerando uma data no formato date.

		System.out.println(sdf.format(d));
		// adaptando a data ao formato

		// Chamando a classe calendar. Calendar é uma classe estática
		Calendar cal = Calendar.getInstance();

		cal.setTime(d);// inserindo a nossa data dentro do calendar. Ele vai trabalhar com essa
						// data/hora

		cal.add(Calendar.HOUR_OF_DAY, 4); // ADICIONADO 4h na data passada.

		d = cal.getTime();// atribuindo a nova data ao objeto data inicial

		System.out.println(sdf.format(d));// irá exibir a nova data/hora, com o acréscimo de 4h, no formato definido.

		// como podemos recurar os minutos/horas de uma data/hora
		int minuto = cal.get(Calendar.MINUTE);
		System.out.println(minuto);

		
		// pegando a hora
		int hour = cal.get(Calendar.HOUR);
		System.out.println(hour);

		
		//PEGANDO O MÊS
		int month = 1 + cal.get(Calendar.MONTH);// +1 pq o mês começa em zero no calendar.
		System.out.println(month);
	}
}
