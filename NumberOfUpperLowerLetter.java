package hummingbird;

import java.util.Scanner;

public class NumberOfUpperLowerLetter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int lower=0, upper=0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
//			int asc = ch;
			
			if(ch >= 'a' && ch<= 'z') {
				lower++;
			}else if(ch >= 'A' && ch<= 'Z') {
				upper++;
			}
		}
		
		System.out.println("Number of Lower Case letter is: "+lower);
		System.out.println("Number of upper Case letter is: "+upper);
	}
}
