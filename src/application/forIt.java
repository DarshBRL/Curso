package application;

import java.util.Locale;
import java.util.Scanner;

public class forIt {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] nomes = new String[N];
		
		for(int i=0; i<N; i++) {
			nomes[i] = sc.next();
		}
		System.out.println("Nomes Lidos:");
		//SINTAX for it		
		for(String s : nomes) {
			System.out.println(s);
		}
		
		
		sc.close();
	}

}
