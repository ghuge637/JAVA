//1. Write a Java program to reverse a given string without using any built-in functions or libraries
package q1to10;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String st = sc.next();
		String reverse = " ";
		
		for(int i = st.length()-1; i >= 0; i--) {
			
			reverse += st.charAt(i); //charAt(i) --> Allowed (basic character access, not a library utility).
		}
		
		System.out.println("Reversed String is: "+ reverse);
	}
}
