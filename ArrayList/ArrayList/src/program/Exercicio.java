package program;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.println("Quantas pessoas você quer digitar? ");
		int n = sc.nextInt();
		
		for (int i =0; i<n; i++) {
			
			System.out.println();
			System.out.println("Funcionario # " + (i + 1) + ": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Esse id ja existe, tente novamente:");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println(" Salario: ");
			Double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));	
		}
		
		System.out.println();
		System.out.println("Qual funcionario vocês deseja alterar? ");
		int idsalary =  sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		//Integer pos = position(list, idsalary);
		
		if(emp == null) {
			System.out.println("Id de funcionario não existe!!");
			
		} 
		else {
			System.out.println("Entre com a porcentagem: ");
			sc.nextLine();
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("Lista de Funcionarios: ");
		for (Employee e : list) {
			System.out.println(e);
				
		}
		
		
		sc.close();
	}
	
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
		
	}
	
	 /* Outro exemplo de como resolver o exercicio;
	  * 
	  * public static Integer position(List<Employee> list, int id ) {
		for(int i =0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	} */

}
