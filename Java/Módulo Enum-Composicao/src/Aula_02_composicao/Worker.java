package Aula_02_composicao;

import java.util.ArrayList;
import java.util.Calendar;

public class Worker {
	// attributives
	private String name;
	private WorkerLevel nivel;
	private Double baseSalary;

	private Departament departament;// associação com outra classe
	private ArrayList<HourContract> contracts = new ArrayList<HourContract>();// associaçao com vários contratos
																				// (composiçaõ)

	// construct
	public Worker() {
	}

	public Worker(String name, WorkerLevel nivel, Double baseSalary, Departament departament) {
		this.name = name;
		this.nivel = nivel;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	// methods
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setWorkerLevel(WorkerLevel nivel) {
		this.nivel = nivel;
	}

	public WorkerLevel getWorkerLevel() {
		return this.nivel;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}

	public ArrayList<HourContract> getContracts() {
		return contracts;
	}

	public Double income(int year, int month) {
		double sum = getBaseSalary();

		Calendar cal = Calendar.getInstance();

		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);

			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}

		}

		return sum;
	}

}
