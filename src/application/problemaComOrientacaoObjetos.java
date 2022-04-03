package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class problemaComOrientacaoObjetos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("digite a medida do tri�ngulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("digite a medida do tri�ngulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();
				
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