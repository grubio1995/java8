package aula1.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		Consumer<String> consumer = new Imprimir();
		Comparator<String> comparator = new Comparador();
		palavras.sort(comparator);
		palavras.forEach(consumer);
		
	}
}

class Imprimir implements Consumer<String>{

	@Override
	public void accept(String texto) {
		System.out.println(texto);
		
	}
	
}

class Comparador implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;

		if(s1.length() > s2.length())
			return 1;
		
		return 0;
	}
	
}
