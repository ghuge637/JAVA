//7. How to find factorial of a number in Java using recursion and iteration
package q1to10;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int factor = 1;
		while(num!=0) {
			factor *= num;
			num --;
			
		}
		System.out.println(factor);
	}
}
