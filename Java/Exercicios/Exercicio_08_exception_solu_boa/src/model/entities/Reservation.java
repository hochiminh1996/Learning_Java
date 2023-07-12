package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// está static p/ não ficar instanciado um sdf toda vez que um objeto
	// reservation é criado. Irá fazer apenas uma vez.

	public Reservation() {
	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) throws DomainException {
		// tratamento de exceções no construtor: programação defensiva. Vai lançar a
		// exceção para a classe DomainException
		if (!checkout.after(checkin)) {
			throw new DomainException("Erro: data de saída deve ser superior ao de entrada");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
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
		long diff = checkout.getTime() - checkin.getTime();
		// .getTime pega a diferença em milessegundos entre data de entrada e saída

		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		// TimeUnit converte os milesegundos em dias
	}

	public void updateDates(Date checkin, Date checkout) throws DomainException {

		Date now = new Date();

		if (checkin.before(now) || checkout.before(now)) {
			throw new DomainException("Erro: atualização de datas para reservas devem ser futuras.");
		}

		if (!checkout.after(checkin)) {
			throw new DomainException("Erro: data de saída deve ser superior ao de entrada");
		}

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
