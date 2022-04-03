package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ValorRaio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Para usar as opera�oes da Classe "Calculator"
		 * sou obrigado a instanciar o objeto
		 * da classe Calculator */	
		Calculator calc = new Calculator();
		// calc � um objeto | new Calculator � a forma de instancia
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		//calc.circumference estou chamando as opera�oes do objeto calc
		double c = calc.circumference(radius);
		//calc.volume estou chamando as opera�oes do objeto calc
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		//calc.PI estou chamando as opera�oes do obejeto calc
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();
	}	
}
