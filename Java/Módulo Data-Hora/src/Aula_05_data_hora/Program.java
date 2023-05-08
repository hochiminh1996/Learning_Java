package Aula_05_data_hora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {

		// definindo um padrão data/hora a partir da classe simpledaeformat
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// adicionado hora/min/seg

		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date x1 = new Date();
		// data atual

		Date y1 = sdf1.parse("08/05/2023");
		// O valor dado dentro do parse, string, irá retornar um objeto de data.
		Date y2 = sdf2.parse("08/05/2023 16:32:32");

		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		// DATA NO FORMATO NO FORMATO ISO NO PADRÃO UTC. Z=> NO PADRÃO UTC.Vai imprimir
		// com -3h,já que estamos no brasil e ele usa o local como referência

		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		// imprir a data no formato UTC 

		System.out.println("-----------------------------------");
		System.out.println("Horário do BRASIL:");
		System.out.println("Data atual : " + sdf2.format(x1));
		System.out.println("Y1 :" + sdf1.format(y1));
		System.out.println("Y2 :" + sdf2.format(y2));
		System.out.println("Y3 : "+ sdf2.format(y3));
		System.out.println("-----------------------------------");
		System.out.println("Horário do UTC:");
		System.out.println("Data atual : " + sdf3.format(x1));
		System.out.println("Y1 :" + sdf3.format(y1));
		System.out.println("Y2 :" + sdf3.format(y2));
		System.out.println("Y3 : "+ sdf3.format(y3));


	}

}
