package hummingbird;

import java.util.Scanner;

public class UpperToLowerAndViceversa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = " ";
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int asc = ch;
			if(asc<90) {
				asc += 32;
				char chr = (char)asc;
				str2 += chr;
			}else {
				asc -= 32;
				char chr = (char)asc;
				str2 += chr;
			}
		}
		System.out.println(str2);
	}
}
