package Aula_02_composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) throws ParseException {
		ArrayList<Worker> listWorker = new ArrayList<>();

		Locale.setDefault(Locale.US);

		JOptionPane.showMessageDialog(null, Integer.parseInt("20/33".substring(3)));


		Scanner sc = new Scanner(System.in);
		// entrada

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// formato para datas

		System.out.print("Quantos trabalhadores?");
		int n = sc.nextInt();

		for (int j = 1; j <= n; j++) {
			sc.nextLine();
			// dados de entrada
			System.out.print("Entre com o nome do departamento #"+j+":");
			String departamento = sc.nextLine();

			System.out.println("Dados do trabalhador:");
			System.out.print("Nome:");
			String name = sc.nextLine();

			System.out.print("Nível:");
			String level = sc.nextLine();

			System.out.print("Salário base:");
			double salario_base = sc.nextDouble();

			Worker trabalhador = new Worker(name, WorkerLevel.valueOf(level), salario_base,
					new Departament(departamento));
			// instânciando um objet e passando o nome, enum, salario base e departamento

			System.out.println("Quantos contratos?");
			int quant = sc.nextInt();

			for (int i = 1; i <= quant; i++) {
				System.out.println("Contato #" + i + ":");

				System.out.print("Data(DD/MM/YYYY):");
				Date contractDate = sdf.parse(sc.next());

				System.out.print("Valor por hora:");
				double valor_hora = sc.nextDouble();

				System.out.print("Horas trabalhadas:");
				int hours = sc.nextInt();

				HourContract hora_contrato = new HourContract(contractDate, valor_hora, hours);
				trabalhador.addContract(hora_contrato);
				System.out.println();

			}
			listWorker.add(trabalhador);

		}
		System.out.print("Entre com mês e ano para verificar os ganhos (MM/YYYY):");
		String monthYear = sc.next();// string com a data

		int month = Integer.parseInt(monthYear.substring(0, 2));// pegando o MM
		int year = Integer.parseInt(monthYear.substring(3));// pegando tudo apos o 3

		
		for (Worker w : listWorker) {
		    // Verificar se o trabalhador possui contratos no mês e ano especificados

			boolean hasContractsInMonthYear = false;

			for (HourContract contract : w.getContracts()) {

				Calendar cal = Calendar.getInstance();
				cal.setTime(contract.getDate());

				int contractMonth = cal.get(Calendar.MONTH) + 1; // Adicionar +1, pois o Calendar.MONTH retorna um valor
																	// de 0 a 11
				int contractYear = cal.get(Calendar.YEAR);

				//SE ENCONTRAR 
				if (contractMonth == month && contractYear == year) {
					hasContractsInMonthYear = true;//TROCA PARA VERDADEIRO
					break;//ENCERRA
				}
			}

			// Se o trabalhador possui contratos no mês e ano especificados, exibir as informações
			if (hasContractsInMonthYear) {//SE FOR VERDAEIRO
				System.out.println("Nome do trabalhador: " + w.getName());
				System.out.println("Departamento: " + w.getDepartament().getName());
				System.out.println("Renda no mês " + monthYear + ": " + String.format("%.2f", w.income(year, month)));
				System.out.println();
			}
		}

		sc.close();
	}

}
