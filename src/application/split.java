package application;

public class split {

	public static void main(String[] args) {
		
		String s = "potato apple lemon";
		
		//Fun��o split vai pegar minha String "s" 
		//E separar as palavras entre o "espa�o delas"
		String[] vect = s.split(" ");
		
		/* Aqui usei o vect q o vetor onde ele indexa os elementos 
		como foi 3 elementos usado na String s 
		pedi para imprimir os 3 vetores */
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}
