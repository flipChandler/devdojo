package br.com.felipesantos.javacore.datas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		String mascara = "'Cotia', dd 'de' MMMM 'de' yyyy";
		//checar a doc de simpleDateFormat para ver os parametros
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(mascara);// Cotia, 04 de junho de 2020
		System.out.println(simpleDateFormat.format(calendar.getTime()));
	}

}
