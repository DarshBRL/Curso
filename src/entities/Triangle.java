package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		/*Pode se fazer uma variavel q receber o nome de "result"
		 * result vai receber o comando para calcular as area do triagulo 
		 * porem no final dessa expressao tem q usar a fun��o "return"
		 * para retornar a fun��o ou "fechar a fun��o"
		 * 
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
		
		J� no modo q apliquei eu mandei retornar diretamente a expressao
		*/
	}

}
