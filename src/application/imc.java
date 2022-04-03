package application;
import java.util.Locale;
import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("sua altura ?");
		double altura = sc.nextDouble();
		System.out.println("peso ?");
		double peso = sc.nextDouble();
		
		double calc = peso / (altura * altura);
		
		System.out.printf("%.2f%n",calc);
			
		if(calc < 18.50) {
			System.out.println("Abaixo do peso");
		}
		else if ( calc > 18.50 && calc < 24.99 ) {
			System.out.println("Peso Normal");
		}
		else if ( calc > 25.00 && calc < 29.99) {
			System.out.println("Pré-obesidade");
		}
		else if ( calc > 30.00 && calc < 34.99) {
			System.out.println("Obesidade Grau 1");
		}
		else if ( calc > 35.00 && calc < 39.99) {
			System.out.println("Obesidade Grau 2");
		}
		else {
			System.out.println("Obesidade Grau 3");
		}
		
		sc.close();
	}

}
