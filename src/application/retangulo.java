package application;
import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe a base");
		double base = sc.nextDouble();
		System.out.println("informe a altura");
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = 2.0 * (base + altura); //base * 2.0 + altura * 2.0
		double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		//diagonal = Math.sqrt(base * base + altura * altura);
		
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMENTO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		sc.close();
	}

}
