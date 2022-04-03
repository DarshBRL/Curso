package application;
import java.util.Locale;
import java.util.Scanner;

public class funcoes {
	//main é o programa principal
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite 3 numeros: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// max vai virar uma função na qual ele vai verificar qual o maior numero
		int higher = max(a, b, c);
		
		/* showResult vai virar uma função na qual ele vai imprimir o resultado
		 * da variavel higher 
		 */
		showResult(higher);
				
		sc.close();
	}
	// max função para saber qual o maior numero "x,y,z"
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}
		else if(y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	//showResult vai imprimir o resultado
	public static void showResult(int value) {
		System.out.println("Maior numero foi: "+ value);
	}
}
