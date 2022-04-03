package application;

import java.util.ArrayList; //java.util.ArrayList
import java.util.List; //java.util.List
import java.util.stream.Collectors;

public class listExemplo {

	public static void main(String[] args) {
		//Wrapper Classe 
		//não pode usar tipos primitivos //nao pode instanciar com interface "List"
		//Tem q coloca uma Classe q implementa essa interface "List" o "ArrayList<>()"
		List <String> list = new ArrayList<>();
		
		//Adicionando elementos na Lista
		list.add("Maria"); //0
		list.add("Alex");  //1
		list.add("Bob");   //2
		list.add("Anna");  //3
		list.add(2, "Marco"); //Add um elemento na posição "2"
		
		System.out.println(list.size()); //ver o tamanho da lista		
		
		//Percorrer minha lista com For each
		for(String x : list) { //PARA CADA STRING X PERTENCENTE À MINHA LISTA LIST  
			System.out.println(x); // EU VOU MANDAR IMPRIMIR NA TELA O VALOR DE X
		}
		
		System.out.println("-------------------------");	
		
		//list.remove("Anna");	//Remover um elemento
		//list.remove(1);		//Remove o elemento na posição "1"
		
		list.removeIf(x -> x.charAt(0) == 'M'); //Remove predicado ou seja todo mundo q começa com a letra M
		//Pega um valor X e me retorna se esse X for igual charAt(0) "M";
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");	
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));//encontrar a posição de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Marco"));//quando não encotra mostra "-1"
		
		System.out.println("-------------------------");
		
		/*Criar uma nova lista, pegar minha lista List q é a original filtrar essa lista somente
		 * com aqueles elementos q começam com a letra A e devilver pra mim uma nova lista somente
		 * com esses elementos */
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		/*Pegar minha lista converter ela para stream / usar o filter q aceita um predicado (x->x.charAt(0) == 'A')
		 * o predicado foi para pegar todos elementos q começam com a letra "A" (x->x.charAt(0) == 'A')
		 * filter vai me devolver um texto filtrado conforme o predicado (x->x.charAt(0) == 'A')
		 * stream nao é compartivel com list
		 * conveter o stream para lista .collect(Collectors.toList());*/
		
		for(String x : result) { //imprimindo nova lista result
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		
		//Encontrar o primeiro elemento de um predicado q começa com 'A'
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		/* findFirst() vai pegar o primeiro elemento dessa stream q atende esse predicado 
		 *(x -> x.charAt(0) == 'A')
		 *se esse elemento nao existir ele vai me retornar nulo .orElse(null)*/
		System.out.println(name);
		
		System.out.println("-------------------------");
		
		//me retorne o primeiro elemento q começa com 'J'
		String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		//vai retornar Null
		
		System.out.println(nome);
	}
}
