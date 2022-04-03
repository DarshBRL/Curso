package application;

public class Vetor {

	public static void main(String[] args) {

				
		// Declaração do Vetor
		int[] A;
		double[] B;
		String[] C;
	
		// Instanciação do Vetor
		A = new int[10];
		B = new double[5];
		C = new String[8];
		
		//Declaração com Instanciação
		int[] D = new int[5];
		
		//o Vetor A posição 3 vai receber 10
		A[3] = 10;
		
		//o vetor B recebe a variavel i + 10 
		for (int i=0; i<5; i++) {
			B[i] = i + 10;
		}
		
		//vetor C posição 1 vai receber Maria
		C[1] = "Maria";
		
		
	}

}
