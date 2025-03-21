package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Mariaa");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		list.add(2, "Marco");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("------Remover-------------");
		list.remove(3);
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------------");
		System.out.println("Index of Bob " + list.indexOf("Bob "));
		System.out.println("Index of Marco " + list.indexOf("Marco "));
		
		System.out.println("---------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		 
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------Encontrar elemento--------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
			System.out.println(name);
		
		System.out.println("---------Encontrar elemento--------------");
		String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
			System.out.println(name1);
	}

}
