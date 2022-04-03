package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVetor;

public class ExemploVetores2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*"n" vai ser a quantidade de vezes do vetor 
		 * mas vamos usar uma variavel vect.length
		 * usando o vect.length vc esta trabalhando de uma forma mais coesa
		 * é melhor vc usar o vect.length pq vc nao fica dependendo de uma outra variavel 
		 * q está atrelada ao vetor */
		
		int n = sc.nextInt();
		//criando um vetor da classe ProductVetor
		ProductVetor[] vect = new ProductVetor[n];
		
		//instanciando o name e o price vect[i] = new ProductVetor(name, price);
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVetor(name, price);
		}
		
		double sum = 0.0;
		//somando o price private usando getPrice sum += vect[i].getPrice();
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
			
		
		sc.close();
	}

}
