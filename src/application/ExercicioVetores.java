package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ExeVetores;

public class ExercicioVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		ExeVetores[] vect = new ExeVetores[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		sc.nextLine();
		for (int i=1; i<=n; i++) {	
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();			
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new ExeVetores(name, email);
			sc.nextLine();
		}
		System.out.println();
		System.out.println("Quartos alugados: ");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
