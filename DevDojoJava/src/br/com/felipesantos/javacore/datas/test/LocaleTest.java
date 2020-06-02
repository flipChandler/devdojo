package br.com.felipesantos.javacore.datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		// padrao iso 639 BR - PT -US - EN
		Locale localeItaly = new Locale("it", "IT");
		Locale localeSuica = new Locale("it", "CH");
		Locale localeIndia = new Locale("hi", "IN");
		Locale localeJapao = new Locale("ja");
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2015, Calendar.DECEMBER,23);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItaly );
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica );
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia );
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao );

		System.out.println(df.format("Italia " + calendar.getTime()));// mercoledì 23 dicembre 2015
		System.out.println(df2.format("Suiça " + calendar.getTime()));// mercoledì, 23 dicembre 2015
		System.out.println(df3.format("India " + calendar.getTime()));// ??????, 23 ?????? 2015
		System.out.println(df4.format("Japão " + calendar.getTime()));// 2015?12?23????
		
		System.out.println(localeItaly.getDisplayCountry()); 
		
	}

}
