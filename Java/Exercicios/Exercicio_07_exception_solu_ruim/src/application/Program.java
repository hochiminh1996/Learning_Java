package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.printf("Número do quarta: ");
		Integer number = sc.nextInt();

		System.out.print("Data de entrada(dd/mm/yyyy):");
		Date checkin = sdf.parse(sc.next());

		System.out.print("Data de saída(dd/mm/yyyy):");
		Date checkout = sdf.parse(sc.next());

		if (!checkout.after(checkin)) {
			System.out.println("Erro: data de saída deve ser superior ao de entrada");
		} else {
			Reservation reservation = new Reservation(number, checkin, checkout);

			System.out.println("Reserva: " + reservation);

			System.out.println("Entre com a data de reserva atualizada");

			System.out.print("Data de entrada(dd/mm/yyyy):");
			checkin = sdf.parse(sc.next());

			System.out.print("Data de saída(dd/mm/yyyy):");
			checkout = sdf.parse(sc.next());

			String error = reservation.updateDates(checkin, checkout);

			if (error != null) {
				System.out.println(error);
			} else {
				System.out.println("Reserva: " + reservation);

			}

		}

		sc.close();
	}

}
