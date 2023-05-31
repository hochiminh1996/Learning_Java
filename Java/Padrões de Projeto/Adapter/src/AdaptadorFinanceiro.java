import java.security.Principal;

public class AdaptadorFinanceiro extends Financeiro {
	Program quantiaEmAdaptacao = null;

	public AdaptadorFinanceiro(Program quantiaEmAdaptacao) {
		super();
		this.quantiaEmAdaptacao = quantiaEmAdaptacao;
	}
	
	public float quantia(float quantiaOriginal, float numAnos, float taxaJuros) {
		return quantiaEmAdaptacao.calcularValor(super.getQuantiaOriginal(), super.getNumAnos(), super.getTaxaJuros());
	}
}
