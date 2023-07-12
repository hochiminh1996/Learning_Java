package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.printf("Número do quarta: ");
			Integer number = sc.nextInt();

			System.out.print("Data de entrada(dd/mm/yyyy):");
			Date checkin = sdf.parse(sc.next());

			System.out.print("Data de saída(dd/mm/yyyy):");
			Date checkout = sdf.parse(sc.next());

			Reservation reservation = new Reservation(number, checkin, checkout);

			System.out.println("Reserva: " + reservation);

			System.out.println("Entre com a data de reserva atualizada");

			System.out.print("Data de entrada(dd/mm/yyyy):");
			checkin = sdf.parse(sc.next());

			System.out.print("Data de saída(dd/mm/yyyy):");
			checkout = sdf.parse(sc.next());

			reservation.updateDates(checkin, checkout);

			System.out.println("Reserva: " + reservation);
		} catch (ParseException e) {
			System.out.println("Erro:" + e.getMessage());

		} // classe especifica para personalizar exceções
		catch (DomainException e) {
			System.out.println(e.getMessage());

			// estudar os tipos de exceções
		} catch (Exception e) {
			// irá capturar qualquer erro genérico. Exception é uma classe mãe genérica. Que
			// está usando o conceito de upcast para capturar os mais variados tipos de
			// exceções
			System.out.println("Erro: " + e.getLocalizedMessage());
		}
		sc.close();
	}

}
