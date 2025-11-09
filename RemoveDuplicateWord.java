package hummingbird;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] strArr = str.split("\\s+");
		Set <String> map = new LinkedHashSet<>();
		
		for(String s: strArr) {
			map.add(s.toLowerCase());
		}
		
		for(String s: map) {
			System.out.print(s+" ");
		}
	}
}
