package Teste;

public class Teste {
	
	private String name;

	public Teste(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return "name: " 
				+ name;
	}
	
	

}
