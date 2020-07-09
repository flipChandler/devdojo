package br.com.felipesantos.javacore.colecoes.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// MAP -> chave e valor | ñ pode exitir chaves duplicadas
		//Map<String, String> map = new HashMap<>(); // ñ mantem a ordem de inserção
		Map<String, String> map = new LinkedHashMap<>(); // mantem a ordem de inserção
		map.put("teklado", "teclado");
		map.put("mouse", "mouse");
		map.put("porta", "puerta");
		map.put("vc", "você");
		map.put("vc", "voce2");// esse valor (voce2) sobrescreve o outro vc (chave)
		
		// percorrer pelas chaves - key
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		System.out.println();
		
		// percorrer pelos valores - value
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		
		// pegar pelas chaves e valores
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
