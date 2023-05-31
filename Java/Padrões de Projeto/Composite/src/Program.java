
public class Program {

	public static void main(String[] args) {
		Funcionario gerente = new Gerente("Felippe Marques");
		Funcionario caixa = new Caixa("Felippe Silva");
		Funcionario atendente = new Atendente("Diego Marques");

	    gerente.adicionar(gerente);
	    gerente.printNomeDoFuncionario();
	    
	    
	    caixa.adicionar(caixa);
	    caixa.printNomeDoFuncionario();
	    
	    atendente.adicionar(atendente);
	    atendente.printNomeDoFuncionario();
	
	}

}
