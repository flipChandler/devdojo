package br.com.felipesantos.javacore.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		
		System.out.println(resourceBundle.getString("ola"));
		System.out.println(resourceBundle.getString("bom.dia"));
		System.out.println(resourceBundle.getString("show"));
	}

}
