package valetera;

public class Vale {
	
	private double dia;
	private double passagem;
	private double quantPassagem;
	private double refeicao;
	
	//construtores servem para instanciar isso em outra classe ou programa
	public Vale(double dia1, double passagem1, double quantPassagem1, double refeicao1) {
		this.dia = dia1;
		this.passagem = passagem1;
		this.quantPassagem = quantPassagem1;
		this.refeicao = refeicao1;
	}
	

	public double getDia() {
		return dia;
	}
	public void setDia(double dia) {
		this.dia = dia;
	}
	public double getPassagem() {
		return passagem;
	}
	public void setPassagem(double passagem) {
		this.passagem = passagem;
	}
	public double getQuantPassagem() {
		return quantPassagem;
	}
	public void setQuantPassagem(double quantPassagem) {
		this.quantPassagem = quantPassagem;
	}
	public double getRefeicao() {
		return refeicao;
	}
	public void setRefeicao(double refeicao) {
		this.refeicao = refeicao;
	}
	
	//metodos publico para acessar meus atributos/variavel privado
	public double precoPassagem () {
		return passagem * quantPassagem * dia;
	}
	public double precoRefeicao () {
		return refeicao * dia;
	}
	
	public double totalPago (double precoPassagem, double precoRefeicao) {
		return precoPassagem + precoRefeicao;
	}
	
	//toString para fazer a formataçao do texto do modo q eu queira 
	public String toString() {
		return "Dias: "
				+ String.format ("%.0f%n",dia) 
				+ "Passagem: "
				+ String.format ("%.2f%n",passagem) 
				+ "Quantidade passagem: "
				+ String.format ("%.0f%n",quantPassagem) 
				+ "Refeição: "
				+ String.format ("%.2f%n",refeicao) 
				+ String.format("Total pagar: %.2f", totalPago(precoPassagem(), precoRefeicao()));
		
	}
	
}
