package application;

import java.util.Locale;
import java.util.Scanner;

public class exemploVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		//tamanho do vetor vai ser N
		double[] vet = new double[N];
		
		//usando N no for
		for(int i=0; i<N; i++) {
		/*macete 
		 *1 vet ja é double
		 *2 usando a vareavel i para acessar a posição do vetor */
			vet[i] = sc.nextDouble();
		}
		//usando outro for para imprimir o vetor
		for(int i=0; i<N; i++) {
			System.out.printf("%.2f%n", vet[i]);
		}
		
		sc.close();
	}

}
