package br.com.felipesantos.javacore.datas.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormarTest {

	public static void main(String[] args) {
		float valor = 212.4567f;
		Locale localeItalia = new Locale("it");
		NumberFormat[] numberFormat = new NumberFormat[4];
		
		numberFormat[0] = NumberFormat.getInstance();// 212,457
		numberFormat[1] = NumberFormat.getInstance(localeItalia); //212,457
		numberFormat[2] = NumberFormat.getCurrencyInstance();// R$а212,46
		numberFormat[3] = NumberFormat.getCurrencyInstance(localeItalia); //212,46ад
		
		for (NumberFormat nf : numberFormat) {
			System.out.println(nf.format(valor));
		}
		
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.getMaximumFractionDigits()); // 3
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(valor)); // 212,46
		
		String valorString = "212,4567";
		
		try {
			System.out.println(nf.parse(valorString)); // 212,46
			nf.setParseIntegerOnly(true);
			System.out.println(nf.parse(valorString)); // 212
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
