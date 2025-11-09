package hummingbird;
import java.util.Scanner;
import java.util.HashMap;

public class FrequencyOfEachCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		str = str.replaceAll("[^a-zA-Z]", "");
		
		
		HashMap<Character, Integer> map = new HashMap();
		
		for(char ch: str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else { 
				map.put(ch, 1);
			}
		}
		
		for(char ch: map.keySet()) {
			if(map.get(ch)>1) {
				System.out.println(ch+" "+map.get(ch));
			}
		}
	}
}