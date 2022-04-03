package application;

import java.util.Locale;
import java.util.Scanner;

public class matrizExemplo2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();//Linhas
		int N = sc.nextInt();//Colunas
		
		double[][] numeros = new double[M][N];//Criação da Matriz
		
		for(int i=0; i<M; i++) { //add elementos nas linhas
			for(int j=0; j<N; j++) { //add elementos nas colunas
				numeros[i][j] = sc.nextDouble(); 
			}
		}
		
		double[] vet = new double[M]; //Vetor das linhas
		
		for(int i=0; i<M; i++) { //Percorrendo Linhas
			double soma = 0.0; //Variavel q vai contar os Elementos
			for(int j=0; j<N; i++) { //Percorrendo Colunas
				soma = soma + numeros[i][j]; //Contando os Elemetos
			}
			vet[i] = soma; //Vetor com a soma de cada Linha
		}
		
		for(int i=0; i<M; i++) {
			System.out.printf("%.1f%n", vet[i]);
		}
	
		sc.close();
	}

}
