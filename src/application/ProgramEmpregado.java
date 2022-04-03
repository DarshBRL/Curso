package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.Empregado;

public class ProgramEmpregado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		System.out.print("Quantos Funcionarios serão registrado? ");
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			
			System.out.println();
			System.out.println("Empregado #" + (i + 1)+ ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.println("Essa Id já existe! Tente novamente: ");
				id = sc.nextInt();
			}
						
			System.out.print("Nome: ");
			sc.nextLine(); 				//Quebra de linha pendente 
			String name = sc.nextLine();
			System.out.print("Salario: ");
			Double salary = sc.nextDouble();
			
			Empregado emp = new Empregado(id, name, salary);
			
			list.add(emp);			
		}
		System.out.println();
		System.out.print("Informe a ID do funcionário que terá aumento salarial: ");
		int idSalary = sc.nextInt();
		
		Empregado emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		//Integer pos = position(list, idSalary);
		
		if (emp == null) { //pos
			System.out.println("Nenhuma Id Encontrada!");
		}
		else {
			System.out.print("Digite a porcentagem: ");
			double percent = sc.nextDouble();
			//list.get(pos)
			emp.increaseSalary(percent);
		}
		System.out.println();
		System.out.println("Lista de Funcionarios: ");
		for (Empregado e : list) { //emp
			System.out.println(e); //emp
		}	
		
		sc.close();
	}
	
	public static Integer position(List<Empregado> list, int id) {
		for (int i=0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Empregado> list, int id) {
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
