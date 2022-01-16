package aula1.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		palavras.sort((p1, p2) -> Integer.compare(p1.length(), p2.length()));
		System.out.println(palavras);

		palavras.forEach(palavra -> System.out.println(palavra));

		new Thread(() -> System.out.println("Teste")).start();

	}
}
