package util;

public class CurrencyConverter {
	//IOF minha constante
	public static double IOF = 0.06;
	//dollarToReal vai ser meu metodo
	public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
	}
}
