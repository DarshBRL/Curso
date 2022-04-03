package application;

public class funcoesInteressantesParaString {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		//Para transformar em Minuscula
		String s01 = original.toLowerCase();
		
		//Para transformar em Maiuscula
		String s02 = original.toUpperCase();
		
		//Para remover Espaços
		String s03 = original.trim();
		
		//Seleciona em qual caracter vc quer começar:
		//0 para primeiro caracter
		//1 para o segundo e por ai vai		
		String s04 = original.substring(2);
		
		//Seleciona em qual caracter vc quer começar e terminar:
		//Exemplo: 2 começa no terceiro caracter
		//9 vai recortar a String até o numero 9 lembrando q ele pega espaço		
		String s05 = original.substring(2, 9);
		
		//Ele faz a troca do caracter
		//Exemplo: selecionei troque o "a" pelo "x"
		//Todos os "a" q estiverem nessa linha sera trocado por "x"
		String s06 = original.replace('a', 'x');
		
		//ele faz a troca de uma subtring tipo uma forma de palavra
		//Exemplo:"abc" quero q troca para "xy" 
		//todos os "abc" q estiverem nessa linha sera trocado para "xy"
		String s07 = original.replace("abc", "xy");
		
		//Ele pega a primeira posição do meu substring "selecionado" "bc"
		//O "a" foi o "0" o "bc" foi "1" entao ele manda pra mim qual selecionei
		int i = original.indexOf("bc");
		
		//Ele pega o ultima posição do meu substring "selecionado" "bc"
		//Vai ate a ultima ocorrencia do meu "bc" q foi o "17"
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
	}

}
