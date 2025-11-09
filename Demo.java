package q1to10;

import java.util.Scanner;

public class Demo {
	public static void substring(String str, String ans, int index) {
for (int i = index; i < str.length(); i++) {
            
            ans += str.charAt(i);

            
            System.out.println(ans);

            
            substring(str, ans, i + 1);

            
            ans = ans.substring(0, ans.length() - 1);
        }
	}
	
	public static void main(String[] args) {
				System.out.println("Enter the String: ");
				Scanner sc = new Scanner(System.in);
				String st = sc.nextLine();
								
				substring(st,"",0);
	}
}
