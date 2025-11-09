package hummingbird;

import java.util.Scanner;

public class SeparateLowerUpperCase {
	public static void checkuplo(String st) {
		StringBuilder upper = new StringBuilder();
		StringBuilder lower = new StringBuilder();
		
		for(char c: st.toCharArray()) {
			if(Character.isUpperCase(c)) {
				upper.append(c);
			}else {
				lower.append(c);
			}
		}
		System.out.println(upper);
		System.out.println(lower);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String st = sc.next();
		
		st = st.replaceAll("[^a-zA-Z ]", "");
		checkuplo(st);
	}
}
