package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException { // throws trata a exeção do erro do .parse()
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // converte/formata String em Date e vice versa.
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); // .setTimeZone(TimeZone.getTimeZone("GMT")) faz o sdf3 ser exibido no formato UTC (Londres 0). 
		
		Date x1 = new Date(); // new Date() instancia/exibe uma data no instante do sistema.
		Date x2 = new Date(System.currentTimeMillis()); /* System.currentTimeMillis() outra opção de exibir uma data no instante atual do sistema.
														   Pega o instantante do sistema, converte em milisegundos e cria a data a partir desse valor.	
														*/
		Date x3 = new Date(0L); // (0L) zera os milisegundos a partir de 1970 (meia noite) e "L" significa Long.
		Date x4 = new Date(1000L * 60L * 60L * 5L); //cálculo de 5 horas após a meia noite de 1970.
		
		Date y1 = sdf1.parse("25/06/2018"); // .parse() recebe uma String e converte em Date no formato sdf1.
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Date.from(Instant.parse()) exibe uma data personalizada com base na String que está dentro.
																	// Z significa UTC, horário de Londres(0), por isso está +3 em relação à São Paulo.
		
		System.out.println("x1: " + x1); // irá exibir no formato padr ão de data e horário do Java.
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("-----------------------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1)); // sdf2.format() formata a Date y1 no formato de sfd2.
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("-----------------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1)); // sdf3.format() formata a Date y1 no formato de sfd3.
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
	}

}
