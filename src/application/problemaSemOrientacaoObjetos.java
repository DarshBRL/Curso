package application;

import java.util.Locale;
import java.util.Scanner;

public class problemaSemOrientacaoObjetos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("digite a medida do triângulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("digite a medida do triângulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		double P = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(P * (P - xA) * (P - xB) * (P - xC));
		
		P = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(P * (P - yA) * (P - yB) * (P - yC));
		
		
		System.out.printf("triangulo da area X: %.4f%n", areaX);
		System.out.printf("triangulo da area Y: %.4f%n", areaY);
			
		if(areaX > areaY) {
			System.out.println("Largura area: X");
		}
		else {
			System.out.println("Largura area: Y");
		}
		
		sc.close();
	}

}