package application;
import java.util.Locale;
import java.util.Scanner;

public class estruturaRepetitivaEnquato {

	public static void main(String[] args) {
		
	//Estrutura repetitiva enquanto (while)
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma =0;
		while(x != 0) {
			//operador de atribuicao cumulativa
			//soma += x;
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println("Soma: "+ soma);
		
		sc.close();
	}
}