package hummingbird;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		if(str1.length() != str2.length()){
			System.out.println("String is Not Annagram");
			return;
		}

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2)){
			System.out.println("The String is Pallingdrom");
		}else{
			System.out.println("The String is Not-Pallingdrom");
		}
	}
}
