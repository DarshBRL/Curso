package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Construtor Padrão antes de eu fazer a alteração na minha Classe Product
		 * tinha q instanciar pq meu Construtor padrão da Classe ñ tinha valor 
		Product product = new Product();
		*/
		
		//ler os meus dados aqui só depois vou instancia o Product
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		/*Usando uma variavel temporaria
		 * essa Variavel vai ser simplesmente uma variavel auxiliar
		 * para receber o nome q vou digitar (VARIAVEL String)*/		
		String name = sc.next();
		System.out.print("Price: ");
		/*Usando uma variavel temporaria
		 * essa Variavel vai ser simplesmente uma variavel auxiliar
		 * para receber o preço q vou digitar (VARIAVEL double)*/	
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");	
		/*Usando uma variavel temporaria
		 * essa Variavel vai ser simplesmente uma variavel auxiliar
		 * para receber o quantidade q vou digitar (VARIAVEL int)*/		
		int quantity = sc.nextInt();	
		/*Depois q eu digitar os tres dados dai sim vou cliar minha Variavel 
		 * Product */	 
		Product product = new Product(name, price, quantity);
		/*Agora estou obrigando o programador a informar os dados do produto
		 * no momento da instanciaçao dele 
		 * Concluindo q o CONSTRUTOR ele serve para proteger q o programador
		 * faça a besteira de criar um produto q não tem preço, nome ou quantidade
		 * e deixa num estado de inconsistencia*/
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
				
		sc.close();
	}

}
