package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	private static SimpleDateFormat sdf = new SimpleDateFormat("mm/DD/yyyy");
	// está static p/ não ficar instanciado um sdf toda vez que um objeto
	// reservation é criado. Irá fazer apenas uma vez.

	public Reservation() {
	}

	public Reservation(Integer roomNumber, Date checkin, Date checkou) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkou;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public long duration() {
		// long é um inteiro maior

		long diff = checkout.getTime() - checkin.getTime();
		// diferença entre as duas datas. Retorná um valor em milissegundos

		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		// converte o milissegundos em dias. (timeUnit classe java)

	}

	public void updateDates(Date checkin, Date checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Quarto: " + getRoomNumber() + ", entrada: " + sdf.format(getCheckin()) + ", saída: "
				+ sdf.format(getCheckout()) + ", noites: " + duration() + "\n");

		return sb.toString();
	}
}
