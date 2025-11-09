//8. Change Upper Case to Lower Case and Lowercase to Uppercase Of all the characters In the string without using built-inJava 
package q1to10;

import java.util.Scanner;

public class UpperToLow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.next();
		
		String nst = "";
		for(int i=0; i<st.length();i++) {
			char ch = st.charAt(i);
			int ascii = (int)ch;
			if(ascii <= 90) {
				ascii += 32;
				char chr = (char)ascii;
				nst+=chr;
			}
			else {
				ascii -= 32;
				char chr = (char)ascii;
				nst+=chr;
			}
		}
		System.out.println(nst);
	}
}
