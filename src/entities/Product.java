package entities;

public class Product {
	/*ENCAPSULAMENTO dos Atributos mudamos de public para private
	private String name;
	private double price;
	private int quantity;*/
	
	public String name;
	public double price;
	public int quantity;
	
	/*Gerando automaticamente CONTRUTORES e GETTERS e SETTERS com Eclipse
	 * BOTAO DIREITO DO MOUSE > SOURCE > GENERATE CONSTRUCTOR USING FIELDS
	 * BOTAO DIREITO DO MOUSE > SOURCE > GENERATE GETTERS AND SETTERS */ 
	
	//CONSTRUTOR PADRÃO usando a instanciação new no programa
	public Product() {		
	}	
	//CONSTRUTOR depois dos ATRIBUTO antes dos METODOS
	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	//SOBRECARGA disponibilizar mais de uma versao da mesma operação
	public Product (String name, double price) {
		this.name = name;
		this.price = price;
		/*Por padrão JAVA inicia numeros de objetos valor zero
		 * OPCIONAL colocar 0 
		 * tbm não é nessessario a palavra this
		 * pq nao temos um parametro com o mesmo nome do atributo
		 * (this.)quantity = 0;*/
	}
	
	
	//Metodos para acessar o PRIVATE é colocado depois dos CONSTRUTORES
	
	//getName para obter o name usando PRIVATE "Imprimir o nome no programa"
	public String getName() {
		return name;
	}
	//setName para alterar o name usando PRIVATE
	public void setName(String name) {
		this.name = name;
	}
	//Mostrar o price no PRIVATE
	public double getPrice() {
		return price;
	}
	//Alterar o prive no PRIVATE
	public void setPrice(double price) {
		this.price = price;
	}
	//Mostrar a Quantity
	public int getQuantity() {
		return quantity;
	}
	
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
