package alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

}

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
			
		 OptionalDouble media = cursos.stream()
			.filter(curso -> curso.getAlunos() >= 100)
			.mapToInt(Curso::getAlunos)
			.average();
		
//		System.out.println(soma);
		
//		cursos.stream()
//		.filter(c -> c.getAlunos() >= 100)
//		.findAny()
//		.ifPresent(curso -> System.out.println(curso.getNome()));

	}
}