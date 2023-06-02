package Aula_02_composicao;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hours;

	// Construct
	public HourContract() {
	}

	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.hours = hours;
		this.valuePerHour = valuePerHour;

	}

	// methods
	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return this.date;
	}

	public void valuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Double getValuePerHour() {
		return this.valuePerHour;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Integer getHours() {
		return this.hours;
	}

	// totalvalue
	public Double totalValue() {
		return this.hours * this.valuePerHour;
	}

	@Override
	public String toString() {
		return "Data do contrato: " + getDate() + "\n" + "Horas: " + getHours() + "\n" + "Valor por horas: "
				+ getValuePerHour() + "\n" + "Valor total: " + totalValue();
	}

}
