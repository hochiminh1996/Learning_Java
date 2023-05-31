
public class Program {
	public static void main(String[] args) {
		Printer printer = new Printer();// instanciando a classe legada printer
		
		Impressora adapter = new Adapter(printer);
		// A classe adapter, que é do tipo "impressora",  irá receber uma instância do
		// objeto legado (printer). Para permitir o acesso ao método dessa classe
		
		adapter.imprimir("Padrão adapter");
		//aqui estamos usando o método definido pela interface. E, usando-o como ponto, acessando
		//o método print da classe printer

	}
}
