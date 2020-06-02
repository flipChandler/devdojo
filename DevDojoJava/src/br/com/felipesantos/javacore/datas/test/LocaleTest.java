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

		System.out.println("Italia " + df.format(calendar.getTime()));// Italia mercoledì 23 dicembre 201
		System.out.println("Suiça " + df2.format(calendar.getTime()));// Suiça mercoledì, 23 dicembre 2015
		System.out.println("India " + df3.format( calendar.getTime()));// India ??????, 23 ?????? 2015
		System.out.println("Japão " + df4.format(calendar.getTime()));// Japão 2015 Dec 23, Wed
		
		System.out.println(localeItaly.getDisplayLanguage());// italiano
		System.out.println(localeJapao.getDisplayLanguage());// japonês
		System.out.println(localeIndia.getDisplayLanguage()); // hindi
		
				
	}

}
