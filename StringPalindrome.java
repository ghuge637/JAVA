//3. Write a Java program to check if a given string is a palindrome or not.
package q1to10;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.next();
		String reverse = "";
		
		for(int i = st.length()-1; i>=0; i--) {
			reverse += st.charAt(i);
		}
		
//		System.out.println(reverse);
		System.out.println(reverse.equals(st)?"The String are palindrome":"The String are Not-palindrome");
	}
}
