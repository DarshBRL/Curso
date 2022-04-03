package application;

import java.util.Locale;
import java.util.Scanner;
	//programa principal
public class ValorRaio {
	/*declaração da constante PI
	 * final serve para fazer a variavel virar uma constante 
	 * nao pode ser mudado o valor dela*/ 
	public static final double PI = 3.14159;
	//função main normal 
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		//circumference é uma função
		double c = circumference(radius);
		
		//volume é uma função
		double v = volume(radius);
		
		System.out.printf("Circuference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
				
		sc.close();
	}
	/*funçoes
	 * circumference vai retornar o valor double
	 * o radius é o argumento
	 * return retorna a forma da circuferencia
	 */
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
		//calcula o radius pq veio como argumento
	}
	/*funçoes
	 * volume vai retornar o valor double
	 * o radius é o argumento
	 * return retorna a forma do volume
	 */
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	/*temos q usar o "static" pq nosso "public static void" é Static
	 * o compilador vai reclamar o seguinte caso vc não use "static"
	 * vc nao pode chamar um metodo q nao é estatico dentro de um q é static
	 */
}
