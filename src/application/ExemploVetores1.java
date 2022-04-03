package application;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetores1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		/*[] abre e fecha colchetes indica q eu estou declarando um "vetor"
		 * nome da variavel "vect"
		 * essa variavel vai receber a instanciação do vetor "vect"
		 * double é o tipo dos elementos do vetor
		 * e entre colchetes eu vou colocar o tamanho desse vetor q é "n" */
		double[] vect = new double[n];	
		
		/*laço "FOR" para digitar os numeros e guardar esses numeros no vetor
		 * vect[i] vai poder ler os numeros digitos seja la qual for o nomero
		 * exemplo se eu colocar 3 o "FOR" vai fazer eu digitar 3 numeros e por ai vai
		 * i<n é quantas vezes vai passar por ele*/
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}	
		
		/*vou pecorrer o vetor e somar a quantidade digitada "N" / pela mesma "N"
		 * criando uma variavel double sum "soma" recebendo 0.0
		 * criar mais um "FOR" e dentro dele fazer o calculo do vetor
		 * sum += vect[i] vai percorrer o vetor e acumular no sum
		 * */
		double sum = 0.0;
		
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		/*final vou criar uma variavel aqui pra guardar a media recebendo
		 * essa soma dividido por "N"
		 */
		double avg = sum / n;	
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
			
		sc.close();
	}

}
