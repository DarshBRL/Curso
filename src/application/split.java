package application;

public class split {

	public static void main(String[] args) {
		
		String s = "potato apple lemon";
		
		//Função split vai pegar minha String "s" 
		//E separar as palavras entre o "espaço delas"
		String[] vect = s.split(" ");
		
		/* Aqui usei o vect q o vetor onde ele indexa os elementos 
		como foi 3 elementos usado na String s 
		pedi para imprimir os 3 vetores */
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}
