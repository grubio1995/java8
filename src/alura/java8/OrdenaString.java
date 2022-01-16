package alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		
		// Comparando
		System.out.println("Utilizando compare para comparacao");
		
		System.out.println("Classe anonima:");
		palavras.sort(new Comparator<String>() { //CLASSE ANONIMA

			@Override
			public int compare(String s1, String s2) {
				if(s1.length() - s2.length() > 0) {
					return 1;
				}else if(s1.length() - s2.length() < 0) {
					return -1;
				}else{
					return 0;	
				}
			}
		});
		System.out.println(palavras);
		System.out.println("\n");

		System.out.println("Lambda:");
		palavras.sort(Comparator.comparing(p -> p.length())); //LAMBDA
		System.out.println(palavras);
		System.out.println("\n");
		
		System.out.println("Method Reference:");
		palavras.sort(Comparator.comparing(String::length)); //METHOD REFERENCE
		System.out.println(palavras);
		System.out.println("\n==========================\n");
		
		//Exibição
		System.out.println("Utilizando foreach para exibição");
		
		System.out.println("Classe anonima:");
		palavras.forEach(new Consumer<String>() { //CLASSE ANONIMA
			@Override
			public void accept(String s) {
				System.out.println(s);
				
			}
		});
		System.out.println("\n");

		System.out.println("Lambda:");
		palavras.forEach(palavra -> System.out.println(palavra)); // LAMBDA
		System.out.println("\n");

		System.out.println("Method reference:");
		palavras.forEach(System.out::println); //METHOD REFERENCE

		System.out.println("\n==========================\n");
		
		System.out.println("Utilizando Thread");
		System.out.println("Lambda:");
		new Thread(() -> System.out.println("Teste")).start();

	}
}
