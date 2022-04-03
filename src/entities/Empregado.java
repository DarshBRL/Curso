package entities;

public class Empregado { //Classe com Atributos
	
	private Integer id; //int
	private String name; //String
	private Double salary; //double
	
	public Empregado() {//Construtor Padrão	
	}
	
	public Empregado(Integer id, String name, Double salary) {//Contrutor com argumentos 
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {//Get e Set
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(Double percentage) {
		salary += salary * percentage / 100.0; //Formula de porcentagem 
	}
	
	@Override //ajuda vc á não errar
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
}
