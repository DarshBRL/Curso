package application;

import java.util.Locale;
import java.util.Scanner;

import valetera.Vale;

public class ValeTera {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//teste é minha variavel da Classe Vale
		
		
		//criando variaveis para ser usado no meu objeto teste
		System.out.print("Digite dias: ");
		double dia = sc.nextDouble();
		System.out.print("Digite preço passagem: ");
		double passagem = sc.nextDouble();
		System.out.print("Digite quantas passagens: ");
		double quantPassagem = sc.nextDouble();
		System.out.print("Digite refeicao: ");
		double refeicao = sc.nextDouble();
		
		//instanciando meu construtor da minha classe Vale
		Vale teste = new Vale(dia, passagem, quantPassagem, refeicao);
		//quando teste foi instanciado da minha classe Vale ele virou um objeto
		
		//usando só minha variavel teste ja traz todo meu teste formatado na minha classe
		System.out.println(teste);
		
		
		sc.close();

	}
}
