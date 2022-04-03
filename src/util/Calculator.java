package util;
//Classe normal
public class Calculator {
	/*Colocando static na minha operaçoes elas vao poder
	 * ser calculado independente de um objeto no meu programa
	 */
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
