package br.com.felipesantos.javacore.strings.test;

public class StringBuilderTest {

	public static void main(String[] args) {
		String s = "Uma frase comum";
		StringBuilder sb = new StringBuilder(16);
		sb.append("etset mumoc esarf amU");
		System.out.println(sb);// toString();
				
		System.out.println(sb.reverse()); // Uma frase comum teste
		
		StringBuilder sb2 = new StringBuilder(16);
		sb2.append("0123456789");
		System.out.println(sb2.delete(0,2)); // 23456789
		
		StringBuilder sb3 = new StringBuilder(16);
		sb3.append("0123456789");
		System.out.println(sb3.insert(4,"####")); // 0123####456789
		
		StringBuilder sb4 = new StringBuilder(16);
		System.out.println(sb4.append("def").insert(3, "ghi").reverse().delete(2, 4));// ihd
		
		
		
		
	}

}
