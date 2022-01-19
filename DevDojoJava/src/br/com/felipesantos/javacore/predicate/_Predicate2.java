package br.com.felipesantos.javacore.predicate;

import java.util.function.Predicate;

public class _Predicate2 {
	public static void main(String[] args) {
		System.out.println(isPhoneNumberValid("07000000000"));
		System.out.println(isPhoneNumberValid("09000000000"));
		System.out.println(isPhoneNumberValid("0700000000"));
		
		System.out.println("predicate" + isPhoneNumberValidPredicate.test("07000000000"));
		
		System.out.println("Is phone number valid and contains number 3");
		System.out.println(isPhoneNumberValidPredicate.and(isPhoneNumberContains3).test("07000000003"));
		
		System.out.println("Is phone number valid or contains number 3");
		System.out.println(isPhoneNumberValidPredicate.or(isPhoneNumberContains3).test("07000000000"));
	}
	
	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
	}
	
	static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> 
	phoneNumber.startsWith("07") && phoneNumber.length() == 11;
	
	static Predicate<String> isPhoneNumberContains3 = phoneNumber -> 
	phoneNumber.contains("3");
}
