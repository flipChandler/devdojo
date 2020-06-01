package br.com.felipesantos.javacore.datas.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		DateFormat[] format = new DateFormat[6];
		format[0] = DateFormat.getInstance();
		format[1] = DateFormat.getDateInstance();
		format[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		format[3] = DateFormat.getDateInstance(DateFormat.LONG);
		format[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		format[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for (DateFormat df : format) {
			System.out.println(df.format(calendar.getTime()));
		}
		
		//for ->
//		01/06/2020 06:15
//		1 de jun de 2020
//		01/06/2020
//		1 de junho de 2020
//		1 de jun de 2020
//		segunda-feira, 1 de junho de 2020
	}

}
