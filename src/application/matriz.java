package application;

import java.util.Locale;
import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(); //Quantidade de linhas
		int N = sc.nextInt(); //Quantidade de colunas
		
		int[][] mat = new int [M][N]; //Instanciação
		
		for(int i=0; i<M; i++) { //incrementar numeros nas linhas
			for(int j=0; j<N; j++) { //incrementar numeros nas colunas
				mat[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<M; i++) { //Leitura das linhas
			for(int j=0; j<N; j++) { //Leitura das Colunas
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}	
		
		sc.close();

	}

}
