package application;

import java.util.Locale;
import java.util.Scanner;
	//programa principal
public class ValorRaio {
	/*declara��o da constante PI
	 * final serve para fazer a variavel virar uma constante 
	 * nao pode ser mudado o valor dela*/ 
	public static final double PI = 3.14159;
	//fun��o main normal 
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		//circumference � uma fun��o
		double c = circumference(radius);
		
		//volume � uma fun��o
		double v = volume(radius);
		
		System.out.printf("Circuference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
				
		sc.close();
	}
	/*fun�oes
	 * circumference vai retornar o valor double
	 * o radius � o argumento
	 * return retorna a forma da circuferencia
	 */
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
		//calcula o radius pq veio como argumento
	}
	/*fun�oes
	 * volume vai retornar o valor double
	 * o radius � o argumento
	 * return retorna a forma do volume
	 */
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	/*temos q usar o "static" pq nosso "public static void" � Static
	 * o compilador vai reclamar o seguinte caso vc n�o use "static"
	 * vc nao pode chamar um metodo q nao � estatico dentro de um q � static
	 */
}
