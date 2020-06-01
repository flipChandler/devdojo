package br.com.felipesantos.javacore.datas.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatas {

	public static void main(String[] args) {
		Date date = new Date(1_000_000_000_000L);
		System.out.println(date); // Sat Sep 08 22:46:40 BRT 2001
		System.out.println(date.getTime()); // valor em milissegundos -> 1000000000000
		
		date.setTime(date.getTime() + 3_600_000L);// add mais tempo em date
		System.out.println("\n" + date); // Sat Sep 08 23:46:40 BRT 2001
		
		Calendar calendar = Calendar.getInstance();
		//calendar.setTime(date);
		
		if (Calendar.SUNDAY == calendar.getFirstDayOfWeek()) {
			System.out.println("Domingo é o primeiro dia da semana"); //Domingo é o primeiro dia da semana
		}
		
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // 1
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // 2
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); // 153
		
		calendar.add(Calendar.HOUR, 24);// add 24 horas
		calendar.roll(Calendar.MONTH, 20);// add 20 meses, porém, não altera o ano
		Date date2 = calendar.getTime();
		System.out.println(date2); // Sun Feb 02 06:00:21 BRT 2020
		
		//NUmberFormat, Locale, Calendar, Date, DateFormat
		

	}

}
