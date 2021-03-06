package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("digite a medida do tri?ngulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("digite a medida do tri?ngulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double P = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(P * (P - x.a) * (P - x.b) * (P - x.c));
		
		P = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(P * (P - y.a) * (P - y.b) * (P - y.c));
		
		
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
