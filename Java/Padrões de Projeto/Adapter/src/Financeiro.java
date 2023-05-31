
public class Financeiro {
	private float quantiaOriginal;
	private float numAnos;
	private float taxaJuros;

	// calcula montade de juros simples
	public float quantia(float quantiaOriginal, float numAnos, float taxaJuros) {
		float valorFinal = quantiaOriginal * (1 + numAnos * taxaJuros);
		System.out.printf("Valor final: %.2f", valorFinal);
		return valorFinal;
	}

	public float getQuantiaOriginal() {
		return quantiaOriginal;
	}

	public void setQuantiaOriginal(float quantiaOriginal) {
		this.quantiaOriginal = quantiaOriginal;
	}

	public float getNumAnos() {
		return numAnos;
	}

	public void setNumAnos(float numAnos) {
		this.numAnos = numAnos;
	}

	public float getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(float taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

}
