package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ValorRaio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Na Classe "Calculator" eu vou dizer q minhas operaçoes serao
		 * Estaticos "static" por esse motivo nao vou precisar 
		 * instancia um objeto para depois chamar a operação 
		 * a parti do objeto Ex: calc.volume
		 */
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		/* eu tenho agora metodos Estaticos
		 * em vez de chamar o objeto "calc.circumference, calc.volume e
		 * calc.PI eu chamo a CLASSE Calculator
		 */
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		/*circuference e volume sao metodos
		 * PI é uma constante
		 */
		sc.close();
	}

}
