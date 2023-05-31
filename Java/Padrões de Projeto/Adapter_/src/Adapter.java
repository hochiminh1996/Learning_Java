//classe adapter atua como uma camada intermediária que traduz as chamadas de um 
//formato para outro, facilitando a interação entre os objetos.
public class Adapter implements Impressora {
	private Printer printer;// referência p/ o obj printer
	
	public Adapter(Printer txt) {
		this.printer = txt;//recebe um objeto do tipo printer
	}
	// implementação do método esperado pela interface
	public void imprimir(String txt) {
		printer.print(txt);
		//aqui estamos acessando o objeto legado e passando um valor a ser impresso.
	}

}