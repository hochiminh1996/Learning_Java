package Aula_19_OOP_Static;

public class Calculator {
	public static final double PI = 3.14159;
	// nosso atributo PI é static. Já q será igual independente do calculo
	
	
	//método estático
	public static double circumference(double raio) {
		return 2 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4 * PI * raio * raio * raio / 3;
	}
	
	
}
