
public class Program {

	public static void main(String[] args) {
		CarroRoubado carroRoubado = new CarroRoubado();
		//Observado
		
	    CarroPolicia carroPolicia1 = new CarroPolicia("Viatura 01");
	    //Observador 1
	    
	    CarroPolicia carroPolicia2 = new CarroPolicia("Viatura 02");
	    //Observador 2

		//os observadores devem conhecer o objeto de interesse. Vamos adicionar o observador(policia) ao observado(ladrao)
	    carroRoubado.adicionarObservador(carroPolicia1);
	    carroRoubado.adicionarObservador(carroPolicia2);

	    
	    //o observador se orientará pelos movimentos do observado
	    carroRoubado.frente();
	    carroRoubado.direita();
	    carroRoubado.esquerda();
	    carroRoubado.para();

	}

}
