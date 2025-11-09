package hummingbird;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		
		 HashMap<Character, Integer> map = new HashMap<>();

	        // Step 1: Count frequency of each character
	        for (char ch : str.toCharArray()) {
	            if (map.containsKey(ch)) {
	                map.put(ch, map.get(ch) + 1); // increase count if already exists
	            } else {
	                map.put(ch, 1); // first time occurrence
	            }
	        }

	        // Step 2: Print duplicates
	        for (char ch : map.keySet()) {
	            if (map.get(ch) > 1) {
	                System.out.println(ch + " : " + map.get(ch));
	            }
	        }
	}
}
