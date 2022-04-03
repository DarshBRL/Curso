package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] mat = new int[N][M];

		for (int i = 0; i <mat.length; i++) {
			for (int j = 0; j <mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main diagonal:");
		for (int i = 0; i < N; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		int cont = 0;
		for (int i = 0; i <mat.length; i++) {
			for (int j = 0; j <mat[i].length; j++) {
				if (mat[i][j] < 0) {
					cont++;
				}
			}		
		}
		System.out.println("Negativo = " + cont);
		sc.close();
	}
}
