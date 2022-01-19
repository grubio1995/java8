package alura.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {
	
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
		
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period period = Period.between(hoje, olimpiadasRio);
		System.out.println(period.getDays());
		
		LocalDate proximasOlimpiadas =  olimpiadasRio.plusYears(4);

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(proximasOlimpiadas.format(formatador));		
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		System.out.println(agora.format(formatadorHora));

		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
		
		
	}
}
