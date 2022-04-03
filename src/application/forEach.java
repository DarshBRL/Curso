package application;

import java.util.Locale;
import java.util.Scanner;

public class forEach {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"Maria","Bob","Alex"};
		
		for(int i=0; i<vect.length; i++) { /*vect.length uma forma mais correta
		 									de se fazer um for*/
			System.out.println(vect[i]);
		}
		System.out.println("------------------");
		
		for(String obj : vect) {
			System.out.println(obj);
		}
	
		sc.close();

	}

}
