package br.com.felipesantos.javacore.wrappers.test;

public class WrappersTest {

	public static void main(String[] args) {
		// 8 tipos primitivos do Java
		//byte, short, int, long, float, double, char, boolean 
		byte bytePrimitivo = 1;
		short shortPrimitivo = 1;
		int intPrimitivo = 10;
		long longPrimitivo = 10L;
		float floatPrimitivo = 10F;
		double doublePrimitivo = 10D;
		char charPrimitivo = 'A';
		boolean booleanPrimitivo = true;
		
		Byte byteWrapper = 127;// AUTOBOXING
		Short shortWrapper = 1;
		Integer integerWrapper = new Integer("10"); // DEPRECIADO DESDE JAVA 9
		Long longWrapper = new Long("15"); // DEPRECIADO DESDE JAVA 9
		Float floatWrapper = new Float("456"); // DEPRECIADO DESDE JAVA 9
		Double doubleWrapper = 10D;
		Character characterWrapper = 'A';
		Boolean booleanWrapper = true;
		
		int i = integerWrapper; //UNBOXING
		
		String valor = "10";
		Float valorFloat = Float.parseFloat(valor);
		System.out.println(valorFloat);// 10
		
		longWrapper = Long.valueOf("100");
		System.out.println(longWrapper); // 100
		
		System.out.println(Character.isDigit('5')); // true
		System.out.println(Character.isLetter('5')); // false
		System.out.println(Character.isLetterOrDigit('#')); // false
		System.out.println(Character.isUpperCase('a')); // false
		System.out.println(Character.isLowerCase('a')); // true
	}

}
