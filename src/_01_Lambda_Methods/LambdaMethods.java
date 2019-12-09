package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		System.out.println("");
		System.out.println("");
		//2. Call the printCustomMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				String ss = "";
				for(int j = s.length()-1; j >= 0; j--) {
					ss += s.charAt(j);
				}
				System.out.println(ss);
			}
		}, "repeat");
		System.out.println("");
		System.out.println("");
		//3. Call the printCustomMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				String a = "";
				Random r = new Random();
				for(int j = 0; j < s.length(); j++) {
					 a = "";
					if(r.nextInt(2) == 1) {
						a += "" + Character.toUpperCase(s.charAt(j));
					}else{
						a += "" + Character.toLowerCase(s.charAt(j));	
					}
				}
				System.out.println(a);
			}
		}, "repeat");
		System.out.println("");
		System.out.println("");
		//4. Call the printCustomMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				String a = "" + s.charAt(0);
				for(int j = 1 ; j < s.length(); j++) {
					a += "." + s.charAt(j);
				}
				System.out.println(a);
			}
		}, "repeat");
		System.out.println("");
		System.out.println("");
		//5. Call the printCustomMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				String a = "" + s.charAt(0);
				for(int j = 1 ; j < s.length(); j++) {
					if(s.charAt(j) != 'e' && s.charAt(j) != 'a' && s.charAt(j) != 'i' && s.charAt(j) != 'o' && s.charAt(j) != 'u' ) {
						a += s.charAt(j);
					}
				}
				System.out.println(a);
			}
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
