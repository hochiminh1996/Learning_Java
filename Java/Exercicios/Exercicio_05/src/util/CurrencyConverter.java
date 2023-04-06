package util;

public class CurrencyConverter {
	public static final double imposto = 0.06;

	public static double converter(double cotacao, double valor) {
		valor = +valor * cotacao;
		return valor + (valor * imposto);
	}

}
