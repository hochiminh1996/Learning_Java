
public class Program {

	public static void main(String[] args) {
		FabricaAnimal fabrica = new FabricaAnimal();

		Animal cachorro = fabrica.criarAnimal("cachorro");
		cachorro.fazerBarulho();

		Animal gato = fabrica.criarAnimal("gato");
		gato.fazerBarulho();

		// lançará uma exceção devido ao tipo de animal desconhecido
		Animal animalDesconhecido = fabrica.criarAnimal("peixe");

	}

}
